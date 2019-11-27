package com.tt.dao.daoImpl;

import com.tt.dao.UserDao;
import com.tt.util.C3p0_Util;
import com.tt.dao.UserDao;
import com.tt.util.C3p0_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tt
 */
public class UserDaoImpl  implements UserDao {

    private Connection con = null;
    private PreparedStatement ps = null;



    @Override
    public boolean add(int choice,String s) {

        try {
            con = C3p0_Util.getCon();
            String sql = "insert  into   StudentInfo(StuID,StuName,StuPwd,Grade)values(?,?,?,?)";
            String sql1="select StuId from StudentInfo";
            String sql2 = "insert  into   QuesInfo(QuesID,QuesName,A,B,C,D,CorrectAnswer)values(?,?,?,?,?,?,?)";
            String sql3="select QuesId from QuesInfo";
           if(choice==1){
               ps = con.prepareStatement(sql1);
            ResultSet rs=ps.executeQuery();
            int a=Integer.parseInt( s.substring(0,s.indexOf(",")));
           while(rs.next()){
               if(rs.getInt(1)==a){
                   return false;
               }
           }
           ps=con.prepareStatement(sql);
           ps.setInt(1,a);
            ps.setString(2,s.substring(s.indexOf(",")+1,s.indexOf(".")));
            ps.setString(3,s.substring(s.indexOf(".")+1,s.indexOf("?")));
            ps.setInt(4,Integer.parseInt(s.substring(s.indexOf("?")+1)));

            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        }
        else if(choice==2){
               ps = con.prepareStatement(sql3);
               ResultSet rs=ps.executeQuery();
               int a=Integer.parseInt( s.substring(0,s.indexOf(",,,")));
               while(rs.next()){
                   if(rs.getInt(1)==a){
                       return false;
                   }
               }
               ps=con.prepareStatement(sql2);
               ps.setInt(1,a);
               ps.setString(2,s.substring(s.indexOf(",,,")+3,s.indexOf("...")));
               ps.setString(3,s.substring(s.indexOf("...")+3,s.indexOf("???")));
               ps.setString(4,s.substring(s.indexOf("???")+3,s.indexOf("!!!")));
               ps.setString(5,s.substring(s.indexOf("!!!")+3,s.indexOf("|||")));
               ps.setString(6,s.substring(s.indexOf("|||")+3,s.indexOf("===")));
               ps.setString(7,s.substring(s.indexOf("===")+3));


               int result = ps.executeUpdate();
               if (result > 0) {
                   return true;
               }
        }}catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;


    }

    @Override
    public boolean del(int choice,int sid) {

        try {
            con = C3p0_Util.getCon();
            String sql = "delete from  StudentInfo  where  StuId=?";
            String sql1="delete from QuesInfo where QuesId=?";
           if(choice==1) {
               ps = con.prepareStatement(sql);
               ps.setInt(1, sid);
               int result = ps.executeUpdate();
               if (result > 0) {
                   return true;
               }
           }else  if(choice==2){
               ps = con.prepareStatement(sql1);
               ps.setInt(1, sid);
               int result = ps.executeUpdate();
               if (result > 0) {
                   return true;
               }
           }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    @Override
    public boolean stuLoad(int sid, String pwd) {
        try {
            con = C3p0_Util.getCon();
            String sql = "select StuId,StuPwd from StudentInfo where StuId=? and StuPwd=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                int stuId = rs.getInt(1);
                String stuPwd = rs.getString(2);
                if (sid == stuId && pwd.equals(stuPwd)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {if(ps!=null) {
                ps.close();
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean adminLoad(int sid, String pwd) {

        try {

            con = C3p0_Util.getCon();
            String sql = "select AdminId,AdminPwd from AdminInfo where AdminId=? and AdminPwd=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                int stuId = rs.getInt(1);
                String stuPwd = rs.getString(2);

                if (sid == stuId && pwd.equals(stuPwd)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    @Override
    public String stuQues() {
        String ss = null;
        StringBuffer sss=new StringBuffer(20000);
        StringBuffer answer=new StringBuffer(200);
        try {
            con = C3p0_Util.getCon();
            String sql = "select  QuesName,A,B,C,D,CorrectAnswer from  QuesInfo  where QuesID=?";
            ps = con.prepareStatement(sql);
            List<Integer> l = new ArrayList<Integer>();
            int i = 0;
            while (l.size() < 10) {
                i = (int) (Math.random() * 30) + 1;
                if (!l.contains(i)) {
                    l.add(i);
                }
            }
int count=0;
            for (int j : l) {
                count++;
                ps.setInt(1, j);
                ResultSet result = ps.executeQuery();
                result.next();
                sss.append("           "+count + ".").append(result.getString(1)).append("\n\n").append("           "+
                        result.getString(2)).append("\n").append("           "+
                        result.getString(3)).append("\n").append("           "+
                        result.getString(4)).append("\n").append("           "+result.getString(5)).append("\n\n");
answer.append(result.getString(6)).append(",");

            }

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        ss = sss.substring(0)+"----"+answer.substring(0);

        return ss;




}



    @Override
    public boolean gradeUpdate(int sid, int grade) {

        try {
            con= C3p0_Util.getCon();
            String  sql="update    StudentInfo set Grade=? where Stuid=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,grade*10);
            ps.setInt(2, sid);
            int  result=ps.executeUpdate();
            if(result>0){
                return true;
            }

        }catch ( Exception  e){

            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    @Override
    public boolean stupwd(int sid, String pwd) {
        try {
        con=C3p0_Util.getCon();
        String sql="update StudentInfo set StuPwd=? where StuId=?";
        ps=con.prepareStatement(sql);
        ps.setString(1,pwd);
        ps.setInt(2,sid);
            int  result=ps.executeUpdate();
            if(result>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int gradeSelect(int sid) {
        int grade=-1;
        try {
            con= C3p0_Util.getCon();
            String  sql="select Grade   from StudentInfo where StuId=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, sid);
           ResultSet rs=ps.executeQuery();
           rs.next();
           grade=rs.getInt(1);


        }catch ( Exception  e){

            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return grade;
    }

    @Override
    public String run(int choice,int sid) {
        String run=null;
        try {
            con= C3p0_Util.getCon();
            String  sql="select Run   from StudentInfo where StuId=?";
            String sql1="select Run   from   AdminInfo where AdminID=?";
            if(choice==1) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, sid);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    run = rs.getString(1);
                }
            }
            else if(choice==2){
                ps = con.prepareStatement(sql1);
                ps.setInt(1, sid);
                ResultSet rs = ps.executeQuery();
                rs.next();
                run = rs.getString(1);
            }

        }catch ( Exception  e){

            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return run;
    }

    @Override
    public boolean runChange(int choice,int sid,String run) {

        try {
            con= C3p0_Util.getCon();
            String  sql="update StudentInfo set Run=? where StuId=?";
            String sql1="update AdminInfo set Run=? where AdminId=?";
            if(choice==1) {
                ps = con.prepareStatement(sql);
                ps.setString(1, run);
                ps.setInt(2, sid);
                int result = ps.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }else if(choice==2){
                ps = con.prepareStatement(sql1);
                ps.setString(1, run);
                ps.setInt(2, sid);
                int result = ps.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        }catch ( Exception  e){

            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    @Override
    public Object[][] gen(int choice) {
        Object [][] object=new Object[400][];
        try {
            con = C3p0_Util.getCon();
            String sql = "select StuId,StuName,StuPwd,Grade from StudentInfo ";
            String sql1 = "select QuesId,QuesName,A,B,C,D,CorrectAnswer from QuesInfo";
            String sql2 = "select count(*) from StudentInfo";
            String sql3 = "select count(*) from QuesInfo";
            if (choice == 1) {
                ps = con.prepareStatement(sql2);
                ResultSet rs = ps.executeQuery();
                rs.next();
                Object [][] objects=new Object[rs.getInt(1)][4];
                ps=con.prepareStatement(sql);
                ResultSet rs1=ps.executeQuery();
                int count1=0;
                while(rs1.next()){
                    objects[count1]=new Object[]{rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getInt(4)};

                    count1++;
                }
                object=objects;
            } else if (choice == 2) {
                ps = con.prepareStatement(sql3);
                ResultSet rs = ps.executeQuery();
                rs.next();
                Object [][] objects=new Object[rs.getInt(1)][7];
                ps=con.prepareStatement(sql1);
                ResultSet rs1=ps.executeQuery();
                int count1=0;
                while(rs1.next()){
                    objects[count1]=new Object[]{rs1.getInt(1),rs1.getString(2),rs1.getString(3)
                    ,rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7)};
                    count1++;
                }
                object=objects;
            }
        }
        catch ( Exception  e){

            e.printStackTrace();
       }
        finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return object;
    }
    @Override
    public boolean edit(int choice,int sid,String s) {
        try {
            con = C3p0_Util.getCon();
            String sql = "update  StudentInfo set StuId=?,StuName=?,StuPwd=?,Grade=? where StuId=? ";
            String sql1 = "update  QuesInfo set  QuesId=?,QuesName=?,A=?,B=?,C=?,D=?,CorrectAnswer=? where QuesId=? ";
           if(choice==1){ ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(s.substring(0,s.indexOf(","))));
            ps.setString(2,s.substring(s.indexOf(",")+1,s.indexOf(".")));
            ps.setString(3,s.substring(s.indexOf(".")+1,s.indexOf("?")));
            ps.setInt(4,Integer.parseInt(s.substring(s.indexOf("?")+1)));
            ps.setInt(5,sid);
            int  result=ps.executeUpdate();
            if(result>0){
                return true;
            }
        }else if(choice==2){ps = con.prepareStatement(sql1);
               ps.setInt(1, Integer.parseInt(s.substring(0,s.indexOf(",,,"))));
               ps.setString(2,s.substring(s.indexOf(",,,")+3,s.indexOf("...")));
               ps.setString(3,s.substring(s.indexOf("...")+3,s.indexOf("???")));
               ps.setString(4,s.substring(s.indexOf("???")+3,s.indexOf("!!!")));
               ps.setString(5,s.substring(s.indexOf("!!!")+3,s.indexOf("|||")));
               ps.setString(6,s.substring(s.indexOf("|||")+3,s.indexOf("===")));
               ps.setString(7,s.substring(s.indexOf("===")+3));
               ps.setInt(8,sid);
               int  result=ps.executeUpdate();
               if(result>0){
                   return true;
               }

           }
        }
        catch ( Exception  e){
            e.printStackTrace();
        }
        finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
