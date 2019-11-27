package com.tt.controller;
import com.tt.service.UserService;
import com.tt.service.serviceImpl.UserServiceImpl;

/**
 * @author tt
 */
public class UserController {

    UserService   us=new UserServiceImpl();
public boolean edit(int choice,int sid,String s){
    return us.edit(choice,sid,s);
}
    public  boolean   add(int choice,String stu) {

        if (us.add(choice,stu)) {
            return true;
        } else {
            return false;
        }
    }

        public boolean stupwd ( int sid, String pwd){
     if(us.stupwd(sid,pwd)){
         System.out.println("密码修改成功");
         return true;

     }
       else {
    return false;
     }
    }

        public boolean del ( int choice,int sid){
            if (us.del(choice,sid)) {

                return true;
            } else {
                return false;
            }
        }
        public boolean stuLoad ( int sid, String pwd){
            if (us.stuLoad(sid, pwd)) {

                System.out.println("id号：" + sid + " 的学生登录成功");
                return true;

            } else {
                return false;
            }
        }
        public boolean adminLoad ( int sid, String pwd){

            if (us.adminLoad(sid, pwd)) {

                System.out.println("id号：" + sid + " 的管理员登录成功");
                return true;

            } else {
                return false;
            }
        }
        public String stuQues () {
            return us.stuQues();
        }


        public boolean gradeUpdate ( int sid, int grade){
            if (us.gradeUpdate(sid, grade)) {

                return true;
            } else {
                return false;
            }
        }
        public int gradeSelect(int sid){

            return  us.gradeSelect(sid);

        }
        public  String run(int choice,int sid){
        return us.run(choice,sid);
        }
        public boolean runChange(int choice,int sid,String run){
        return  us.runChange(choice,sid,run);
        }
    public  Object[][] gen(int choice){
        return  us.gen(choice);
    }

}
