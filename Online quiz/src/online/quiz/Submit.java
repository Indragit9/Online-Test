package online.quiz;

import javax.swing.*;
import java.awt.*;

public class Submit extends JFrame {

    JLabel correct, obtained, total;
    int a, b, c;String s, r;
    String k;

    Submit(int a, int b, int c, String s, String r) {
        
        this.a = a;
        this.b = b;
        this. c = c;
        this.s = s;
        this.r = r;

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Result");
        label1.setFont(new Font("tahoma", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(310, 5, 150, 25);
        add(label1);
        panel.setBounds(0, 0, 1000, 30);
        panel.setBackground(new Color(76, 140, 202));
        add(panel);
        
        JLabel name = new JLabel("Name: " + s);
        name.setBounds(35, 70, 400, 21);
        name.setFont(new Font("tahoma", Font.PLAIN, 18));
        name.setForeground(Color.BLACK);
        add(name);
        
        JLabel roll = new JLabel("Roll no.: " + r);
        roll.setBounds(35, 95, 400, 21);
        roll.setFont(new Font("tahoma", Font.PLAIN, 18));
        roll.setForeground(Color.BLACK);
        add(roll);
        
        JLabel exam = new JLabel("Examination: " + "Object Oriented Methodologies");
        exam.setBounds(35, 120, 400, 21);
        exam.setFont(new Font("tahoma", Font.PLAIN, 18));
        exam.setForeground(Color.BLACK);
        add(exam);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(20, 50, 650, 100);
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        add(panel1);

        correct = new JLabel("Correct answers: ");
        correct.setBounds(40, 190, 400, 25);
        correct.setFont(new Font("tahoma", Font.PLAIN, 20));
        correct.setForeground(Color.BLACK);
        add(correct);
        JLabel p1 = new JLabel("Easy: " + a);
        p1.setBounds(130, 220, 400, 25);
        p1.setFont(new Font("tahoma", Font.PLAIN, 20));
        p1.setForeground(Color.BLACK);
        add(p1);
        JLabel p2 = new JLabel("Medium: " + b);
        p2.setBounds(130, 250, 400, 25);
        p2.setFont(new Font("tahoma", Font.PLAIN, 20));
        p2.setForeground(Color.BLACK);
        add(p2);
        JLabel p3 = new JLabel("Hard: " + c);
        p3.setBounds(130, 280, 400, 25);
        p3.setFont(new Font("tahoma", Font.PLAIN, 20));
        p3.setForeground(Color.BLACK);
        add(p3);

        obtained = new JLabel("Marks obtained: ");
        obtained.setBounds(40, 320, 400, 25);
        obtained.setFont(new Font("tahoma", Font.PLAIN, 20));
        obtained.setForeground(Color.BLACK);
        add(obtained);
        
        JLabel pp1 = new JLabel("Easy: " + (a*5));
        pp1.setBounds(130, 350, 400, 25);
        pp1.setFont(new Font("tahoma", Font.PLAIN, 20));
        pp1.setForeground(Color.BLACK);
        add(pp1);
        JLabel pp2 = new JLabel("Medium: " + (b*10));
        pp2.setBounds(130, 380, 400, 25);
        pp2.setFont(new Font("tahoma", Font.PLAIN, 20));
        pp2.setForeground(Color.BLACK);
        add(pp2);
        JLabel pp3 = new JLabel("Hard: " + (c*15));
        pp3.setBounds(130, 410, 400, 25);
        pp3.setFont(new Font("tahoma", Font.PLAIN, 20));
        pp3.setForeground(Color.BLACK);
        add(pp3);

        total = new JLabel("Maximum Marks: 100          Passing Marks: 30");
        total.setBounds(40, 150, 450, 30);
        total.setFont(new Font("tahoma", Font.PLAIN, 20));
        total.setForeground(Color.BLACK);
        add(total);
        
        JLabel marks = new JLabel("Total Marks obtained: " + (a*5 + b*10 + c*15));
        marks.setBounds(40, 450, 400, 25);
        marks.setFont(new Font("tahoma", Font.PLAIN, 20));
        marks.setForeground(Color.BLACK);
        add(marks);
        
        if((a*5 + b*10 + c*15) >= 30) k = "Pass";
        else k = "Fail";
        JLabel result = new JLabel("Result: " + k);
        result.setBounds(280, 495, 400, 25);
        result.setFont(new Font("tahoma", Font.BOLD, 20));
        result.setForeground(Color.BLACK);
        add(result);
        
        JLabel label2 = new JLabel();
        label2.setBounds(30, 800, 0, 0);
        add(label2);

        setLayout(new BorderLayout());
        setTitle("JAVA Online Examination");
        getContentPane().setBackground(Color.white);
        setSize(700, 600);
        setLocation(380, 125);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        new Student(s, r, k, (a*5 + b*10 + c*15));
    }

    public static void main(String args[]) {
        
        new Submit(3, 2, 2, "Indrajeet", "IIT2021082");
    }
}
