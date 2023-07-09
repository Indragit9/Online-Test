package online.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JButton[] b = new JButton[10];
    JLabel timerr, qno, question, type;
    Questions questions = new Questions();
    
    String userans[][] = new String[10][1];
    
    int count = 0, marks1 = 0, marks2 = 0, marks3 = 0;
    boolean isVisited[] = new boolean[10];
    ButtonGroup bg, bg1;
    JRadioButton[] o = new JRadioButton[4];
    JRadioButton mark;
    JButton next, submit, save;

    JLabel timelabel = new JLabel();    
    int time = 120000;
    int seconds = 0;
    int minutes = 2;
    String second_string = String.format("%02d", seconds);
    String minute_string = String .format("%02d", minutes);
    Timer timer = new Timer(1000,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(time==1000){
                timer.stop();
            }
            time = time - 1000;
            minutes = (time/60000)%60;
            seconds = (time/1000)%60;
            second_string = String.format("%02d", seconds);
            minute_string = String .format("%02d", minutes);
            timelabel.setText(minute_string+":"+second_string);
        }
        
    });
    
    String s, r;
    Quiz(String s, String r) {
        this.s = s;
        this.r = r;
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1000, 30);
        panel.setBackground(new Color(76, 140, 202));
        add(panel);
        JLabel label1 = new JLabel("Online Examination");
        label1.setFont(new Font("tahoma", Font.BOLD, 20));
        label1.setForeground(Color.white);
        panel.add(label1);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("profile2.png"));
        JLabel ic = new JLabel();
        ic.setIcon(icon);
        ic.setBounds(700, 50, 90, 95);
        add(ic);
        
        timerr = new JLabel("Time Remaining:");
        timerr.setFont(new Font("tahoma", Font.BOLD, 18));
        timerr.setBounds(800, 60, 250, 25);
        add(timerr);
        
        timelabel.setText(minute_string+":"+second_string);
        timelabel.setFont(new Font("tahoma", Font.BOLD, 16));
        timelabel.setBounds(800, 85, 250, 22);
        add(timelabel);
        
        JLabel name = new JLabel(s);
        name.setFont(new Font("tahoma", Font.PLAIN, 16));
        name.setBounds(800, 105, 250, 22);
        add(name);
        
        type = new JLabel();
        type.setFont(new Font("tahoma", Font.PLAIN, 20));
        type.setBounds(35, 50, 250, 22);
        add(type);
        
        JLabel roll = new JLabel(r);
        roll.setFont(new Font("tahoma", Font.PLAIN, 14));
        roll.setBounds(800, 122, 250, 22);
        add(roll);

        qno = new JLabel();
        qno.setBounds(20, 100, 50, 30);
        qno.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(qno);

        question = new JLabel();
        question.setBounds(70, 100, 600, 50);
        question.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(question);
        
        bg = new ButtonGroup();
        for(int i=0;i<4;i++){
            o[i] = new JRadioButton();
            o[i].setBounds(70, 200+(i*40), 500, 30);
            o[i].setBackground(Color.WHITE);
            o[i].setFont(new Font("tahoma", Font.PLAIN, 20));
            o[i].setFocusPainted(false);
            bg.add(o[i]);
            add(o[i]);
        }
        bg.clearSelection();

        next = new JButton("Next ->");
        next.setBounds(180, 500, 120, 25);
        next.setBackground(new Color(49, 114, 182));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("calibri", Font.BOLD, 15));
        next.addActionListener(this);
        add(next);
        
        bg1 = new ButtonGroup();
        mark = new JRadioButton("Bookmark");
        mark.setBounds(50, 500, 120, 25);
        mark.setBackground(new Color(49, 114, 182));
        mark.setForeground(Color.WHITE);
        mark.setFont(new Font("calibri", Font.BOLD, 15));
        mark.addActionListener(this);
        mark.setFocusPainted(false);
        next.setFocusPainted(false);
        add(mark);
        bg1.add(mark);
        bg1.clearSelection();

        save = new JButton("Save");
        save.setBounds(50, 380, 120, 25);
        save.setBackground(new Color(49, 114, 182));
        save.setForeground(Color.WHITE);
        save.setFont(new Font("calibri", Font.BOLD, 15));
        save.addActionListener(this);
        save.setFocusPainted(false);
        add(save);
        
        submit = new JButton("Submit");
        submit.setBounds(310, 500, 120, 25);
        submit.setBackground(new Color(49, 114, 182));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("calibri", Font.BOLD, 15));
        submit.addActionListener(this);
        submit.setFocusPainted(false);
        add(submit);

        for (int i = 0; i < 10; i++) {
            String str1 = Integer.toString(i+1);
            b[i] = new JButton(str1);
            b[i].setLocation(740+(60*(i%3)), 200+(60*(i/3)));
            b[i].setSize(50, 50);
            b[i].setBackground(new Color(211, 211, 211));
            b[i].setForeground(Color.WHITE);
            b[i].setFont(new Font("calibri", Font.BOLD, 15));
            b[i].addActionListener(this);
            b[i].setBorder(BorderFactory.createBevelBorder(1));
            b[i].setFocusPainted(false);
            add(b[i]);
        }
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(690, 40, 275, 110);
        panel1.setBackground(new Color(228, 237, 246));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, rootPaneCheckingEnabled));
        add(panel1);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(228, 237, 246));
        panel2.setBounds(690, 160, 275, 355);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, rootPaneCheckingEnabled));
        add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(20, 40, 650, 45);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, rootPaneCheckingEnabled));
        add(panel3);
        
        setTitle("JAVA Online Examination");
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        setSize(1000, 600);
        setLocation(270, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        timer.start();
        start(count);
    }

    public void start(int count) {
        
        if(count==1 || count==2 || count==0){
                type.setText("Question Type: Good");
            }
            
            if(count==3 || count==4 || count==5 || count==6){
                type.setText("Question Type: Tough");
            }
            
            if(count==7 || count==8 || count==9){
                type.setText("Question Type: Complex");
            }
        if(count == 9) next.setEnabled(false);
        else next.setEnabled(true);
        
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions.question[count][0]);
        
        for(int i=0;i<4;i++){
            o[i].setText(questions.question[count][i+1]);
            o[i].setActionCommand(questions.question[count][i+1]);
        }
        
        b[count].setBackground(Color.red);      
        bg.clearSelection();
        bg1.clearSelection();
    }

    public int marking1() {
        for (int i = 0; i < 3; i++) {
            if (userans[i][0] == questions.answers[i][0]) {
                marks1++;
            }
        }
        return marks1;
    }
    
    public int marking2() {
        for (int i = 3; i < 7; i++) {
            if (userans[i][0] == questions.answers[i][0]) {
                marks2++;
            }
        }
        return marks2;
    }
    
    public int marking3() {
        for (int i = 7; i < 10; i++) {
            if (userans[i][0] == questions.answers[i][0]) {
                marks3++;
            }
        }
        return marks3;
    }
    
    public void submit(){
        setVisible(false);
            int a = marking1();
            int b = marking2();
            int c = marking3();
            new Submit(a, b, c, s, r);
    }

    public void actionPerformed(ActionEvent e) {
        
        if(!timer.isRunning()){
            submit();
        }
        
        if(e.getSource() == submit){
            submit();
        }

        if (e.getSource() == mark) {
            b[count].setBackground(new Color(255, 165, 0));
            b[count].setEnabled(true);
        }
        
        if(e.getSource() == save){
            isVisited[count] = true;
            if (bg.getSelection() == null) {
                userans[count][0] = "";
                b[count].setBackground(Color.red);
            } else {
                userans[count][0] = bg.getSelection().getActionCommand();
                if(mark.isSelected()){
                    b[count].setBackground(new Color(255, 165, 0));
                }
                else{
                    b[count].setBackground(new Color(100, 225, 100));
                    b[count].setEnabled(false);

                }
            }
        }
        
        if (e.getSource() == next) {

            count++;
            for(int i=count;i<10;i++){
                if(isVisited[i] == false){
                    count = i;
                    break;
                }
            }
            start(count);
        }

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == b[i]) {
                count = i;
                start(count);

            }
            
        }
    }

    public static void main(String args[]) {
        new Quiz("Samyak", "IIT2021082");
    }
}