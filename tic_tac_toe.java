import java.awt.*;//made by                                       SUDEEP     SHARMA    
import java.awt.event.*;//                               made   by   sudeep  sharma    
import javax.swing.*;//                               made   by   sudeep  sharma    
import java.util.*;//                               made   by   sudeep  sharma    
import java.awt.event.KeyAdapter;//                               made   by   sudeep  sharma    
import java.awt.Canvas;//                               made   by   sudeep  sharma    
import java.awt.Color;//                               made   by   sudeep  sharma    
import java.awt.Dimension;//                               made   by   sudeep  sharma    
import java.awt.Graphics2D;//                               made   by   sudeep  sharma    
import javax.swing.JFrame;//                               made   by   sudeep  sharma    
import java.awt.image.BufferStrategy;//                               made   by   sudeep  sharma    
import javax.swing.JPanel;//                               made   by   sudeep  sharma    
public class tic_tac_toe extends JFrame //                               made   by   sudeep  sharma    
{//                               made   by   sudeep  sharma    
    JButton jbtNum1;//                               made   by   sudeep  sharma    
    JButton jbtNum2;//                               made   by   sudeep  sharma    
    JButton jbtNum3;//                               made   by   sudeep  sharma    
    JButton jbtNum4;//                               made   by   sudeep  sharma    
    JButton jbtNum5;//                               made   by   sudeep  sharma    
    JButton jbtNum6;//                               made   by   sudeep  sharma    
    JButton jbtNum7;//                               made   by   sudeep  sharma    
    JButton jbtNum8;
    JButton jbtNum9;
    JButton jbtdone;
    JButton jbtnewgame1;
    JButton jbtreplay;
    JButton jbtfhoc;
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JTextField jtfR;
    String display1;
    String display2;
    String display3;
    String display4;
    String display5;
    String display6;
    String display7;
    String display8;
    String display9;
    String d1;
    String d2;
    String d3;
    String d4;
    String d5;
    String d6;
    String d7;
    String d8;
    String d9;
    int c;
    public tic_tac_toe() 
    {	
        display1=" ";
        display2=" ";
        display3=" ";
        display4=" ";
        display5=" ";
        display6=" ";
        display7=" ";
        display8=" ";
        display9=" ";
        c=1;
        JPanel bar = new JPanel();
        bar.setLayout(new GridLayout(5,5));
        bar.add(jtfR = new JTextField(2));
        bar.add(jbtnewgame1 = new JButton("New game"));
        bar.add(jbtreplay = new JButton("Replay"));
        bar.add(jbtfhoc = new JButton("2nd Hand Play"));
        bar.add(jbtdone = new JButton("Done"));
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3,3));//                               made   by   sudeep  sharma    
        p2.add(jtf1 = new JTextField(2));
        p2.add(jtf2 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf3 = new JTextField(2));
        p2.add(jtf4 = new JTextField(2));
        p2.add(jtf5 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf6 = new JTextField(2)); 
        p2.add(jtf7 = new JTextField(2));
        p2.add(jtf8 = new JTextField(2));
        p2.add(jtf9 = new JTextField(2));  
        jtf1.setEditable(false);
        jtf2.setEditable(false);
        jtf3.setEditable(false);//                               made   by   sudeep  sharma    
        jtf4.setEditable(false);
        jtf5.setEditable(false);//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        jtf6.setEditable(false);
        jtf7.setEditable(false);
        jtf8.setEditable(false);   
        jtf9.setEditable(false);    
        jtfR.setEditable(false);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,3));//                               made   by   sudeep  sharma    
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtNum4 = new JButton("4"));//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));//                               made   by   sudeep  sharma    

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(550,200));
        p.setLayout(new GridLayout());
        p.add(bar, BorderLayout.NORTH);
        p.add(p2, BorderLayout.CENTER);
        p.add(p1, BorderLayout.SOUTH);

        add(p);  
        setIgnoreRepaint(false);
        setResizable(true);

        jbtNum1.addActionListener(new ListenToOne());
        jbtNum2.addActionListener(new ListenToTwo());
        jbtNum3.addActionListener(new ListenToThree());
        jbtNum4.addActionListener(new ListenToFour());
        jbtNum5.addActionListener(new ListenToFive());
        jbtNum6.addActionListener(new ListenToSix());
        jbtNum7.addActionListener(new ListenToSeven());
        jbtNum8.addActionListener(new ListenToEight());
        jbtNum9.addActionListener(new ListenTonine());
        jbtnewgame1.addActionListener(new ListenTonewgame1());
        jbtdone.addActionListener(new ListenTodone());
        jbtreplay.addActionListener(new ListenToreplay());
        jbtfhoc.addActionListener(new ListenTofhoc());
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(20,20,20,20);
        g.setColor(Color.black);
        g.setColor(Color.green);
        g.drawString("created by Sudeep Sharma", 200,110);
    }

    public void Graphics(Graphics g)
    {
        Color purple = new Color(234, 789, 345);
        Color red = new Color(345, 867, 256);
        Color green = new Color(134, 345, 344);
        Color yellow = new Color(134, 345, 344);
        g.setColor(Color.red);
        g.drawString("created by Sudeep Sharma", 20, 40);
    }

    class ListenToOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
            display1 = jtf1.getText();
            display1="        x";
            jtf1.setText(display1);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToTwo implements ActionListener //                               made   by   sudeep  sharma    
    {
        public void actionPerformed(ActionEvent e)
        {
            display2 = jtf2.getText();
            display2="        x";
            jtf2.setText(display2);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToThree implements ActionListener 
    {//                               made   by   sudeep  sharma    
        public void actionPerformed(ActionEvent e) 
        {
            display3 = jtf3.getText();
            display3="        x";
            jtf3.setText(display3); 
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display4 = jtf4.getText();
            display4="        x";
            jtf4.setText(display4);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display5 = jtf5.getText();
            display5="        x";
            jtf5.setText(display5);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
    class ListenToSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display6 = jtf6.getText();
            display6="        x";
            jtf6.setText(display6);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display7 = jtf7.getText();
            display7="        x";
            jtf7.setText(display7);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenToEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display8 = jtf8.getText();
            display8="        x";
            jtf8.setText(display8);
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenTonine implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display9 = jtf9.getText();
            display9="        x";
            jtf9.setText(display9); 
            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }
            if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }
        }
    }
    class ListenTofhoc implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display5="        0";
            jtf5.setText(display5);   
        }
    }
    class ListenTonewgame1 implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display1=" ";
            display2=" ";
            display3=" ";
            display4=" ";
            display5=" ";
            display6=" ";
            display7=" ";
            display8=" ";
            display9=" ";
            jtf1.setText(display1);
            jtf2.setText(display2);
            jtf3.setText(display3);
            jtf4.setText(display4);
            jtf5.setText(display5);
            jtf6.setText(display6);
            jtf7.setText(display7);
            jtf8.setText(display8);
            jtf9.setText(display9);
            jtfR.setText(" ");  
        }
    }
    class ListenTodone implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            d1=display1;
            d2=display2;
            d3=display3;
            d4=display4;
            d5=display5;
            d6=display6;
            d7=display7;
            d8=display8;
            d9=display9;
            String s = jtfR.getText();
            s="1";
            int flag=0;
            if(s.equals("1"))
            {
                if(display1=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display2=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display3=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display4=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display5=="        x")
                {
                    if(display1==" ")
                        display1="        0";
                    jtf1.setText(display1);
                }
                if(display6=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display7=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display8=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                if(display9=="        x")
                {
                    if(display5==" ")
                        display5="        0";
                    jtf5.setText(display5);
                }
                s="";
            }

            if(display1=="        0"&&display3=="        0")
            {
                if(display2==" ")
                {
                    display2="        0";
                    jtf2.setText(display2);
                }
                else
                {
                }
            }
            if(display3=="        0"&&display9=="        0")
            {
                if(display6==" ")
                {
                    display6="        0";
                    jtf6.setText(display6);
                }
                else
                {
                }
            }
            if(display1=="        0"&&display7=="        0")
            {
                if(display4==" ")
                {
                    display4="        0";
                    jtf4.setText(display4);
                }
                else
                {
                }
            }
            if(display9=="        0"&&display7=="        0")
            {
                if(display8==" ")
                {
                    display8="        0";
                    jtf8.setText(display8);
                }
                else
                {
                }
            }
            if(display1=="        0"&&display2=="        0")
            {
                if(display3==" ")
                {
                    display3="        0";
                    jtf3.setText(display3);
                }
                else
                {
                }
            }
            if(display3=="        0"&&display2=="        0")
            {
                if(display1==" ")
                {
                    display1="        0";
                    jtf1.setText(display1);
                }
                else
                {
                }
            }
            if(display9=="        0"&&display8=="        0")
            {
                if(display7==" ")
                {
                    display7="        0";
                    jtf7.setText(display7);
                }
                else
                {

                }
            }
            if(display7=="        0"&&display8=="        0")
            {
                if(display9==" ")
                {
                    display9="        0";
                    jtf9.setText(display9);
                }
                else
                {
                }
            }
            if(display1=="        0"&&display4=="        0")
            {
                if(display7==" ")
                {
                    display7="        0";
                    jtf7.setText(display7);
                }
                else
                {
                }
            }
            if(display7=="        0"&&display4=="        0")
            {
                if(display1==" ")
                {
                    display1="        0";
                    jtf1.setText(display1);
                }
            }
            if(display3=="        0"&&display6=="        0")
            {
                if(display9==" ")
                {
                    display9="        0";
                    jtf9.setText(display9);
                }
                else
                {
                }
            }
            if(display9=="        0"&&display6=="        0")
            {
                if(display3==" ")
                {
                    display3="        0";
                    jtf3.setText(display3);
                }
                else
                {
                }
            }
            if(display9=="        0"&&display1=="        0")
            {
                if(display5==" ")
                {
                    display5="        0";
                    jtf5.setText(display5);
                }
                else
                {
                }
            }
            if(display9=="        0"&&display5=="        0")
            {
                if(display1==" ")
                {
                    display1="        0";
                    jtf1.setText(display1);
                }
                else
                {
                }
            }
            if(display1=="        0"&&display5=="        0")
            {
                if(display9==" ")
                {
                    display9="        0";
                    jtf9.setText(display9);
                }
                else
                {
                }
            }
            if(display3=="        0"&&display7=="        0")
            {
                if(display5==" ")
                {
                    display5="        0";
                    jtf5.setText(display5);
                }
                else
                {
                }
            }
            if(display3=="        0"&&display5=="        0")
            {
                if(display7==" ")
                {
                    display7="        0";
                    jtf7.setText(display7);
                }
                else
                {
                }
            }
            if(display7=="        0"&&display5=="        0")
            {
                if(display3==" ")
                {
                    display3="        0";
                    jtf3.setText(display3);
                }
                else
                {
                }
            }
            if(display4=="        0"&&display6=="        0")
            {
                if(display5==" ")
                {
                    display5="        0";
                    jtf5.setText(display5);
                }
                else
                {
                }
            }
            if(display4=="        0"&&display5=="        0")
            {
                if(display6==" ")
                {
                    display6="        0";
                    jtf6.setText(display6);
                }
                else
                {
                }
            }
            if(display6=="        0"&&display5=="        0")
            {
                if(display4==" ")
                {
                    display4="        0";
                    jtf4.setText(display4);
                }
                else
                {
                }
            }
            if(display2=="        0"&&display8=="        0")
            {
                if(display5==" ")
                {
                    display5="        0";
                    jtf5.setText(display5);
                }
                else
                {
                }
            }
            if(display2=="        0"&&display5=="        0")
            {
                if(display8==" ")
                {
                    display8="        0";
                    jtf8.setText(display8);
                }
                else
                {
                }

            }
            if(display5=="        0"&&display8=="        0")
            {
                if(display2==" ")
                {
                    display2="        0";
                    jtf2.setText(display2);
                }
                else
                {
                }
            }

            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                flag=1;    
            }

            if(flag==0)
            {
                if(display1=="        x"&&display3=="        x")
                {
                    if(display2==" ")
                    {
                        display2="        0";
                        jtf2.setText(display2);
                    }
                    else
                    {
                    }
                }
                if(display3=="        x"&&display9=="        x")
                {
                    if(display6==" ")
                    {
                        display6="        0";
                        jtf6.setText(display6);
                    }
                    else
                    {
                    }
                }
                if(display1=="        x"&&display7=="        x")
                {
                    if(display4==" ")
                    {
                        display4="        0";
                        jtf4.setText(display4);
                    }
                    else
                    {
                    }
                }
                if(display9=="        x"&&display7=="        x")
                {
                    if(display8==" ")
                    {
                        display8="        0";
                        jtf8.setText(display8);
                    }
                    else
                    {
                    }
                }
                if(display1=="        x"&&display2=="        x")
                {
                    if(display3==" ")
                    {
                        display3="        0";
                        jtf3.setText(display3);
                    }
                    else
                    {
                    }
                }
                if(display3=="        x"&&display2=="        x")
                {
                    if(display1==" ")
                    {
                        display1="        0";
                        jtf1.setText(display1);
                    }
                    else
                    {
                    }
                }
                if(display9=="        x"&&display8=="        x")
                {
                    if(display7==" ")
                    {
                        display7="        0";
                        jtf7.setText(display7);
                    }
                    else
                    {

                    }
                }
                if(display7=="        x"&&display8=="        x")
                {
                    if(display9==" ")
                    {
                        display9="        0";
                        jtf9.setText(display9);
                    }
                    else
                    {
                    }
                }
                if(display1=="        x"&&display4=="        x")
                {
                    if(display7==" ")
                    {
                        display7="        0";
                        jtf7.setText(display7);
                    }
                    else
                    {
                    }
                }
                if(display7=="        x"&&display4=="        x")
                {
                    if(display1==" ")
                    {
                        display1="        0";
                        jtf1.setText(display1);
                    }
                }
                if(display3=="        x"&&display6=="        x")
                {
                    if(display9==" ")
                    {
                        display9="        0";
                        jtf9.setText(display9);
                    }
                    else
                    {
                    }
                }
                if(display9=="        x"&&display6=="        x")
                {
                    if(display3==" ")
                    {
                        display3="        0";
                        jtf3.setText(display3);
                    }
                    else
                    {
                    }
                }
                if(display9=="        x"&&display1=="        x")
                {
                    if(display5==" ")
                    {
                        display5="        0";
                        jtf5.setText(display5);
                    }
                    else
                    {
                    }
                }
                if(display9=="        x"&&display5=="        x")
                {
                    if(display1==" ")
                    {
                        display1="        0";
                        jtf1.setText(display1);
                    }
                    else
                    {
                    }
                }
                if(display1=="        x"&&display5=="        x")
                {
                    if(display9==" ")
                    {
                        display9="        0";
                        jtf9.setText(display9);
                    }
                    else
                    {
                    }
                }
                if(display3=="        x"&&display7=="        x")
                {
                    if(display5==" ")
                    {
                        display5="        0";
                        jtf5.setText(display5);
                    }
                    else
                    {
                    }
                }
                if(display3=="        x"&&display5=="        x")
                {
                    if(display7==" ")
                    {
                        display7="        0";
                        jtf7.setText(display7);
                    }
                    else
                    {
                    }
                }
                if(display7=="        x"&&display5=="        x")
                {
                    if(display3==" ")
                    {

                        display3="        0";
                        jtf3.setText(display3);
                    }
                    else
                    {
                    }
                }
                if(display4=="        x"&&display6=="        x")
                {
                    if(display5==" ")
                    {
                        display5="        0";
                        jtf5.setText(display5);
                    }
                    else
                    {
                    }
                }
                if(display4=="        x"&&display5=="        x")
                {
                    if(display6==" ")
                    {
                        display6="        0";
                        jtf6.setText(display6);
                    }
                    else
                    {
                    }
                }
                if(display6=="        x"&&display5=="        x")
                {
                    if(display4==" ")
                    {
                        display4="        0";
                        jtf4.setText(display4);
                    }
                    else
                    {
                    }
                }
                if(display2=="        x"&&display8=="        x")
                {
                    if(display5==" ")
                    {
                        display5="        0";
                        jtf5.setText(display5);
                    }
                    else
                    {
                    }
                }
                if(display2=="        x"&&display5=="        x")
                {
                    if(display8==" ")
                    {
                        display8="        0";
                        jtf8.setText(display8);
                    }
                    else
                    {
                    }

                }
                if(display5=="        x"&&display8=="        x")
                {
                    if(display2==" ")
                    {
                        display2="        0";
                        jtf2.setText(display2);
                    }
                    else
                    {
                    }
                }
            }

            if(display5=="        x"&&display9=="        x"&&display1=="        0"&&display3==" "&&display4==" "&&display2==" "&&display6==" "&&display7==" "&&display8==" ")
            {
                display3="        0";
                jtf3.setText(display3); 
            }

            if(display2=="        x"&&display5=="        0"&&display8=="        x"&&display4==" "&&display1==" "&&display3==" "&&display7==" "&&display9==" "&&display6==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }
            if(display2=="        x"&&display5=="        0"&&display8=="        x"&&display4=="        0"&&display6=="        x"&&display1==" "&&display3==" "&&display7==" "&&display9==" ")
            {
                display9="        0";
                jtf9.setText(display9); 
            }
            if(display4=="        x"&&display5=="        0"&&display6=="        x"&&display2==" "&&display1==" "&&display3==" "&&display7==" "&&display9==" "&&display8==" ")
            {
                display2="        0";
                jtf2.setText(display2); 
            }
            if(display4=="        x"&&display5=="        0"&&display6=="        x"&&display2=="        0"&&display8=="        x"&&display1==" "&&display3==" "&&display7==" "&&display9==" ")
            {
                display9="        0";
                jtf9.setText(display9); 
            }

            if(display2=="        x"&&display5=="        0"&&display6=="        x"&&display3==" "&&display1==" "&&display4==" "&&display7==" "&&display9==" "&&display8==" ")
            {
                display3="        0";
                jtf3.setText(display3); 
            }
            if(display2=="        x"&&display5=="        0"&&display6=="        x"&&display1==" "&&display4==" "&&display8==" "&&display9==" ")
            {
                if(display7=="        x"&&display3=="        0"&&display1==" ")
                    display1="        0";
                jtf1.setText(display1);
            }

            if(display2=="        x"&&display5=="        0"&&display4=="        x"&&display1==" "&&display6==" "&&display3==" "&&display7==" "&&display9==" "&&display8==" ")
            {
                display1="        0";
                jtf1.setText(display1); 
            }
            if(display2=="        x"&&display5=="        0"&&display4=="        x"&&display6==" "&&display3==" "&&display7==" "&&display8==" ")
            {
                if(display9=="        x"&&display1=="        0"&&display3==" ")
                    display3="        0";
                jtf3.setText(display3);
            }

            if(display4=="        x"&&display5=="        0"&&display8=="        x"&&display7==" "&&display1==" "&&display3==" "&&display6==" "&&display9==" "&&display2==" ")
            {
                display7="        0";
                jtf7.setText(display7); 
            }
            if(display4=="        x"&&display5=="        0"&&display8=="        x"&&display1==" "&&display2==" "&&display6==" "&&display9==" ")
            {
                if(display7=="        0"&&display3=="        x"&&display1==" ")
                    display1="        0";
                jtf1.setText(display1);
            }

            if(display8=="        x"&&display5=="        0"&&display6=="        x"&&display9==" "&&display1==" "&&display3==" "&&display7==" "&&display4==" "&&display2==" ")
            {
                display9="        0";
                jtf9.setText(display9); 
            }
            if(display8=="        x"&&display5=="        0"&&display6=="        x"&&display4==" "&&display3==" "&&display7==" "&&display2==" ")
            {
                if(display1=="        x"&&display9=="        0"&&display7==" ")
                    display7="        0";
                jtf7.setText(display7);
            }

            if(display1=="        x"&&display5=="        0"&&display9=="        x"&&display2==" "&&display8==" "&&display3==" "&&display7==" "&&display4==" "&&display6==" ")
            {
                display2="        0";
                jtf2.setText(display2); 
            }
            if(display3=="        x"&&display5=="        0"&&display7=="        x"&&display4==" "&&display2==" "&&display1==" "&&display6==" "&&display8==" "&&display9==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }

            if(display1=="        x"&&display5=="        0"&&display2==" "&&display3==" "&&display4==" "&&display7==" "&&display9==" ")
            {
                if(display8=="        x"&&display6==" "&&display7==" ")
                    display7="        0";
                jtf7.setText(display7); 
                if(display6=="        x"&&display8==" "&&display3==" ")
                    display3="        0";
                jtf3.setText(display3); 
            }
            if(display3=="        x"&&display5=="        0"&&display2==" "&&display6==" "&&display1==" "&&display7==" "&&display9==" ")
            {
                if(display4=="        x"&&display8==" "&&display1==" ")
                    display1="        0";
                jtf1.setText(display1); 
                if(display8=="        x"&&display4==" "&&display9==" ")
                    display9="        0";
                jtf9.setText(display9); 
            }
            if(display7=="        x"&&display5=="        0"&&display1==" "&&display3==" "&&display4==" "&&display8==" "&&display9==" ")
            {
                if(display2=="        x"&&display6==" "&&display1==" ")
                    display1="        0";
                jtf1.setText(display1); 
                if(display6=="        x"&&display2==" "&&display9==" ")
                    display9="        0";
                jtf9.setText(display9); 
            }
            if(display9=="        x"&&display5=="        0"&&display6==" "&&display3==" "&&display1==" "&&display7==" "&&display8==" ")
            {
                if(display2=="        x"&&display4==" "&&display3==" ")
                    display3="        0";
                jtf3.setText(display3); 
                if(display4=="        x"&&display2==" "&&display7==" ")
                    display7="        0";
                jtf7.setText(display7); 
            }

            if(display1=="        x"&&display3=="        x"&&display8=="        x"&&display5=="        0"&&display2=="        0"&&display4==" "&&display7==" "&&display6==" "&&display9==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }

            if(display7=="        x"&&display9=="        x"&&display2=="        x"&&display5=="        0"&&display8=="        0"&&display4==" "&&display1==" "&&display6==" "&&display3==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }

            if(display1=="        x"&&display7=="        x"&&display6=="        x"&&display5=="        0"&&display4=="        0"&&display2==" "&&display3==" "&&display8==" "&&display9==" ")
            {
                display2="        0";
                jtf2.setText(display2); 
            }

            if(display3=="        x"&&display9=="        x"&&display4=="        x"&&display5=="        0"&&display6=="        0"&&display2==" "&&display1==" "&&display8==" "&&display7==" ")
            {
                display2="        0";
                jtf2.setText(display2); 
            }

            if(display2=="        x"&&display9=="        x"&&display5=="        x"&&display1=="        0"&&display8=="        0"&&display3==" "&&display6==" "&&display7==" "&&display4==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }

            if(display4=="        x"&&display9=="        x"&&display5=="        x"&&display1=="        0"&&display6=="        0"&&display8==" "&&display3==" "&&display7==" "&&display2==" ")
            {
                display3="        0";
                jtf3.setText(display3); 
            }

            if(display7=="        x"&&display2=="        x"&&display9=="        x"&&display5=="        x"&&display1=="        0"&&display3=="        0"&&display8=="        0"&&display6==" "&&display4==" ")
            {
                display4="        0";
                jtf4.setText(display4); 
            }

            if(display1=="        x"&&display6=="        x"&&display7=="        x"&&display8=="        x"&&display4=="        0"&&display5=="        0"&&display9=="        0"&&display2==" "&&display3==" ")
            {
                display3="        0";
                jtf3.setText(display3); 
            }

            if(display1=="        x"&&display6=="        x"&&display2=="        x"&&display7=="        x"&&display4=="        0"&&display5=="        0"&&display3=="        0"&&display8==" "&&display9==" ")
            {
                display8="        0";
                jtf8.setText(display8); 
            }

            if(display3=="        x"&&display4=="        x"&&display8=="        x"&&display9=="        x"&&display5=="        0"&&display6=="        0"&&display7=="        0"&&display1==" "&&display2==" ")
            {
                display2="        0";
                jtf2.setText(display2); 
            }

            if(display3=="        x"&&display4=="        x"&&display2=="        x"&&display9=="        x"&&display5=="        0"&&display6=="        0"&&display1=="        0"&&display7==" "&&display8==" ")
            {
                display8="        0";
                jtf8.setText(display8); 
            }

            if(display7=="        x"&&display4=="        x"&&display2=="        x"&&display9=="        x"&&display5=="        0"&&display8=="        0"&&display1=="        0"&&display3==" "&&display6==" ")
            {
                display3="        0";
                jtf3.setText(display3); 
            }

            if(display7=="        x"&&display6=="        x"&&display2=="        x"&&display9=="        x"&&display5=="        0"&&display8=="        0"&&display3=="        0"&&display1==" "&&display4==" ")
            {
                display1="        0";
                jtf1.setText(display1); 
            }

            if(display1=="        x"&&display3=="        x"&&display6=="        x"&&display8=="        x"&&display5=="        0"&&display9=="        0"&&display2=="        0"&&display4==" "&&display7==" ")
            {
                display7="        0";
                jtf7.setText(display7); 
            }

            if(display1=="        0"&&display2=="        0"&&display3=="        0"||display3=="        0"&&display6=="        0"&&display9=="        0"||display9=="        0"&&display8=="        0"&&display7=="        0"||display7=="        0"&&display4=="        0"&&display1=="        0"||display5=="        0"&&display2=="        0"&&display8=="        0"||display4=="        0"&&display5=="        0"&&display6=="        0"||display3=="        0"&&display5=="        0"&&display7=="        0"||display9=="        0"&&display1=="        0"&&display5=="        0")
            {
                jtfR.setText("Computer 'won' and you 'lose'");  
            }

            else if(display1=="        x"&&display2=="        x"&&display3=="        x"||display3=="        x"&&display6=="        x"&&display9=="        x"||display9=="        x"&&display8=="        x"&&display7=="        x"||display7=="        x"&&display4=="        x"&&display1=="        x"||display5=="        x"&&display2=="        x"&&display8=="        x"||display4=="        x"&&display5=="        x"&&display6=="        x"||display3=="        x"&&display5=="        x"&&display7=="        x"||display9=="        x"&&display1=="        x"&&display5=="        x")
            {
                jtfR.setText("You 'won' and Computer 'lose'");  
            }

            else
            {
                if(display1!=" "&&display2!=" "&&display3!=" "&&display4!=" "&&display5!=" "&&display6!=" "&&display6!=" "&&display7!=" "&&display8!=" "&&display9!=" ")
                {
                    jtfR.setText("                  .....Match Draw.....");  
                }
            }
        }
    }
    class ListenToreplay implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
            jtf1.setText(d1);
            jtf2.setText(d2);
            jtf3.setText(d3);
            jtf4.setText(d4);
            jtf5.setText(d5);
            jtf6.setText(d6);
            jtf7.setText(d7);
            jtf8.setText(d8);
            jtf9.setText(d9);  
            jtfR.setText("First hand was of Player");  
        }
    }
    public static void main(String []args)
    {
        JFrame criss_cross_game = new JFrame("game");
        tic_tac_toe calc = new tic_tac_toe();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);//                               made   by   sudeep  sharma    
    }  
}