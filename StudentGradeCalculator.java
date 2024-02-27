package studentgradecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class StudentGradeCalculator extends JFrame implements ActionListener {
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub6,tfsub5,tfTotal;
    JButton lbresult;
    JLabel lbmarksObtained,lbpercent,lbgrade;
    StudentGradeCalculator(){
        getContentPane().setBackground(Color.MAGENTA);

        JLabel heading = new JLabel("STUDENT GRADE CALCULATOR");
        heading.setBounds(175,25,500,40);
        heading.setBackground(Color.BLACK);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("tahoma",Font.BOLD,25));
        add(heading);

        JLabel lbEnterMarks = new JLabel("Enter Marks");
        lbEnterMarks.setBounds(50,80,250,30);
        lbEnterMarks.setForeground(Color.BLACK);
        lbEnterMarks.setFont(new Font("serif",Font.BOLD,20));
        add(lbEnterMarks);

        JLabel subject1 = new JLabel("Subject 1");
        subject1.setBounds(50,120,250,30);
        subject1.setForeground(Color.BLACK);
        subject1.setFont(new Font("serif",Font.BOLD,20));
        add(subject1);

        JLabel subject2 = new JLabel("Subject 2");
        subject2.setBounds(50,160,250,30);
        subject2.setForeground(Color.BLACK);
        subject2.setFont(new Font("serif",Font.BOLD,20));
        add(subject2);

        JLabel subject3 = new JLabel("Subject 3");
        subject3.setBounds(50,200,250,30);
        subject3.setForeground(Color.BLACK);
        subject3.setFont(new Font("serif",Font.BOLD,20));
        add(subject3);

        JLabel subject4 = new JLabel("Subject4");
        subject4.setBounds(400,120,250,30);
        subject4.setForeground(Color.BLACK);
        subject4.setFont(new Font("serif",Font.BOLD,20));
        add(subject4);

        JLabel subject5 = new JLabel("Subject5");
        subject5.setBounds(400,160,250,30);
        subject5.setForeground(Color.BLACK);
        subject5.setFont(new Font("serif",Font.BOLD,20));
        add(subject5);

        JLabel subject6 = new JLabel("Subject6");
        subject6.setBounds(400,200,250,30);
        subject6.setForeground(Color.BLACK);
        subject6.setFont(new Font("serif",Font.BOLD,20));
        add(subject6);

        JLabel totalMarks = new JLabel("Total Marks");
        totalMarks.setBounds(50,240,250,30);
        totalMarks.setForeground(Color.BLACK);
        totalMarks.setFont(new Font("serif",Font.BOLD,20));
        add(totalMarks);

        tfsub1 = new JTextField();
        tfsub1.setBounds(250,120,100,30);
        add(tfsub1);

        tfsub2 = new JTextField();
        tfsub2.setBounds(250,160,100,30);
        add(tfsub2);

        tfsub3 = new JTextField();
        tfsub3.setBounds(250,200,100,30);
        add(tfsub3);

        tfTotal = new JTextField();
        tfTotal.setBounds(250,240,150,30);
        add(tfTotal);

        tfsub4 = new JTextField();
        tfsub4.setBounds(600,120,100,30);
        add(tfsub4);

        tfsub5 = new JTextField();
        tfsub5.setBounds(600,160,100,30);
        add(tfsub5);

        tfsub6 = new JTextField();
        tfsub6.setBounds(600,200,100,30);
        add(tfsub6);

        lbresult = new JButton("RESULT");
        lbresult.setBounds(275,300,200,30);
        lbresult.setFont(new Font("serif",Font.BOLD,25));
        lbresult.setForeground(Color.WHITE);
        lbresult.setBackground(Color.BLACK);
        lbresult.addActionListener(this);
        add(lbresult);

        JLabel marksObtained = new JLabel("Marks Obtained");
        marksObtained.setBounds(50,370,250,30);
        marksObtained.setForeground(Color.BLACK);
        marksObtained.setFont(new Font("serif",Font.BOLD,20));
        add(marksObtained);

        JLabel percent = new JLabel("Percentage(%)");
        percent.setBounds(400,370,250,30);
        percent.setForeground(Color.BLACK);
        percent.setFont(new Font("serif",Font.BOLD,20));
        add(percent);

        JLabel grade = new JLabel("GRADE");
        grade.setBounds(250,480,250,30);
        grade.setForeground(Color.BLACK);
        grade.setFont(new Font("serif",Font.BOLD,20));
        add(grade);

        lbmarksObtained = new JLabel();
        lbmarksObtained.setBounds(250,370,100,30);
        lbmarksObtained.setForeground(Color.BLUE);
        lbmarksObtained.setFont(new Font("serif",Font.BOLD,20));
        add(lbmarksObtained);

        lbpercent = new JLabel();
        lbpercent.setBounds(600,370,100,30);
        lbpercent.setForeground(Color.BLUE);
        lbpercent.setFont(new Font("serif",Font.BOLD,20));
        add(lbpercent);

        lbgrade = new JLabel();
        lbgrade.setBounds(420,480,100,30);
        lbgrade.setForeground(Color.BLUE);
        lbgrade.setFont(new Font("tahoma",Font.BOLD,20));
        add(lbgrade);












        setSize(800, 600);
        setLocation(250, 50);
        setLayout(null);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == lbresult){
            int marks1 = Integer.parseInt(tfsub1.getText());
            int marks2 = Integer.parseInt(tfsub2.getText());
            int marks3 = Integer.parseInt(tfsub3.getText());
            int marks4 = Integer.parseInt(tfsub4.getText());
            int marks5 = Integer.parseInt(tfsub5.getText());
            int marks6 = Integer.parseInt(tfsub6.getText());
            int marksTotal = Integer.parseInt(tfTotal.getText());

            int actualTotal = marksTotal;
            int totalMarksObtained = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
            float percent_age = ((float)(marks1 + marks2 + marks3 + marks4 + marks5 + marks6)/marksTotal);
            float actual_percent = percent_age * 100;

            String lbMarksObtained = String.valueOf(totalMarksObtained);
            String lbPercent = String.valueOf(actual_percent);

            lbmarksObtained.setText(lbMarksObtained);
            lbpercent.setText(lbPercent);

            if(actual_percent>90){
                lbgrade.setText("A1");
            }else if(actual_percent>80){
                lbgrade.setText("A2");
            }else if(actual_percent>70){
                lbgrade.setText("B1");
            }else if(actual_percent>60){
                lbgrade.setText("B2");
            }else if(actual_percent>50){
                lbgrade.setText("C1");
            }else if(actual_percent>40){
                lbgrade.setText("C2");
            }else if(actual_percent>33){
                lbgrade.setText("D");
            }else if(actual_percent>21){
                lbgrade.setText("E1");
            }else{
                lbgrade.setText("E2");
            }
            

            





        }
    }

    public static void main(String[] args) {
       new StudentGradeCalculator();
    }
    
}
