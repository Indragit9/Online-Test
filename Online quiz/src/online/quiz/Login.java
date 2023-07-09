package online.quiz;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules;
    JTextField entername, enterroll;
    JDialog d = new JDialog();
    JLabel l = new JLabel("       Please fill all the required fields");
        

    Login() {
        ImageIcon background = new ImageIcon(getClass().getResource("bac.png"));
        
        JLabel backk = new JLabel();
        backk.setIcon(background);
        backk.setBounds(0, 0, 800, 600);
        
        JLabel heading = new JLabel("Online Examination");
        heading.setBounds(200, 10, 420, 60);
        heading.setFont(new Font("tahoma", Font.PLAIN, 40));
        heading.setHorizontalAlignment(JLabel.CENTER);
        add(heading);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("profile1.png"));
        JLabel ic = new JLabel();
        ic.setIcon(icon);
        ic.setBounds(345, 80, 110, 110);
        add(ic);
        
        JLabel name = new JLabel("Name:");
        name.setBounds(300, 210, 200, 20);
        name.setFont(new Font("ariel", Font.BOLD, 15));
        add(name);
        
        entername = new JTextField();
        entername.setBounds(300, 240, 200, 25);
        entername.setFont(new Font("ariel", Font.PLAIN, 15));
        entername.setForeground(Color.BLACK);
        entername.setBackground(Color.WHITE);
        add(entername);  
        
        JLabel roll = new JLabel("Roll-Number:");
        roll.setBounds(300, 270, 200, 20);
        roll.setFont(new Font("ariel", Font.BOLD, 15));
        add(roll);
        
        enterroll = new JTextField();
        enterroll.setBounds(300, 300, 200, 25);
        enterroll.setFont(new Font("arial", Font.PLAIN, 15));
        enterroll.setForeground(Color.BLACK);
        enterroll.setBackground(Color.WHITE);
        add(enterroll);
        
        JLabel prompt = new JLabel("*Please provide your credentials");
        prompt.setBounds(290, 500, 250, 20);
        prompt.setFont(new Font("ariel", Font.PLAIN, 15));
        add(prompt);
        

        rules = new JButton("Login");
        rules.setBounds(300, 400, 200, 25);
        rules.setFont(new Font("calibri", Font.BOLD, 15));
        rules.setBackground(new Color(84, 154, 212));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        rules.setFocusPainted(false);
        add(rules);
        
        
        d.setSize(300, 100);
        d.add(l);
        
        add(backk);
        setTitle("JAVA Online Examination");
        setSize(800, 600);
        setLocation(350, 100);
        setLayout(null);        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == rules) {
            if(enterroll.getText().equals("") || entername.getText().equals("")){
            d.setLocation(600, 360);
            d.setVisible(true);
            }
            else{
            String s = entername.getText();
            String r = enterroll.getText();
            setVisible(false);
            new Rules(s, r);
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}