package com.tt.test;

import com.tt.controller.UserController;


import javax.naming.ldap.SortKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/**
 * Created on 2019/11/18 6:44 下午
 *
 * @author lgt
 */
public class Tools  extends   Thread{

    private Socket  socket=null;
     private   UserController uc=null;
     DataOutputStream  dos=null;
     DataInputStream  dis=null;

    public Socket getSocket() {
        return socket;
    }

    public UserController getUc() {
        return uc;
    }

    public DataOutputStream getDos() {
        return dos;
    }

    public DataInputStream getDis() {
        return dis;
    }

    public Tools(Socket  socket, UserController uc) {
        this.uc = uc;
        this.socket=socket;
    }


    @Override
    public  void run() {

            try {
                dos = new DataOutputStream(socket.getOutputStream());
                dis = new DataInputStream(socket.getInputStream());
                int grade = 0;
                int count1 = 10;
                while (true) {
                    int a = dis.read();

                    //登录判断 1为学生
                    if (a == 1) {
                        int sid = dis.read();
                        String pwd = dis.readUTF();
                        System.out.println(pwd);
                        if (uc.stuLoad(sid, pwd)) {
                            dos.write(1);
                            dos.flush();
                        if ("false".equals(uc.run(a,sid).trim())) {
                            //判断学生是否已经在登录中
                           dos.write(50);
                            uc.runChange(a,sid,"true");
                            //学生的三个选择：1-改密码，2-考试，3-查成绩

                                while (true) {
                                    int s = dis.read();
                                    if (s == 1) {
                                        System.out.println("改密码");
                                        int choicePwd=dis.read();
                                        while(true) {
                                            if (choicePwd == 1) {
                                                if (uc.stupwd(sid, dis.readUTF())) {
                                                    dos.write(1);
                                                    dos.flush();
                                                    break;
                                                } else {
                                                    dos.write(0);
                                                    dos.flush();

                                                }
                                            }else if(choicePwd==2){
                                                break;
                                            }

                                        }
                                    } else if (s == 2) {
                                        int grade1 = uc.gradeSelect(sid);
                                        if (grade1 != 232) {
                                            dos.write(0);
                                            dos.flush();
                                        } else {
                                            dos.write(1);
                                            dos.flush();
                                            String ss = uc.stuQues();
                                            String ssss = ss.substring(0, ss.indexOf("----"));

                                            String answer = ss.substring(ss.indexOf("----") + 4);

                                            String[] strings = answer.split(",");
                                            dos.writeUTF(ssss);
                                            dos.flush();

                                            System.out.println("考试中");
                                            for (int i = 0; i < count1; i++) {
                                                if (strings[i].equals(dis.readUTF())) {
                                                    grade++;
                                                }

                                            }
                                            if (uc.gradeUpdate(sid, grade)) {
                                                System.out.println("添加成绩成功");
                                            } else {
                                                System.out.println("添加成绩失败");
                                            }
                                        }
                                    } else if (s == 3) {
                                        System.out.println("看成绩");
                                        int grade1 = uc.gradeSelect(sid);
                                        if (grade1 == -100) {
                                            dos.write(0);
                                            dos.flush();
                                        } else {
                                            dos.write(1);
                                            dos.flush();
                                            dos.write(grade1);
                                            dos.flush();


                                        }
                                    } else if (s == 4) {
                                        System.out.println("id号：" + sid + " 的学生离开了");
                                        break;
                                    }
                                }
                                uc.runChange(a,sid,"false");
                            } else {
                                dos.write(0);
                                dos.flush();
                            }
                        } else {
                            System.out.println("编号为"+sid+"的学生被拒绝了同时登录多次");
                            dos.write(100);
                            dos.flush();
                        }
                    }
                    // 2为管理员登录
                    else if (a == 2) {
                        int sid=dis.read();
                        if (uc.adminLoad(sid, dis.readUTF())) {
                            dos.write(1);
                            dos.flush();
                        if ("false".equals(uc.run(a,sid).trim())) {
                            dos.write(50);
                            uc.runChange(a,sid,"true");
                            dos.flush();

                                int s=dis.read();
                                while (true) {
                                    if (s == 1) {
                                        new Utils(this).stuInfo();
                                        int choice1  = dis.read();
                                        while (true) {
                                            //删除学生
                                            if (choice1 == 1) {
                                                int choiceNum=dis.read();
                                                System.out.println(choiceNum);
                                                for(int i=0;i<choiceNum;i++) {
                                                    int sidDel=dis.read();
                                                    new Utils(this).del(1,sidDel);
                                                    System.out.println(sidDel);
                                                }
                                                dos.writeBoolean(true);
                                                dos.flush();
                                                System.out.println("删除成功");

                                            }
                                            //添加学生
                                            else if (choice1 == 2) {
                                                System.out.println("正在添加新学生");
                                                while(true) {
                                                    int choiceAdd=dis.read();
                                                    if(choiceAdd==1){
                                                    System.out.println("取消添加");
                                                    break;
                                                }else if(choiceAdd==2){
                                                   if(!(new Utils(this).add(1,dis.readUTF(),
                                                           dis.readUTF(), dis.readUTF(), dis.readUTF())))
                                                   {dos.writeBoolean(false);
                                                       dos.flush();
                                                   }
                                                    else {dos.writeBoolean(true);
                                                    dos.flush();
                                                    break;}
                                                }
                                                }

                                            }
                                            //刷新
                                            else if (choice1 == 3) {
                                                new Utils(this).stuInfo();
                                            }
                                            //修改学生信息
                                            else if(choice1==4) {
                                                System.out.println("正在修改学生信息");
                                                int choice = dis.read();
                                                int sid4 = dis.read();
                                                new Utils(this).stuEdit(choice);
                                                while (true) {
                                                    int choiceAd=dis.read();
                                                    if (choiceAd == 1) {
                                                        System.out.println("取消修改");
                                                        break;
                                                    } else if (choiceAd == 2) {

                                                        if (!new Utils(this).edit(1, sid4, dis.readUTF(),
                                                                dis.readUTF(), dis.readUTF(), dis.readUTF())) {
                                                            dos.writeBoolean(false);
                                                            dos.flush();
                                                        } else {
                                                            dos.writeBoolean(true);
                                                            dos.flush();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }else if (choice1 == 5) {
                                                break;
                                            }
                                            choice1  = dis.read();

                                        }
                                    }else if (s == 2) {
                                         new Utils(this).quesInfo();
                                         int choice1=dis.read();
                                         while(true){
                                             //删除题目
                                         if(choice1==1){
                                             int choiceNum=dis.read();
                                             System.out.println(choiceNum);
                                             for(int i=0;i<choiceNum;i++) {
                                                 int sidDel=dis.read();
                                                 new Utils(this).del(2,sidDel);
                                                 System.out.println(sidDel);
                                             }
                                             dos.writeBoolean(true);
                                             dos.flush();
                                             System.out.println("删除成功");

                                         }
                                         //添加题目
                                         else if(choice1==2){
                                             System.out.println("正在添加题目");
                                             while(true) {
                                                 int choiceAdd = dis.read();
                                                 if (choiceAdd == 1) {
                                                     System.out.println("取消添加");
                                                     break;
                                                 }
                                                else if (choiceAdd == 2) {
                                                     if (!new Utils(this).quesAdd(2, dis.readUTF(), dis.readUTF(),
                                                             dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF()))
                                                     {
                                                         dos.writeBoolean(false);
                                                         dos.flush();
                                                     } else {
                                                         dos.writeBoolean(true);
                                                         dos.flush();
                                                         break;
                                                     }
                                                 }
                                             }
                                         }
                                         //刷新
                                         else if(choice1 ==3){new Utils(this).quesInfo();}
                                         //修改题目信息
                                         else if(choice1==4){
                                             System.out.println("正在修改题目");
                                             int choice=dis.read();
                                             int sid4=dis.read();
                                             new Utils(this).quEdit(choice);
                                             while(true){
                                                 int choiceAd=dis.read();
                                                 System.out.println(choiceAd);
                                                 if(choiceAd==1){
                                                     System.out.println("取消修改");
                                                     break;
                                                 }
                                             else if (choiceAd == 2) {
                                                 if (!new Utils(this).quesEdit(2,sid4,dis.readUTF(),
                                                         dis.readUTF(),dis.readUTF(),
                                                         dis.readUTF(),dis.readUTF(),dis.readUTF(),
                                                         dis.readUTF())) {
                                                     dos.writeBoolean(false);
                                                     dos.flush();
                                                 }
                                                 else {dos.writeBoolean(true);
                                                 dos.flush();
                                                 break;
                                             }
                                             }
                                             }
                                         }else if (choice1 == 5) {
                                             break;
                                         }

                                         choice1  = dis.read();
                                     }
                                    } else if (s == 3) {
                                        System.out.println("编号为" + sid + "管理员离开了");
                                        break;
                                    }
                                    s=dis.read();
                                }
                                uc.runChange(a,sid,"false");
                            }else {
                                dos.write(0);
                                dos.flush();
                            }

                        }else {
                            System.out.println("编号为"+sid+"的管理员被拒绝了同时登录多次");
                            dos.write(100);
                            dos.flush();
                        }
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    assert dos != null;
                    dos.close();
                    dis.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
