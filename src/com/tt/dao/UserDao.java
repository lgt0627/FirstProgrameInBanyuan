package com.tt.dao;


import java.util.List;

/**
 * @author tt
 */
public interface UserDao {

boolean edit(int choice,int sid,String s);
    boolean add(int choice,String s);
    //管理员可以添加学生
    boolean  del(int choice,int  sid);
    //根据学生编号来删除学生

    boolean stuLoad(int sid,String pwd);
    //学生登录

    boolean adminLoad(int sid,String pwd);
    //管理员登录
    String stuQues();
    //考生做题
    boolean gradeUpdate(int sid,int grade);
    //计算分数
    boolean stupwd(int sid,String pwd);
    int gradeSelect(int sid);
    String run(int choice,int sid);

    boolean runChange(int choice,int sid,String run);
    Object[][] gen(int choice);

}
