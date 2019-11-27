package com.tt.service;

/**
 * @author tt
 */
public interface UserService {

    boolean   add(int choice,String student);


boolean edit(int choice,int sid,String s);
    boolean  del(int choice,int  sid);

    boolean  stuLoad(int sid,String pwd);
    boolean adminLoad(int sid,String pwd);
    String stuQues();
    boolean gradeUpdate(int sid,int grade);
    boolean  stupwd(int sid,String pwd);
    int gradeSelect(int sid);
    String run(int choice,int sid);
    boolean runChange(int choice,int sid,String run);
    Object [][] gen(int choice);
}
