package online.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton start, back;
    String s, r;
    Rules(String s, String r) {
        this.s = s;
        this.r = r;
        
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Rules and Instructions for the Online Test");
        label1.setFont(new Font("tahoma", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(185, 5, 500, 25);
        add(label1);
        panel.setBounds(0, 0, 1000, 30);
        panel.setBackground(new Color(76, 140, 202));
        add(panel);

        
        JLabel heading = new JLabel(s + ", welcome to the test !!!");
        heading.setBounds(30, 60, 750, 45);
        heading.setFont(new Font("tahoma", Font.BOLD, 35));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(40, 120, 760, 500);
        rules.setFont(new Font("times new roman", Font.PLAIN, 20));
        rules.setText(
                "<html>"
                +"<b>"+"Rules and Regulations:"+"</b>" + "<br><br>"
                + "1. Candidates are required to carry "+"<b>"+" valid ID cards "+"</b>"+" during the examination" + "<br>"
                + "2. Do"+"<b>"+" NOT "+"</b>"+"carry any rough paper or paper sheets during the examination" + "<br>"
                + "3. Students should " +"<b>"+"NOT"+"</b>"+ " carry any electronics devices such as mobile phones, calculators, smart watches" + "<br>"
                + "4. If someone is found breaking the rules and regulations,"+"<b>"+" strict action will be taken "+"</b>"+"against those students" + "<br><br>"
                + "<b>"+"Instructions for the test:"+"</b>" + "<br><br>"
                + "1. You can bookmark a question to review later." + "<br>"
                + "2. Once answer is submitted of a question you cannot visit the queestion again." + "<br>"
                + "3. First three questions (1, 2, 3) are of Good type and has 5 marks each" + "<br>"
                + "4. Next four questions (4, 5, 6, 7) are of Tough type and has 10 marks each" + "<br>"
                + "5. Last three questions (8, 9, 10) are of Complex type and has 15 marks each" + "<br>"
                + "6. All the questions are compulsory." + "<br><br><br>" 
                + "<b><center>"
                + "***** Best of Luck for the Examination *****" + "<br>"
                + "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(480, 640, 75, 20);
        back.setFont(new Font("calibri", Font.BOLD, 15));
        back.setBackground(new Color(49, 114, 182));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFocusPainted(false);
        add(back);

        start = new JButton("Start");
        start.setBounds(605, 640, 75, 20);
        start.setFont(new Font("calibri", Font.BOLD, 15));
        start.setBackground(new Color(49, 114, 182));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        start.setFocusPainted(false);
        add(start);
        
        setTitle("JAVA Online Examination");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800, 720);
        setLocation(300, 20);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Login();
        } else if (e.getSource() == start) {
            setVisible(false);
            new Quiz(s, r);
        }
    }

    public static void main(String args[]) {
        new Rules("User", "IIT2021082");
    }
}
