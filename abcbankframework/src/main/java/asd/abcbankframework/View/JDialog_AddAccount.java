package asd.abcbankframework.View;

import javax.swing.*;

public class JDialog_AddAccount extends JDialog {
    private MainView parentFrame;
    javax.swing.JLabel JLabel1 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel2 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel3 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel4 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel5 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel6 = new javax.swing.JLabel();
    javax.swing.JLabel JLabel7 = new javax.swing.JLabel();
    javax.swing.JTextField JTextField_NAME = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_CT = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_ST = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_STR = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_ZIP = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_NoOfEmp = new javax.swing.JTextField();
    javax.swing.JTextField JTextField_EM = new javax.swing.JTextField();
    javax.swing.JButton JButton_OK = new javax.swing.JButton();
    javax.swing.JButton JButton_Cancel = new javax.swing.JButton();
    javax.swing.JLabel JLabel8 = new javax.swing.JLabel();
    javax.swing.JTextField JTextField_ACNR = new javax.swing.JTextField();

    public void setParentFrame(MainView parentFrame) {
        this.parentFrame = parentFrame;
    }

    public JDialog_AddAccount(MainView parentFrame){
        super(parentFrame);
        this.parentFrame = parentFrame;

        JLabel1.setText("Name");
        getContentPane().add(JLabel1);
        JLabel1.setForeground(java.awt.Color.black);
        JLabel1.setBounds(12,96,48,24);
        JLabel2.setText("Street");
        getContentPane().add(JLabel2);
        JLabel2.setForeground(java.awt.Color.black);
        JLabel2.setBounds(12,120,48,24);
        JLabel3.setText("City");
        getContentPane().add(JLabel3);
        JLabel3.setForeground(java.awt.Color.black);
        JLabel3.setBounds(12,144,48,24);
        JLabel4.setText("State");
        getContentPane().add(JLabel4);
        JLabel4.setForeground(java.awt.Color.black);
        JLabel4.setBounds(12,168,48,24);
        JLabel5.setText("Zip");
        getContentPane().add(JLabel5);
        JLabel5.setForeground(java.awt.Color.black);
        JLabel5.setBounds(12,192,48,24);
        JLabel6.setText("No of employees");
        getContentPane().add(JLabel6);
        JLabel6.setForeground(java.awt.Color.black);
        JLabel6.setBounds(12,216,96,24);
        JLabel7.setText("Email");
        getContentPane().add(JLabel7);
        JLabel7.setForeground(java.awt.Color.black);
        JLabel7.setBounds(12,240,48,24);
        getContentPane().add(JTextField_NAME);
        JTextField_NAME.setBounds(120,96,156,20);
        getContentPane().add(JTextField_CT);
        JTextField_CT.setBounds(120,144,156,20);
        getContentPane().add(JTextField_ST);
        JTextField_ST.setBounds(120,168,156,20);
        getContentPane().add(JTextField_STR);
        JTextField_STR.setBounds(120,120,156,20);
        getContentPane().add(JTextField_ZIP);
        JTextField_ZIP.setBounds(120,192,156,20);
        getContentPane().add(JTextField_NoOfEmp);
        JTextField_NoOfEmp.setBounds(120,216,156,20);
        getContentPane().add(JTextField_EM);
        JTextField_EM.setBounds(120,240,156,20);
        JButton_OK.setText("OK");
        JButton_OK.setActionCommand("OK");
        getContentPane().add(JButton_OK);
        JButton_OK.setBounds(48,276,84,24);
        JButton_Cancel.setText("Cancel");
        JButton_Cancel.setActionCommand("Cancel");
        getContentPane().add(JButton_Cancel);
        JButton_Cancel.setBounds(156,276,84,24);
        JLabel8.setText("Acc Nr");
        getContentPane().add(JLabel8);
        JLabel8.setForeground(java.awt.Color.black);
        JLabel8.setBounds(12,72,48,24);
        getContentPane().add(JTextField_ACNR);
        JTextField_ACNR.setBounds(120,72,156,20);
    }

    public void addCheckbox(JPanel panel){
        add(panel);
    }
}
