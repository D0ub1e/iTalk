package client.frame;

import javax.swing.*;

/**
 * Created by double2 on 2016/12/20.
 */
public class Chat extends JFrame{
    JLabel label1,label2;
    ImageIcon imageIcon1,imageIcon2;
    JTextField textField1,textField2;
    JTextArea textArea;
    JButton button1,button2;

    public void  init(){

        textArea= new JTextArea();
        textArea.setBounds(200,30,690,450);
        this.add(textArea);


        button1 = new JButton("发送");
        button1.setBounds(780,520,80,50);
        this.add(button1);


        this.setLayout(null);
        this.setBounds(300,150,900,600);
        this.setTitle("聊天界面");
        // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);



    }  public static void main(String[] args) {
        new Chat().init();
    }
}
