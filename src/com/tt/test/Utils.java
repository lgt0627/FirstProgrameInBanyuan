package com.tt.test;

import java.io.IOException;

/**
 * Created on 2019/11/25 10:43 上午
 *
 * @author lgt
 */
public class Utils {
    private Tools t;
    public Utils(Tools t){
        this.t=t;
    }
    public  boolean edit(int choice,int sid,String a,String b,String c,String d){
        if(t.getUc().edit(choice,sid,a+b+c+d)){
            System.out.println("成功修改编号为"+a.substring(0,a.indexOf(","))+"的学生信息");
            return true;
        }
        else {
            System.out.println("修改失败");
            return false;
        }
    }
    public  boolean quesEdit(int choice,int sid,String a,String b,String c,String d,String e,String f,String g){
        if(t.getUc().edit(choice,sid,a+b+c+d+e+f+g)){
            System.out.println("成功修改编号为"+a.substring(0,a.indexOf(","))+"的题目信息");
            return true;
        }
        else {
            System.out.println("修改失败");
            return false;
        }
    }
    public void stuEdit(int row) throws IOException {
        Object[][] objects = t.getUc().gen(1);
        t.getDos().write((int) (objects[row][0]));
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][1]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][2]);
        t.getDos().flush();
        t.getDos().write((int) (objects[row][3]));
        t.getDos().flush();
    }
    public void quEdit(int row) throws IOException {
        Object[][] objects = t.getUc().gen(2);
        t.getDos().write((int) (objects[row][0]));
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][1]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][2]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][3]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][4]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][5]);
        t.getDos().flush();
        t.getDos().writeUTF((String) objects[row][6]);
        t.getDos().flush();
    }
    public void stuInfo() throws IOException {

        Object[][] objects = t.getUc().gen(1);
        t.getDos().write(objects.length);
        t.getDos().flush();
        for (int i = 0; i < objects.length; i++) {
            t.getDos().write((int) (objects[i][0]));
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][1]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][2]);
            t.getDos().flush();
            t.getDos().write((int) (objects[i][3]));
            t.getDos().flush();
        }
    }

    public  void quesInfo() throws IOException {
        Object[][] objects = t.getUc().gen(2);
        t.getDos().write(objects.length);
        t.getDos().flush();
        for (int i = 0; i < objects.length; i++) {
            t.getDos().write((int) (objects[i][0]));
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][1]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][2]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][3]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][4]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][5]);
            t.getDos().flush();
            t.getDos().writeUTF((String) objects[i][6]);
            t.getDos().flush();

        }
    }

    public boolean del(int choice,int sid){
        if(t.getUc().del(choice,sid)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean add(int choice,String a,String b,String c,String d){

       if(t.getUc().add(choice,a+b+c+d)){
           System.out.println("成功添加编号为"+a.substring(0,a.indexOf(","))+"的学生");
           return true;
       }
       else {
           System.out.println("添加失败");
           return false;
       }
    }
    public boolean quesAdd(int choice,String a,String b,String c,String d,String e,String f,String g){

        if(t.getUc().add(choice,a+b+c+d+e+f+g)){
            System.out.println("成功添加编号为"+a.substring(0,a.indexOf(","))+"的题目");
            return true;
        }
        else {
            System.out.println("添加失败");
            return false;
        }
    }
}
