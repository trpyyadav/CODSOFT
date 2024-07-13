
package numberguessinggame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class NumberGuessingGame extends JFrame implements ActionListener{
    JButton check,newGame;
    JTextField tfenter;
    JLabel lbscore,lbchoice;
    int compNo = (int)(Math.random()*100);
    

    NumberGuessingGame(){
        getContentPane().setBackground(Color.ORANGE);
    
        JLabel heading = new JLabel("NUMBER GUESSING GAME");
        heading.setBounds(100,50 ,400 ,40);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        JLabel noEnter = new JLabel("GUESS A NUMBER");
        noEnter.setBounds(200,140 ,400 ,40);
        noEnter.setFont(new Font("tahoma",Font.BOLD,15));
        add(noEnter);

        lbscore = new JLabel();
        lbscore.setBounds(50,140 ,50 ,40);
        lbscore.setFont(new Font("tahoma",Font.BOLD,30));
        add(lbscore);

        tfenter = new JTextField();
        tfenter.setBounds(150,230 ,250 ,40);
        tfenter.setVisible(true);
        tfenter.setEnabled(true);
        add(tfenter);

        check = new JButton("CHECK");
        check.setBounds(50, 320,200, 40);
        check.addActionListener(this);
        add(check);

        newGame = new JButton("NEW GAME");
        newGame.setBounds(300, 320,200, 40);
        newGame.addActionListener(this);
        add(newGame);

        lbchoice = new JLabel();
        lbchoice.setBounds(50,410 ,600 ,80);
        lbchoice.setFont(new Font("serif",Font.BOLD,40));
        add(lbchoice);


        setSize(600, 600);
        setLocation(300, 50);
        setLayout(null);
        setVisible(true);
        




    }

    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == newGame){
            setVisible(false);
            new NumberGuessingGame();
        }else if(ae.getSource() == check){
            
            
            int myNo = Integer.parseInt(tfenter.getText());
            
            int no = myNo;

           

            

           try{
            int k = 0;
            while(k<=5){
                if(no == compNo){
                    lbchoice.setText("CORRECT CHOICE!! ");
                    JOptionPane.showMessageDialog(null,"YOUR CHOICE WAS CORRECT...TO PLAY AGAIN SELECT NEW GAME");
                }else if((no > compNo && no <= compNo+10) || (no < compNo && no >= compNo-10)){
                    lbchoice.setText("VERY CLOSE");
                }else if((no > compNo+10 && no <= compNo+20) || (no < compNo-10 && no >= compNo-20)){
                    lbchoice.setText("CLOSE");
                }else if(no > compNo+20 && no <= compNo+30){
                    lbchoice.setText("HIGH");
                }else if(no < compNo-20 && no >= compNo-30){
                    lbchoice.setText("low");
                }else if(no > compNo+30){
                    lbchoice.setText("TOO HIGH");
                }else if(no < compNo-30){
                    lbchoice.setText("TOO LOW");
                }
                k++;

            }

            


            
            

           }catch(Exception e){
                e.printStackTrace();
           }

            
        }
    }

    
    public static void main(String[] args) {
        new NumberGuessingGame();
        
    }


   
    
    
}
