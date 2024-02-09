/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentjava;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class SignUP extends javax.swing.JFrame {

    /**
     * Creates new form SignUP
     */
    
    public boolean OK ; 
    public ArrayList<Employee> list_Employee =new ArrayList<>(); 
    public ArrayList<Student> list_Students =new ArrayList<>(); 

    
    
    
    public SignUP() {
        initComponents();
        
        
        this.setTitle("Sigh UP");
        this.setVisible(false); 
        this.setLayout(null); 
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.yellow);
        
        this.txt_company.setVisible(false);
        this.txt_jop.setVisible(false);
        this.txt_salary.setVisible(false);

        this.txt_college.setVisible(false);
        this.txt_university.setVisible(false);
        this.txt_year.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_pass1 = new javax.swing.JPasswordField();
        txt_phone = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_pass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_jop = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_college = new javax.swing.JTextField();
        txt_university = new javax.swing.JTextField();
        txt_company = new javax.swing.JTextField();
        txt_year = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Welcome");

        txt_id.setText("ID ");

        txt_gender.setText("Gender");

        txt_address.setText("Address");

        txt_pass1.setText("0000");

        txt_phone.setText("Phone");

        txt_name.setText("Name");

        txt_age.setText("Age ");

        txt_email.setText("Email");

        txt_pass2.setText("0000");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Sign UP ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_jop.setText("JOP");

        txt_salary.setText("Salary ");
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });

        txt_college.setText("College ");

        txt_university.setText("University ");

        txt_company.setText("Company ");

        txt_year.setText("Year ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_jop)
                                    .addComponent(txt_phone)
                                    .addComponent(txt_company, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txt_salary))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_age)
                                .addComponent(txt_name)
                                .addComponent(txt_email)
                                .addComponent(txt_college)
                                .addComponent(txt_university, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txt_year))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_pass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jop, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_college, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_company, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_university, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        OK =true; 
        this.txt_university.setVisible(false);
        this.txt_year.setVisible(false);
        this.txt_college.setVisible(false);
        
        this.txt_company.setVisible(true);
        this.txt_jop.setVisible(true);
        this.txt_salary.setVisible(true);

        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        OK =false; 
        
        
        this.txt_company.setVisible(false);
        this.txt_jop.setVisible(false);
        this.txt_salary.setVisible(false);

        this.txt_university.setVisible(true);
        this.txt_year.setVisible(true);
        this.txt_college.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
  public boolean isInteger(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        Long l = Long.valueOf(s);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }
  
  public boolean isDouble(String s) {
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '.' && c-- > 0)) {
                return false;
            }
        }
        return true;
    }
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
                if (OK) {
                 if (txt_pass1.getText().equals(txt_pass2.getText())
                    && !txt_id.getText().equals("")
                    && !txt_age.getText().equals("") 
                    && !txt_phone.getText().equals("") 
                    && !txt_name.getText().equals("") 
                    && !txt_gender.getText().equals("") 
                    && !txt_address.getText().equals("") 
                    && !txt_email.getText().equals("") 
                    && !txt_pass1.getText().equals("") 
                    && !txt_pass2.getText().equals("") 
                    && !txt_company.getText().equals("") 
                    && !txt_salary.getText().equals("")
                    && !txt_salary.getText().equals("")
                    && isInteger(txt_id.getText()) 
                    && isInteger(txt_age.getText()) 
                    && isInteger(txt_phone.getText()) 
                    && isInteger(txt_salary.getText())) {
                Employee E = new Employee(Integer.valueOf(txt_id.getText()), 
                                          txt_name.getText(),
                                          txt_gender.getText(), 
                                          Integer.valueOf(txt_age.getText()), 
                                          txt_address.getText(), 
                                          txt_email.getText(), 
                                          txt_pass1.getText(), 
                                          Integer.valueOf(txt_phone.getText()),
                                          txt_jop.getText(), 
                                          txt_company.getText(), 
                                          Double.valueOf(txt_salary.getText()));
                list_Employee.add(E); 
                JOptionPane.showMessageDialog(null, "Sussefuly!");

                txt_id.setText("");
                txt_age.setText("");
                txt_phone.setText("");
                txt_name.setText("");
                txt_gender.setText("");
                txt_address.setText("");
                txt_email.setText("");
                txt_pass1.setText("");
                txt_pass2.setText("");
                txt_jop.setText("");
                txt_company.setText("");
                txt_salary.setText("");
               
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (txt_pass1.getText().equals(txt_pass2.getText()) 
                    && !txt_id.getText().equals("") 
                    && !txt_age.getText().equals("") 
                    && !txt_phone.getText().equals("") 
                    && !txt_name.getText().equals("") 
                    && !txt_gender.getText().equals("") 
                    && !txt_address.getText().equals("") 
                    && !txt_email.getText().equals("") 
                    && !txt_pass1.getText().equals("") 
                    && !txt_pass2.getText().equals("") 
                    && !txt_college.getText().equals("") 
                    && !txt_university.getText().equals("")
                    && !txt_year.getText().equals("")
                    && isInteger(txt_id.getText()) 
                    && isInteger(txt_age.getText())
                    && isInteger(txt_phone.getText())) {
                Student St = new Student(Integer.valueOf(txt_id.getText()), 
                                         txt_name.getText(), 
                                         txt_gender.getText(),
                                         Integer.valueOf(txt_age.getText()), 
                                         txt_address.getText(), 
                                         txt_email.getText(), 
                                         txt_pass1.getText(), 
                                         Integer.valueOf(txt_phone.getText()), 
                                        Integer.valueOf(txt_year.getText()) , 
                                        txt_college.getText(), 
                                        txt_university.getText());
                list_Students.add(St);
                JOptionPane.showMessageDialog(null, "Down Successfuly");
                 
                txt_id.setText("");
                txt_age.setText("");
                txt_phone.setText("");
                txt_name.setText("");
                txt_gender.setText("");
                txt_address.setText("");
                txt_email.setText("");
                txt_pass1.setText("");
                txt_pass2.setText("");
                txt_university.setText("");
                txt_year.setText("");
                txt_college.setText("");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        
        
                }
        
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_college;
    private javax.swing.JTextField txt_company;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jop;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass1;
    private javax.swing.JPasswordField txt_pass2;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_university;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
