import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Number_Guessing {
    static int Chance=0,lev=0,n=0,num=0,fontfam=0,againplay=0,max=10,min=0,i=0;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel(" Number ");
        l1.setBounds(300, 75, 200, 60);
        l1.setFont(new Font("Serif",Font.BOLD,50));
        JLabel l2 = new JLabel(" Guessing ");
        l2.setBounds(290, 140, 250, 60);
        l2.setFont(new Font("Serif",Font.BOLD,50));
        JLabel l3 = new JLabel(" Game ");
        l3.setBounds(310, 205, 200, 60);
        l3.setFont(new Font("Serif",Font.BOLD,50));
        JButton settings = new JButton("Settings");
        settings.setBounds(300, 350, 200, 30);
        settings.setFont(new Font("Serif",Font.BOLD,17));
        JLabel l4 = new JLabel(" Settings ");
        l4.setBounds(300, 75, 200, 50);
        l4.setFont(new Font("Serif",Font.BOLD,40));
        l4.setVisible(false);
        JLabel l5 = new JLabel(" Change Font Style ");
        l5.setBounds(125, 175, 200, 30);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setVisible(false);
        String Font_Family[]={"Serif","SHOWCARD GOTHIC","Sans-Serif","ALGERIAN","Edwardian Script ITC","Ink Free"};
        JComboBox<String> Fonts = new JComboBox<String>(Font_Family);
        Fonts.setFont(new Font("Serif",Font.BOLD,17));
        Fonts.setBounds(450, 175, 255, 30);
        Fonts.setVisible(false);
        JLabel l6 = new JLabel(" Change Difficulty level ");
        l6.setBounds(125, 250, 250, 30);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setVisible(false);
        String Level[] = {" Very Easy  ( 0 - 10 ) "," Easy            ( 0 - 100 ) "," Medium      ( 0 - 500 ) "," Hard            ( 0 - 1000 ) "," Very Hard  ( 0 - 10000 )"};
        JComboBox<String> Difficulty = new JComboBox<String>(Level);
        Difficulty.setFont(new Font("Serif",Font.BOLD,17));
        Difficulty.setBounds(450, 250, 255, 30);
        Difficulty.setVisible(false);
        JButton play = new JButton("Play Game");
        play.setBounds(300, 300, 200, 30);
        play.setFont(new Font("Serif",Font.BOLD,17));
        JLabel l7 = new JLabel(" Guess a Whole Number ");
        l7.setFont(new Font("Serif",Font.BOLD,19));
        l7.setBounds(275, 70, 300, 30);
        l7.setVisible(false);
        JLabel l8 = new JLabel("Between "+min+"-"+max);
        l8.setBounds(280, 100, 300, 30);
        l8.setFont(new Font("Serif",Font.BOLD,19));
        l8.setVisible(false);
        JTextField tf1 = new JTextField();
        tf1.setFont(new Font("Serif",Font.BOLD,19));
        tf1.setBounds(275, 130, 300, 30);
        tf1.setVisible(false);
        JButton back = new JButton(" Back ");
        back.setBounds(125, 400, 200, 30);
        back.setFont(new Font("Serif",Font.BOLD,17));
        back.setVisible(false);
        JLabel l9 = new JLabel(" Your Chances ==> "+Chance);
        l9.setBounds(300, 200, 400, 30);
        l9.setFont(new Font("Serif",Font.BOLD,19));
        l9.setVisible(false);
        JLabel l10 = new JLabel("");
        l10.setBounds(300, 240, 400, 30);
        l10.setFont(new Font("Serif",Font.BOLD,19));
        l10.setVisible(false);
        JLabel l11 = new JLabel("");
        l11.setFont(new Font("Serif",Font.BOLD,60));
        l11.setBounds(275, 295, 400, 60);
        l11.setVisible(false);
        JButton Guess = new JButton(" Guess ");
        Guess.setBounds(275, 165, 200, 30);
        Guess.setFont(new Font("Serif",Font.BOLD,17));
        Guess.setVisible(false);
        JButton Giveup = new JButton(" Give Up");
        Giveup.setBounds(325, 400, 200, 30);
        Giveup.setFont(new Font("Serif",Font.BOLD,17));
        Giveup.setVisible(false);
        JButton playagain = new JButton(" Play Again ");
        playagain.setBounds(325, 400, 200, 30);
        playagain.setFont(new Font("Serif",Font.BOLD,17));
        playagain.setVisible(false);
        JButton exit = new JButton("Exit Game");
        exit.setBounds(300, 400, 200, 30);
        exit.setFont(new Font("Serif",Font.BOLD,17));
        //keeping the icon as a image
        Image Icon = Toolkit.getDefaultToolkit().getImage("Icon.png");
        //Changing the fonts when combobox is changed
        Fonts.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fontfam = Fonts.getSelectedIndex();
                if(fontfam==0){
                    l1.setFont(new Font("Serif",Font.BOLD,50));
                    l1.setBounds(300, 75, 200, 60);
                    l2.setFont(new Font("Serif",Font.BOLD,50));
                    l2.setBounds(290, 140, 250, 60);
                    l3.setFont(new Font("Serif",Font.BOLD,50));
                    l3.setBounds(310, 205, 200, 60);
                    l4.setFont(new Font("Serif",Font.BOLD,40));
                    l4.setBounds(300, 75, 200, 50);
                    l5.setFont(new Font("Serif",Font.BOLD,20));
                    l5.setBounds(125, 175, 200, 30);
                    l6.setFont(new Font("Serif",Font.BOLD,20));
                    l6.setBounds(125, 250, 250, 30);
                    l7.setFont(new Font("Serif",Font.BOLD,19));
                    l7.setBounds(275, 70, 300, 30);
                    l8.setFont(new Font("Serif",Font.BOLD,19));
                    l8.setBounds(280, 100, 300, 30);
                    tf1.setFont(new Font("Serif",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("Serif",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("Serif",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("Serif",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("Serif",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Fonts.setFont(new Font("Serif",Font.BOLD,17));
                    Fonts.setBounds(450, 175, 255, 30);
                    Difficulty.setFont(new Font("Serif",Font.BOLD,17));
                    Difficulty.setBounds(450, 250, 255, 30);
                    Giveup.setBounds(325, 400, 200, 30);
                    Giveup.setFont(new Font("Serif",Font.BOLD,17));
                    playagain.setFont(new Font("Serif",Font.BOLD,17));
                    back.setFont(new Font("Serif",Font.BOLD,17));
                    back.setBounds(125, 400, 200, 30);
                    play.setFont(new Font("Serif",Font.BOLD,17));
                    play.setBounds(300, 300, 200, 30);
                    exit.setFont(new Font("Serif",Font.BOLD,17));
                    exit.setBounds(450, 400, 200, 30);
                    settings.setFont(new Font("Serif",Font.BOLD,17));
                    settings.setBounds(300, 350, 200, 30);
                }
                else if(fontfam==1){
                    l1.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,50));
                    l1.setBounds(275, 75, 300, 60);
                    l2.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,50));
                    l2.setBounds(265, 140, 300, 60);
                    l3.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,50));
                    l3.setBounds(310, 205, 200, 60);
                    l4.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,40));
                    l4.setBounds(300, 75, 300, 50);
                    l5.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,20));
                    l5.setBounds(125, 175, 300, 30);
                    l6.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,20));
                    l6.setBounds(125, 250, 300, 30);
                    l7.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,19));
                    l7.setBounds(275, 70, 300, 30);
                    l8.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,19));
                    l8.setBounds(280, 100, 300, 30);
                    tf1.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Giveup.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    Giveup.setBounds(325, 400, 200, 30);
                    Fonts.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    Difficulty.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    back.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    playagain.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    back.setBounds(125, 400, 200, 30);
                    play.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    exit.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                    settings.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,17));
                }
                else if(fontfam==2){
                    l1.setFont(new Font("Sans-Serif",Font.BOLD,50));
                    l1.setBounds(300, 75, 300, 60);
                    l2.setFont(new Font("Sans-Serif",Font.BOLD,50));
                    l2.setBounds(280, 140, 300, 60);
                    l3.setFont(new Font("Sans-Serif",Font.BOLD,50));
                    l4.setFont(new Font("Sans-Serif",Font.BOLD,40));
                    l5.setFont(new Font("Sans-Serif",Font.BOLD,20));
                    l6.setFont(new Font("Sans-Serif",Font.BOLD,20));
                    l7.setFont(new Font("Sans-Serif",Font.BOLD,19));
                    l7.setBounds(275, 70,300, 30);
                    l8.setFont(new Font("Sans-Serif",Font.BOLD,19));
                    l8.setBounds(280, 100,300, 30);
                    tf1.setFont(new Font("Sans-Serif",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("Sans-Serif",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("Sans-Serif",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("Sans-Serif",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Giveup.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    Giveup.setBounds(325, 400, 200, 30);
                    Fonts.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    Difficulty.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    playagain.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    back.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    play.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    exit.setFont(new Font("Sans-Serif",Font.BOLD,17));
                    settings.setFont(new Font("Sans-Serif",Font.BOLD,17));
                }
                else if(fontfam==3){
                    l1.setFont(new Font("ALGERIAN",Font.BOLD,50));
                    l1.setBounds(300, 75, 300, 60);
                    l2.setFont(new Font("ALGERIAN",Font.BOLD,50));
                    l2.setBounds(290, 140, 300, 60);
                    l3.setFont(new Font("ALGERIAN",Font.BOLD,50));
                    l3.setBounds(310, 205, 300, 60);
                    l4.setFont(new Font("ALGERIAN",Font.BOLD,40));
                    l4.setBounds(300, 75, 300, 50);
                    l5.setFont(new Font("ALGERIAN",Font.BOLD,20));
                    l5.setBounds(125, 175, 300, 30);
                    l6.setFont(new Font("ALGERIAN",Font.BOLD,20));
                    l6.setBounds(125, 250, 300, 30);
                    l7.setFont(new Font("ALGERIAN",Font.BOLD,19));
                    l7.setBounds(275, 70, 300, 30);
                    l8.setFont(new Font("ALGERIAN",Font.BOLD,19));
                    l8.setBounds(280, 100, 300, 30);
                    tf1.setFont(new Font("ALGERIAN",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("ALGERIAN",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("ALGERIAN",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("ALGERIAN",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Giveup.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    Giveup.setBounds(325, 400, 200, 30);
                    Fonts.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    Difficulty.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    playagain.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    back.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    play.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    exit.setFont(new Font("ALGERIAN",Font.BOLD,17));
                    settings.setFont(new Font("ALGERIAN",Font.BOLD,17));
                }
                else if(fontfam==4){
                    l1.setFont(new Font("Edwardian Script ITC",Font.BOLD,50));
                    l1.setBounds(320, 75, 200, 60);
                    l2.setFont(new Font("Edwardian Script ITC",Font.BOLD,50));
                    l2.setBounds(310, 140, 250, 60);
                    l3.setFont(new Font("Edwardian Script ITC",Font.BOLD,50));
                    l3.setBounds(330, 205, 200, 60);
                    l4.setFont(new Font("Edwardian Script ITC",Font.BOLD,40));
                    l4.setBounds(340, 75, 200, 50);
                    l5.setFont(new Font("Edwardian Script ITC",Font.BOLD,20));
                    l6.setFont(new Font("Edwardian Script ITC",Font.BOLD,20));
                    l7.setFont(new Font("Edwardian Script ITC",Font.BOLD,19));
                    l7.setBounds(275, 70, 300, 30);
                    l8.setFont(new Font("Edwardian Script ITC",Font.BOLD,19));
                    l8.setBounds(280, 100, 300, 30);
                    tf1.setFont(new Font("Edwardian Script ITC",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("Edwardian Script ITC",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("Edwardian Script ITC",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("Edwardian Script ITC",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Giveup.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    Giveup.setBounds(325, 400, 200, 30);
                    Fonts.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    Difficulty.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    playagain.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    back.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    play.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    exit.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                    settings.setFont(new Font("Edwardian Script ITC",Font.BOLD,17));
                }
                else if(fontfam==5){
                    l1.setFont(new Font("Ink Free",Font.BOLD,50));
                    l1.setBounds(300, 75, 250, 60);
                    l2.setFont(new Font("Ink Free",Font.BOLD,50));
                    l2.setBounds(300, 140, 250, 60);
                    l3.setFont(new Font("Ink Free",Font.BOLD,50));
                    l3.setBounds(320, 205, 200, 60);
                    l4.setFont(new Font("Ink Free",Font.BOLD,40));
                    l5.setFont(new Font("Ink Free",Font.BOLD,20));
                    l6.setFont(new Font("Ink Free",Font.BOLD,20));
                    l7.setFont(new Font("Ink Free",Font.BOLD,19));
                    l7.setBounds(275, 70, 300, 30);
                    l8.setFont(new Font("Ink Free",Font.BOLD,19));
                    l8.setBounds(280, 100, 300, 30);
                    tf1.setFont(new Font("Ink Free",Font.BOLD,19));
                    tf1.setBounds(275, 130, 250, 30);
                    l9.setFont(new Font("Ink Free",Font.BOLD,19));
                    l9.setBounds(300, 200, 400, 30);
                    l10.setFont(new Font("Ink Free",Font.BOLD,19));
                    l10.setBounds(300, 240, 400, 30);
                    l11.setFont(new Font("Ink Free",Font.BOLD,60));
                    l11.setBounds(275, 295, 400, 60);
                    Guess.setFont(new Font("Ink Free",Font.BOLD,17));
                    Guess.setBounds(275, 165, 200, 30);
                    Giveup.setFont(new Font("Ink Free",Font.BOLD,17));
                    Giveup.setBounds(325, 400, 200, 30);
                    Fonts.setFont(new Font("Ink Free",Font.BOLD,17));
                    Difficulty.setFont(new Font("Ink Free",Font.BOLD,17));
                    back.setFont(new Font("Ink Free",Font.BOLD,17));
                    playagain.setFont(new Font("Ink Free",Font.BOLD,17));
                    play.setFont(new Font("Ink Free",Font.BOLD,17));
                    exit.setFont(new Font("Ink Free",Font.BOLD,17));
                    settings.setFont(new Font("Ink Free",Font.BOLD,17));
                }
            }
        });
        Difficulty.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lev = Difficulty.getSelectedIndex();
                if(lev==0){
                    max=10;
                    l8.setText("Between "+min+"-"+max);
                    Number_Guessing.againplay=0;
                    n = num(max, min, lev, Number_Guessing.againplay);
                }
                else if(lev==1){
                    max=100;
                    l8.setText("Between "+min+"-"+max);
                    Number_Guessing.againplay=0;
                    n = num(max, min, lev, Number_Guessing.againplay);
                }
                else if(lev==2){
                    max=500;
                    l8.setText("Between "+min+"-"+max);
                    Number_Guessing.againplay=0;
                    n = num(max, min, lev, Number_Guessing.againplay);
                }
                else if(lev==3){
                    max=1000;
                    l8.setText("Between "+min+"-"+max);
                    Number_Guessing.againplay=0;
                    n = num(max, min, lev,Number_Guessing.againplay);
                }
                else if(lev==4){
                    max=10000;
                    l8.setText("Between "+min+"-"+max);
                    Number_Guessing.againplay=0;
                    n = num(max, min, lev,Number_Guessing.againplay);
                }
            }
        });
        Guess.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int input;
                try {
                    input = Integer.parseInt(tf1.getText());
                    if(input==n){
                        Chance++;
                        if(Chance==1||Chance==0){
                            l9.setText(" Your Chance ==> "+Chance);
                        }
                        else{
                            l9.setText(" Your Chances ==> "+Chance);
                        }
                        l8.setVisible(false);
                        l7.setVisible(false);
                        l9.setVisible(true);
                        l9.setForeground(Color.BLACK);
                        tf1.setVisible(false);
                        tf1.setText("");
                        l10.setVisible(true);
                        l10.setText("The Number is "+n);
                        l10.setForeground(Color.BLACK);
                        l11.setVisible(true);
                        l11.setText(" You Won ");
                        l11.setForeground(Color.GREEN);
                        Guess.setVisible(false);
                        Giveup.setVisible(false);
                        playagain.setVisible(true);
                        Chance=0;
                    }
                    else if(input<=n){
                        Chance++;
                        l9.setVisible(true);
                        if(Chance==1||Chance==0){
                            l9.setText(" Your Chance ==> "+Chance);
                        }
                        else{
                            l9.setText(" Your Chances ==> "+Chance);
                        }
                        l10.setVisible(true);
                        l10.setText(" Enter a Bigger Number ");
                        l10.setForeground(Color.BLACK);
                        l11.setVisible(false);
                    }
                    else if(input>=n){
                        Chance++;
                        l9.setVisible(true);
                        if(Chance==1||Chance==0){
                            l9.setText(" Your Chance ==> "+Chance);
                        }
                        else{
                            l9.setText(" Your Chances ==> "+Chance);
                        }
                        l10.setVisible(true);
                        l10.setText(" Enter a Smaller Number ");
                        l10.setForeground(Color.BLACK);
                        l11.setVisible(false);
                    }
                    else{
                        System.out.println("Error Occured");
                    }
                } catch (Exception e2) {
                    tf1.setText("");
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Valid Number ", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        Giveup.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l7.setVisible(false);
                l8.setVisible(false);
                l9.setVisible(true);
                if(Chance==1||Chance==0){
                    l9.setText(" Your Chance ==> "+Chance);
                }
                else{
                    l9.setText(" Your Chances ==> "+Chance);
                }
                tf1.setVisible(false);
                tf1.setText("");
                l10.setVisible(true);
                l10.setText("The Number was "+n);
                l11.setVisible(true);
                l11.setText(" You Lose ");
                l11.setForeground(Color.red);
                Guess.setVisible(false);
                Giveup.setVisible(false);
                playagain.setVisible(true);
            }
        });
        playagain.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l7.setVisible(true);
                l8.setVisible(true);
                tf1.setVisible(true);
                tf1.setText("");
                l9.setText("");
                l10.setText("");
                l11.setText("");
                Chance=0;
                againplay=1;
                n = num(max, min, lev, againplay);
                Giveup.setVisible(true);
                playagain.setVisible(false);
            }
        });
        tf1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                Guess.setVisible(true);
            }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Chance=0;
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                tf1.setVisible(false);
                tf1.setText("");
                l9.setVisible(false);
                l10.setVisible(false);
                l11.setVisible(false);
                playagain.setVisible(false);
                Guess.setVisible(false);
                Giveup.setVisible(false);
                back.setVisible(false);
                Difficulty.setVisible(false);
                Fonts.setVisible(false);
                play.setVisible(true);
                settings.setVisible(true);
                exit.setVisible(true);
                exit.setBounds(300, 400, 200, 30);
            }
        });
        settings.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(true);
                l5.setVisible(true);
                l6.setVisible(true);
                l7.setVisible(false);
                l8.setVisible(false);
                tf1.setVisible(false);
                l9.setVisible(false);
                l10.setVisible(false);
                l11.setVisible(false);
                playagain.setVisible(false);
                Guess.setVisible(false);
                Giveup.setVisible(false);
                play.setVisible(false);
                back.setVisible(true);
                back.setBounds(125, 400, 200, 30);
                Difficulty.setVisible(true);
                Fonts.setVisible(true);
                settings.setVisible(false);
                exit.setBounds(450, 400, 200, 30);
            }
        });
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l7.setVisible(true);
                l8.setVisible(true);
                tf1.setVisible(true);
                tf1.setVisible(true);
                l9.setVisible(false);
                l10.setVisible(false);
                l11.setVisible(false);
                Guess.setVisible(false);
                playagain.setVisible(false);
                Giveup.setVisible(true);
                Giveup.setBounds(325, 400, 200, 30);
                play.setVisible(false);
                back.setVisible(true);
                back.setBounds(50, 400, 200, 30);
                Giveup.setBounds(325, 400, 200, 30);
                settings.setVisible(false);
                exit.setVisible(true);
                exit.setBounds(600, 400, 200, 30);
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);
        f.add(Difficulty);f.add(Fonts);f.add(Giveup);f.add(Guess);f.add(playagain);
        f.add(tf1);
        f.add(play);f.add(exit);f.add(settings);f.add(back);f.setIconImage(Icon);
        f.setTitle("Number Guessing Game");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(850, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static int num(int max,int min,int lev,int playagain){
        int n1=0,n2=0,n3=0;
        n1=(int)((Math.random()*(max-min+1))+min);
        n2=(int)((Math.random()*(max-min+1))+min);
        n3=(int)((Math.random()*(max-min+1))+min);
        if(playagain%2==1){
            if(i%2==1){
                return n2;
            }
            else{
                return n3;
            }
        }
        else{
            return n1;
        }
    }
}
