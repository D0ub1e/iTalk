package client.frame;

import javax.swing.*;

/**
 * Created by double2 on 2016/12/20.
 */
public class Login extends JFrame {
    JLabel label1,label2;
    ImageIcon imageIcon1,imageIcon2;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2;

    public void  init(){


        textField = new JTextField(30);
        textField.setBounds(200,80,180,30);
        this.add(textField);

        passwordField = new JPasswordField(30);
        passwordField.setBounds(200,130,180,30);
        this.add(passwordField);

        button1 = new JButton("注册");
        button1.setBounds(100,200,80,30);
        this.add(button1);
        button2 = new JButton("登陆");
        button2.setBounds(200,200,80,30);
        this.add(button2);

            this.setLayout(null);
        this.setBounds(520,200,400,300);
        this.setTitle("欢迎登陆");
       // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);



    }
    public static void main(String[] args) {
        new Login().init();
    }
}
