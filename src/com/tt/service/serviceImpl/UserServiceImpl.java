package com.tt.service.serviceImpl;

import com.tt.dao.UserDao;
import com.tt.dao.daoImpl.UserDaoImpl;
import com.tt.service.UserService;


/**
 * @author edz
 */
public class UserServiceImpl implements UserService {


    UserDao ud = new UserDaoImpl();

    @Override
    public boolean add(int choice,String student) {


        if (ud.add(choice,student)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(int choice,int sid, String s) {
        return ud.edit(choice,sid,s);
    }

    @Override
    public boolean del(int choice,int sid) {
        System.out.println("正在删除编号为"+sid+"的学生");
        if (ud.del(choice,sid)) {
            return true;
        }
        return false;

    }

    @Override
    public boolean stuLoad(int sid, String pwd) {

        System.out.println("编号为"+sid+"的学生正在登录中");
        if (ud.stuLoad(sid, pwd)) {

            return true;
        }

        return false;

    }

    @Override
    public boolean adminLoad(int sid, String pwd) {
        System.out.println("管理员登录中");
        if (ud.adminLoad(sid, pwd)) {
            return true;
        }
        return false;
    }

    @Override
    public String stuQues() {
        return ud.stuQues();
    }

    @Override
    public boolean gradeUpdate(int sid, int grade) {
        System.out.println("正在给编号为"+sid+"的同学考完试，给他加成绩中");
        if(ud.gradeUpdate(sid,grade)){
            return true;
        }
        return false;
    }

    @Override
    public boolean stupwd(int sid, String pwd) {
        System.out.println("正在给编号为"+sid+"的同学改密码");
        if(ud.stupwd(sid,pwd)){
            return true;
        }
        return false;
    }

    @Override
    public int gradeSelect(int sid) {
        System.out.println("编号为"+sid+"的同学查看自己的成绩");
        return  ud.gradeSelect(sid);
    }

    @Override
    public String run(int choice,int sid) {
        return ud.run(choice,sid);
    }

    @Override
    public boolean runChange(int choice,int sid,String run) {
       return ud.runChange( choice,sid,run);
    }

    @Override
    public Object[][] gen(int choice) {
        return ud.gen(choice);
    }


}
