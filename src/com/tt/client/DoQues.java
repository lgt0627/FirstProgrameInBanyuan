package com.tt.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * Created on 2019/11/21 7:01 下午
 *
 * @author lgt
 */
public class DoQues extends javax.swing.JFrame {

    /**
     * Creates new form DO
     */
    public DoQues() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem9 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem12 = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem13 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem14 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem15 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem16 = new javax.swing.JRadioButtonMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jRadioButtonMenuItem17 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem18 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem19 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem20 = new javax.swing.JRadioButtonMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jRadioButtonMenuItem21 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem22 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem23 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem24 = new javax.swing.JRadioButtonMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jRadioButtonMenuItem25 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem26 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem27 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem28 = new javax.swing.JRadioButtonMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jRadioButtonMenuItem29 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem30 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem31 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem32 = new javax.swing.JRadioButtonMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jRadioButtonMenuItem33 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem34 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem35 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem36 = new javax.swing.JRadioButtonMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jRadioButtonMenuItem37 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem38 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem39 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem40 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("欢迎来到学生考试系统");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        try {
            jTextArea1.setText(TestGui.t.dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
        jMenu1.setText("答题卡");


        jMenu3.setText("第一题");
        ButtonGroup group1=new ButtonGroup();
        ButtonGroup group2=new ButtonGroup();
        ButtonGroup group3=new ButtonGroup();
        ButtonGroup group4=new ButtonGroup();
        ButtonGroup group5=new ButtonGroup();
        ButtonGroup group6=new ButtonGroup();
        ButtonGroup group7=new ButtonGroup();
        ButtonGroup group8=new ButtonGroup();
        ButtonGroup group9=new ButtonGroup();
        ButtonGroup group10=new ButtonGroup();
        jRadioButtonMenuItem3.setText("A");
        jRadioButtonMenuItem3.setActionCommand("A");

        jMenu3.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem2.setText("B");jRadioButtonMenuItem2.setActionCommand("B");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem1.setText("C");jRadioButtonMenuItem1.setActionCommand("C");
        jMenu3.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem4.setText("D");jRadioButtonMenuItem4.setActionCommand("D");
        jMenu3.add(jRadioButtonMenuItem4);
        group1.add(jRadioButtonMenuItem1);
        group1.add(jRadioButtonMenuItem2);
        group1.add(jRadioButtonMenuItem3);
        group1.add(jRadioButtonMenuItem4);
        jMenu1.add(jMenu3);

        jMenu4.setText("第二题");

        jRadioButtonMenuItem5.setText("A");
        jRadioButtonMenuItem5.setActionCommand("A");
        jMenu4.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem6.setText("B");jRadioButtonMenuItem6.setActionCommand("B");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem6);

        jRadioButtonMenuItem7.setText("C");jRadioButtonMenuItem7.setActionCommand("C");
        jMenu4.add(jRadioButtonMenuItem7);

        jRadioButtonMenuItem8.setText("D");jRadioButtonMenuItem8.setActionCommand("D");
        jMenu4.add(jRadioButtonMenuItem8);
        group2.add(jRadioButtonMenuItem5);
        group2.add(jRadioButtonMenuItem6);
        group2.add(jRadioButtonMenuItem7);
        group2.add(jRadioButtonMenuItem8);
        jMenu1.add(jMenu4);

        jMenu5.setText("第三题");

        jRadioButtonMenuItem9.setText("A");
        jRadioButtonMenuItem9.setActionCommand("A");
        jMenu5.add(jRadioButtonMenuItem9);

        jRadioButtonMenuItem10.setText("B");jRadioButtonMenuItem10.setActionCommand("B");
        jRadioButtonMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem10);

        jRadioButtonMenuItem11.setText("C");jRadioButtonMenuItem11.setActionCommand("C");
        jMenu5.add(jRadioButtonMenuItem11);

        jRadioButtonMenuItem12.setText("D");jRadioButtonMenuItem12.setActionCommand("D");
        jMenu5.add(jRadioButtonMenuItem12);
        group3.add(jRadioButtonMenuItem9);
        group3.add(jRadioButtonMenuItem10);
        group3.add(jRadioButtonMenuItem11);
        group3.add(jRadioButtonMenuItem12);
        jMenu1.add(jMenu5);

        jMenu6.setText("第四题");

        jRadioButtonMenuItem13.setText("A");
        jRadioButtonMenuItem13.setActionCommand("A");
        jMenu6.add(jRadioButtonMenuItem13);

        jRadioButtonMenuItem14.setText("B");jRadioButtonMenuItem14.setActionCommand("B");
        jRadioButtonMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jRadioButtonMenuItem14);

        jRadioButtonMenuItem15.setText("C");jRadioButtonMenuItem15.setActionCommand("C");
        jMenu6.add(jRadioButtonMenuItem15);

        jRadioButtonMenuItem16.setText("D");jRadioButtonMenuItem16.setActionCommand("D");
        jMenu6.add(jRadioButtonMenuItem16);
        group4.add(jRadioButtonMenuItem16);
        group4.add(jRadioButtonMenuItem15);
        group4.add(jRadioButtonMenuItem14);
        group4.add(jRadioButtonMenuItem13);
        jMenu1.add(jMenu6);

        jMenu7.setText("第五题");

        jRadioButtonMenuItem17.setText("A");
        jRadioButtonMenuItem17.setActionCommand("A");
        jMenu7.add(jRadioButtonMenuItem17);

        jRadioButtonMenuItem18.setText("B");jRadioButtonMenuItem18.setActionCommand("B");
        jRadioButtonMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jRadioButtonMenuItem18);

        jRadioButtonMenuItem19.setText("C");jRadioButtonMenuItem19.setActionCommand("C");
        jMenu7.add(jRadioButtonMenuItem19);

        jRadioButtonMenuItem20.setText("D");jRadioButtonMenuItem20.setActionCommand("D");
        jMenu7.add(jRadioButtonMenuItem20);
        group5.add(jRadioButtonMenuItem20);
        group5.add(jRadioButtonMenuItem19);
        group5.add(jRadioButtonMenuItem18);
        group5.add(jRadioButtonMenuItem17);
        jMenu1.add(jMenu7);

        jMenu8.setText("第六题");

        jRadioButtonMenuItem21.setText("A");
        jRadioButtonMenuItem21.setActionCommand("A");
        jMenu8.add(jRadioButtonMenuItem21);

        jRadioButtonMenuItem22.setText("B");jRadioButtonMenuItem22.setActionCommand("B");
        jRadioButtonMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem22ActionPerformed(evt);
            }
        });
        jMenu8.add(jRadioButtonMenuItem22);

        jRadioButtonMenuItem23.setText("C");jRadioButtonMenuItem23.setActionCommand("C");
        jMenu8.add(jRadioButtonMenuItem23);

        jRadioButtonMenuItem24.setText("D");jRadioButtonMenuItem24.setActionCommand("D");
        jMenu8.add(jRadioButtonMenuItem24);
        group6.add(jRadioButtonMenuItem24);
        group6.add(jRadioButtonMenuItem23);
        group6.add(jRadioButtonMenuItem22);
        group6.add(jRadioButtonMenuItem21);
        jMenu1.add(jMenu8);

        jMenu9.setText("第七题");

        jRadioButtonMenuItem25.setText("A");
        jRadioButtonMenuItem25.setActionCommand("A");
        jMenu9.add(jRadioButtonMenuItem25);

        jRadioButtonMenuItem26.setText("B");jRadioButtonMenuItem26.setActionCommand("B");
        jRadioButtonMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem26ActionPerformed(evt);
            }
        });
        jMenu9.add(jRadioButtonMenuItem26);

        jRadioButtonMenuItem27.setText("C");jRadioButtonMenuItem27.setActionCommand("C");
        jMenu9.add(jRadioButtonMenuItem27);

        jRadioButtonMenuItem28.setText("D");jRadioButtonMenuItem28.setActionCommand("D");
        jMenu9.add(jRadioButtonMenuItem28);
        group7.add(jRadioButtonMenuItem28);
        group7.add(jRadioButtonMenuItem27);
        group7.add(jRadioButtonMenuItem26);
        group7.add(jRadioButtonMenuItem25);
        jMenu1.add(jMenu9);

        jMenu10.setText("第八题");

        jRadioButtonMenuItem29.setText("A");
        jRadioButtonMenuItem29.setActionCommand("A");
        jMenu10.add(jRadioButtonMenuItem29);

        jRadioButtonMenuItem30.setText("B");jRadioButtonMenuItem30.setActionCommand("B");
        jRadioButtonMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem30ActionPerformed(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem30);

        jRadioButtonMenuItem31.setText("C");jRadioButtonMenuItem31.setActionCommand("C");
        jMenu10.add(jRadioButtonMenuItem31);

        jRadioButtonMenuItem32.setText("D");jRadioButtonMenuItem32.setActionCommand("D");
        jMenu10.add(jRadioButtonMenuItem32);
        group8.add(jRadioButtonMenuItem32);
        group8.add(jRadioButtonMenuItem31);
        group8.add(jRadioButtonMenuItem30);
        group8.add(jRadioButtonMenuItem29);
        jMenu1.add(jMenu10);

        jMenu11.setText("第九题");

        jRadioButtonMenuItem33.setText("A");
        jRadioButtonMenuItem33.setActionCommand("A");
        jMenu11.add(jRadioButtonMenuItem33);

        jRadioButtonMenuItem34.setText("B");jRadioButtonMenuItem34.setActionCommand("B");
        jRadioButtonMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem34ActionPerformed(evt);
            }
        });
        jMenu11.add(jRadioButtonMenuItem34);

        jRadioButtonMenuItem35.setText("C");jRadioButtonMenuItem35.setActionCommand("C");
        jMenu11.add(jRadioButtonMenuItem35);

        jRadioButtonMenuItem36.setText("D");jRadioButtonMenuItem36.setActionCommand("D");
        jMenu11.add(jRadioButtonMenuItem36);
        group9.add(jRadioButtonMenuItem36);
        group9.add(jRadioButtonMenuItem35);
        group9.add(jRadioButtonMenuItem34);
        group9.add(jRadioButtonMenuItem33);
        jMenu1.add(jMenu11);

        jMenu12.setText("第十题");

        jRadioButtonMenuItem37.setText("A");
        jRadioButtonMenuItem37.setActionCommand("A");
        jMenu12.add(jRadioButtonMenuItem37);

        jRadioButtonMenuItem38.setText("B");jRadioButtonMenuItem38.setActionCommand("B");
        jRadioButtonMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem38ActionPerformed(evt);
            }
        });
        jMenu12.add(jRadioButtonMenuItem38);

        jRadioButtonMenuItem39.setText("C");jRadioButtonMenuItem39.setActionCommand("C");
        jMenu12.add(jRadioButtonMenuItem39);

        jRadioButtonMenuItem40.setText("D");jRadioButtonMenuItem40.setActionCommand("D");
        
        jMenu12.add(jRadioButtonMenuItem40);
        group10.add(jRadioButtonMenuItem40);
        group10.add(jRadioButtonMenuItem39);
        group10.add(jRadioButtonMenuItem38);
        group10.add(jRadioButtonMenuItem37);
        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("提交");
        jMenu2.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                if (group1.getSelection() == null || group2.getSelection() == null || group3.getSelection() == null || group4.getSelection() == null
                        || group5.getSelection() == null || group6.getSelection() == null || group7.getSelection() == null || group8.getSelection() == null
                        || group9.getSelection() == null || group10.getSelection() == null) {
                    JOptionPane.showMessageDialog(DoQues.this, "请回答完所有题", "waring", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {

                        TestGui.t.dos.writeUTF(group1.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group2.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group3.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group4.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group5.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group6.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group7.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group8.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group9.getSelection().getActionCommand());
                        TestGui.t.dos.writeUTF(group10.getSelection().getActionCommand());

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(DoQues.this,"答案提交完毕，即将跳转上一页面",
                            "message",JOptionPane.INFORMATION_MESSAGE);
                    Point choice=new Point();
                    choice= DoQues.this.getLocation();
                    DoQues.this.setVisible(false);
                    TestGui.stuChoice1.setVisible(true);
                    TestGui.stuChoice1.setLocation(choice);
                }


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jMenuBar1.add(jMenu2);


        jMenu13.setText("");
        jMenu13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {


            }
        });
        jMenuBar1.add(jMenu13);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(233, 233, 233)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoQues().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem12;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem13;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem14;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem15;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem16;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem17;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem18;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem19;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem20;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem21;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem22;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem23;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem24;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem25;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem26;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem27;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem28;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem29;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem30;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem31;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem32;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem33;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem34;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem35;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem36;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem37;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem38;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem39;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem40;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
