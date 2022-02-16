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
public class Puzzle2 extends JFrame //                               made   by   sudeep  sharma    
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
          JButton jbtNum10;
          JButton jbtNum11;//                               made   by   sudeep  sharma    
          JButton jbtNum12;//                               made   by   sudeep  sharma    
          JButton jbtNum13;//                               made   by   sudeep  sharma    
          JButton jbtNum14;//                               made   by   sudeep  sharma    
          JButton jbtNum15;//                               made   by   sudeep  sharma    
          JButton jbtNum16;//                               made   by   sudeep  sharma    
          JButton jbtNum17;//                               made   by   sudeep  sharma    
          JButton jbtNum18;
          JButton jbtNum19;
          JButton jbtNum20;
          JButton jbtNum21;
          JButton jbtNum22;
          JButton jbtNum23;
          JButton jbtNum24;
          JButton jbtNum25;
          JButton jbtdone;
          JButton jbtnewgame;
          JButton jbtresume;
          JTextField jtf1;
          JTextField jtf2;
          JTextField jtf3;
          JTextField jtf4;
          JTextField jtf5;
          JTextField jtf6;
          JTextField jtf7;
          JTextField jtf8;
          JTextField jtf9;
          JTextField jtf10;
          JTextField jtf11;
          JTextField jtf12;
          JTextField jtf13;
          JTextField jtf14;
          JTextField jtf15;
          JTextField jtf16;
          JTextField jtf17;
          JTextField jtf18;
          JTextField jtf19;
          JTextField jtf20;
          JTextField jtf21;
          JTextField jtf22;
          JTextField jtf23;
          JTextField jtf24;
          JTextField jtf25;
          
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
        String display10;
        String display11;
        String display12;
        String display13;
        String display14;
        String display15;
        String display16;
        String display17;
        String display18;
        String display19;
        String display20;
        String display21;
        String display22;
        String display23;
        String display24;
        String display25;
        
        String d1;
        String d2;
        String d3;
        String d4;
        String d5;
        String d6;
        String d7;
        String d8;
        String d9;
        String d10;
        String d11;
        String d12;
        String d13;
        String d14;
        String d15;
        String d16;
        String d17;
        String d18;
        String d19;
        String d20;
        String d21;
        String d22;
        String d23;
        String d24;
        String d25;
           
        public Puzzle2() 
    {	
        
        JPanel bar = new JPanel();
        bar.setLayout(new GridLayout(3,1));
        bar.add(jtfR = new JTextField(2));
        bar.add(jbtnewgame = new JButton("New game"));
        bar.add(jbtresume = new JButton("Re-play"));

        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5,5));//                               made   by   sudeep  sharma    
        p2.add(jtf1 = new JTextField(2));
        p2.add(jtf2 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf3 = new JTextField(2));
        p2.add(jtf4 = new JTextField(2));
        p2.add(jtf5 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf6 = new JTextField(2)); 
        p2.add(jtf7 = new JTextField(2));
        p2.add(jtf8 = new JTextField(2));
        p2.add(jtf9 = new JTextField(2));
        p2.add(jtf10 = new JTextField(2));
        p2.add(jtf11 = new JTextField(2));
        p2.add(jtf12 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf13 = new JTextField(2));
        p2.add(jtf14 = new JTextField(2));
        p2.add(jtf15 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf16 = new JTextField(2)); 
        p2.add(jtf17 = new JTextField(2));
        p2.add(jtf18 = new JTextField(2));
        p2.add(jtf19 = new JTextField(2));
        p2.add(jtf20 = new JTextField(2));
        p2.add(jtf21 = new JTextField(2));//                               made   by   sudeep  sharma    
        p2.add(jtf22 = new JTextField(2)); 
        p2.add(jtf23 = new JTextField(2));
        p2.add(jtf24 = new JTextField(2));
        p2.add(jtf25 = new JTextField(2));
        
        jtf1.setEditable(false);
        jtf2.setEditable(false);
        jtf3.setEditable(false);//                               made   by   sudeep  sharma    
        jtf4.setEditable(false);
        jtf5.setEditable(false);//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        jtf6.setEditable(false);
        jtf7.setEditable(false);
        jtf8.setEditable(false);   
        jtf9.setEditable(false);
        jtf10.setEditable(false);
        jtf11.setEditable(false);
        jtf12.setEditable(false);
        jtf13.setEditable(false);//                               made   by   sudeep  sharma    
        jtf14.setEditable(false);
        jtf15.setEditable(false);//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        jtf16.setEditable(false);
        jtf17.setEditable(false);
        jtf18.setEditable(false);   
        jtf19.setEditable(false);
        jtf20.setEditable(false);
        jtf21.setEditable(false);
        jtf22.setEditable(false);
        jtf23.setEditable(false);//                               made   by   sudeep  sharma    
        jtf24.setEditable(false);
        jtf25.setEditable(false);
        
        jtfR.setEditable(false);
        
            
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,5));//                               made   by   sudeep  sharma    
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtNum4 = new JButton("4"));//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));//                               made   by   sudeep  sharma 
        p1.add(jbtNum10 = new JButton("10"));//                               made   by   sudeep  sharma 
        p1.add(jbtNum11 = new JButton("11"));
        p1.add(jbtNum12 = new JButton("12"));
        p1.add(jbtNum13 = new JButton("13"));
        p1.add(jbtNum14 = new JButton("14"));//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        p1.add(jbtNum15 = new JButton("15"));
        p1.add(jbtNum16 = new JButton("16"));
        p1.add(jbtNum17 = new JButton("17"));
        p1.add(jbtNum18 = new JButton("18"));
        p1.add(jbtNum19 = new JButton("19"));
        p1.add(jbtNum20 = new JButton("20"));
        p1.add(jbtNum21 = new JButton("21"));
        p1.add(jbtNum22 = new JButton("22"));
        p1.add(jbtNum23 = new JButton("23"));
        p1.add(jbtNum24 = new JButton("24"));//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
        p1.add(jbtNum25 = new JButton("25"));

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(900,300));
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
        jbtNum10.addActionListener(new ListenToten());
        jbtNum11.addActionListener(new ListenToeleven());
        jbtNum12.addActionListener(new ListenTotwelve());
        jbtNum13.addActionListener(new ListenTothirteen());
        jbtNum14.addActionListener(new ListenTofourteen());
        jbtNum15.addActionListener(new ListenTofifteen());
        jbtNum16.addActionListener(new ListenTosixteen());
        jbtNum17.addActionListener(new ListenToseventeen());
        jbtNum18.addActionListener(new ListenToeighteen());
        jbtNum19.addActionListener(new ListenToninteen());
        jbtNum20.addActionListener(new ListenTotwenty());
        jbtNum21.addActionListener(new ListenTotwentyone());
        jbtNum22.addActionListener(new ListenTotwentytwo());
        jbtNum23.addActionListener(new ListenTotwentythree());
        jbtNum24.addActionListener(new ListenTotwentyfour());
        jbtNum25.addActionListener(new ListenTotwentyfive());
        
        jbtnewgame.addActionListener(new ListenTonewgame());
        jbtresume.addActionListener(new ListenToresume());
    }
    public void Graphics(Graphics g)
    {
      Color purple = new Color(134, 345, 344);
        g.setColor(purple);  
    }
    
    class ListenToOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            if(display2==" ")
            {
                display2=display1;
                display1=" ";
                jtf2.setText(display2);
                jtf1.setText(display1);
            }
            if(display6.equals(" "))
            { 
                display6=display1;
                display1=" ";
              jtf6.setText(display6);  
              jtf1.setText(display1);
             }
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
            }
       }
    class ListenToTwo implements ActionListener //                               made   by   sudeep  sharma    
    {
        public void actionPerformed(ActionEvent e)
        {
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display7==" ")
            {
                display7=display2;
                display2=" ";
                jtf7.setText(display7);
                jtf2.setText(display2);
            }
           if(display1.equals(" "))
            { 
               display1=display2;
               display2=" ";
              jtf1.setText(display1); 
              jtf2.setText(display2);
             }
             if(display3==" ")
            {
                display3=display2;
                display2=" ";
                jtf3.setText(display3);
                jtf2.setText(display2);
            }  
           if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToThree implements ActionListener 
    {//                               made   by   sudeep  sharma    
        public void actionPerformed(ActionEvent e) 
        {
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            if(display2==" ")
            {
                display2=display3;
                display3=" ";
                jtf2.setText(display2);
                jtf3.setText(display3);
            }
            if(display4.equals(" "))
            {    
                display4=display3;
                display3=" ";
              jtf4.setText(display4);
              jtf3.setText(display3);
             } 
            if(display8.equals(" "))
            {    
                display8=display3;
                display3=" ";
              jtf8.setText(display8);
              jtf3.setText(display3);
             } 
           if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display3==" ")
            {
                display3=display4;
                display4=" ";
                jtf3.setText(display3);
                jtf4.setText(display4);
            }
           if(display5.equals(" "))
            { 
               display5=display4;
               display4=" ";
              jtf5.setText(display5); 
              jtf4.setText(display4);
             }
           if(display9==" ")
            {
                display9=display4;
                display4=" ";
                jtf9.setText(display9);
                jtf4.setText(display4);
            } 
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           d9=display9;
           if(display10==" ")
            {
                display10=display5;
                display5=" ";
                jtf10.setText(display10);
                jtf5.setText(display5);
            }
           if(display4.equals(" "))
            { 
               display4=display5;
               display5=" ";
              jtf4.setText(display4); 
              jtf5.setText(display5);
             }
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }//                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    //                               made   by   sudeep  sharma    
    class ListenToSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
         d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           d9=display9;
           if(display1==" ")
            {
                display1=display6;
                display6=" ";
                jtf1.setText(display1);
                jtf6.setText(display6);
            }
           if(display7.equals(" "))
            { 
               display7=display6;
               display6=" ";
              jtf7.setText(display7); 
              jtf6.setText(display6);
             }
           if(display11==" ")
            {
                display11=display6;
                display6=" ";
                jtf11.setText(display11);
                jtf6.setText(display6);
            } 
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
          if(display2==" ")
            {
                display2=display7;
                display7=" ";
                jtf2.setText(display2);
                jtf7.setText(display7);
            }
          if(display8.equals(" "))
            {    
              display8=display7;
              display7=" ";
              jtf8.setText(display8);
              jtf7.setText(display7);
            }
          if(display6==" ")
            {
                display6=display7;
                display7=" ";
                jtf6.setText(display6);
                jtf7.setText(display7);
            }
          if(display12.equals(" "))
            {    
              display12=display7;
              display7=" ";
              jtf12.setText(display12);
              jtf7.setText(display7);
            }   
            
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
        d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            if(display3==" ")
            {
                display3=display8;
                display8=" ";
                jtf3.setText(display3);
                jtf8.setText(display8);
            }
            if(display13==" ")
            {
                display13=display8;
                display8=" ";
                jtf13.setText(display13);
                jtf8.setText(display8);
            }
           if(display7.equals(" "))
            { 
               display7=display8;
               display8=" ";
              jtf7.setText(display7); 
              jtf8.setText(display8);
             }
           if(display9==" ")
            {
                display9=display8;
                display8=" ";
                jtf9.setText(display9);
                jtf8.setText(display8);
            }  
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenTonine implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
          if(display4==" ")
            {
                display4=display9;
                display9=" ";
                jtf4.setText(display4);
                jtf9.setText(display9);
            }
          if(display8.equals(" "))
            {    
              display8=display9;
              display9=" ";
              jtf8.setText(display8);
              jtf9.setText(display9);
            }
         if(display10==" ")
            {
                display10=display9;
                display9=" ";
                jtf10.setText(display10);
                jtf9.setText(display9);
            }
          if(display14.equals(" "))
            {    
              display14=display9;
              display9=" ";
              jtf14.setText(display14);
              jtf9.setText(display9);
            }               
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
    class ListenToten implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           
           if(display5==" ")
            {
                display5=display10;
                display10=" ";
                jtf5.setText(display5);
                jtf10.setText(display10);
            }
          if(display9.equals(" "))
            {    
              display9=display10;
              display10=" ";
              jtf9.setText(display9);
              jtf10.setText(display10);
            }
         if(display15==" ")
            {
                display15=display10;
                display10=" ";
                jtf15.setText(display15);
                jtf10.setText(display10);
            }
           if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          } 
        }
       }
    class ListenToeleven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            
           if(display6==" ")
            {
                display6=display11;
                display11=" ";
                jtf6.setText(display6);
                jtf11.setText(display11);
            }
          if(display12.equals(" "))
            {    
              display12=display11;
              display11=" ";
              jtf12.setText(display12);
              jtf11.setText(display11);
            }
         if(display16==" ")
            {
                display16=display11;
                display11=" ";
                jtf16.setText(display16);
                jtf11.setText(display11);
            }
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }  
        }
       }
    class ListenTotwelve implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            if(display7==" ")
            {
                display7=display12;
                display12=" ";
                jtf7.setText(display7);
                jtf12.setText(display12);
            }
          if(display11.equals(" "))
            {    
              display11=display12;
              display12=" ";
              jtf11.setText(display11);
              jtf12.setText(display12);
            }
         if(display13==" ")
            {
                display13=display12;
                display12=" ";
                jtf13.setText(display13);
                jtf12.setText(display12);
            }
            if(display17==" ")
            {
                display17=display12;
                display12=" ";
                jtf17.setText(display17);
                jtf12.setText(display12);
            }
            if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTothirteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display8==" ")
            {
                display8=display13;
                display13=" ";
                jtf8.setText(display8);
                jtf13.setText(display13);
            }
          if(display12.equals(" "))
            {    
              display12=display13;
              display13=" ";
              jtf12.setText(display12);
              jtf13.setText(display13);
            }
         if(display14==" ")
            {
                display14=display13;
                display13=" ";
                jtf14.setText(display14);
                jtf13.setText(display13);
            }
            if(display18==" ")
            {
                display18=display13;
                display13=" ";
                jtf18.setText(display18);
                jtf13.setText(display13);
            }
           if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          } 
        }
       }
    class ListenTofourteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display9==" ")
            {
                display9=display14;
                display14=" ";
                jtf9.setText(display9);
                jtf14.setText(display14);
            }
          if(display13.equals(" "))
            {    
              display13=display14;
              display14=" ";
              jtf13.setText(display13);
              jtf14.setText(display14);
            }
         if(display15==" ")
            {
                display15=display14;
                display14=" ";
                jtf15.setText(display15);
                jtf14.setText(display14);
            }
            if(display19==" ")
            {
                display19=display14;
                display14=" ";
                jtf19.setText(display19);
                jtf14.setText(display14);
            }
           if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          } 
        }
       }
    class ListenTofifteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
         d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display10==" ")
            {
                display10=display15;
                display15=" ";
                jtf10.setText(display10);
                jtf15.setText(display15);
            }
          if(display14.equals(" "))
            {    
              display14=display15;
              display15=" ";
              jtf14.setText(display14);
              jtf15.setText(display15);
            }
         if(display20==" ")
            {
                display20=display15;
                display15=" ";
                jtf20.setText(display20);
                jtf15.setText(display15);
            }
          if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }  
        }
       }
    class ListenTosixteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display11==" ")
            {
                display11=display16;
                display16=" ";
                jtf11.setText(display11);
                jtf16.setText(display16);
            }
          if(display17.equals(" "))
            {    
              display17=display16;
              display16=" ";
              jtf17.setText(display17);
              jtf16.setText(display16);
            }
         if(display21==" ")
            {
                display21=display16;
                display16=" ";
                jtf21.setText(display21);
                jtf16.setText(display16);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenToseventeen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display12==" ")
            {
                display12=display17;
                display17=" ";
                jtf12.setText(display12);
                jtf17.setText(display17);
            }
          if(display16.equals(" "))
            {    
              display16=display17;
              display17=" ";
              jtf16.setText(display16);
              jtf17.setText(display17);
            }
         if(display18==" ")
            {
                display18=display17;
                display17=" ";
                jtf18.setText(display18);
                jtf17.setText(display17);
            }
            if(display22==" ")
            {
                display22=display17;
                display17=" ";
                jtf22.setText(display22);
                jtf17.setText(display17);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenToeighteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display13==" ")
            {
                display13=display18;
                display18=" ";
                jtf13.setText(display13);
                jtf18.setText(display18);
            }
          if(display17.equals(" "))
            {    
              display17=display18;
              display18=" ";
              jtf17.setText(display17);
              jtf18.setText(display18);
            }
         if(display19==" ")
            {
                display19=display18;
                display18=" ";
                jtf19.setText(display19);
                jtf18.setText(display18);
            }
            if(display23==" ")
            {
                display23=display18;
                display18=" ";
                jtf23.setText(display23);
                jtf18.setText(display18);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenToninteen implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display14==" ")
            {
                display14=display19;
                display19=" ";
                jtf14.setText(display14);
                jtf19.setText(display19);
            }
          if(display18.equals(" "))
            {    
              display18=display19;
              display19=" ";
              jtf18.setText(display18);
              jtf19.setText(display19);
            }
         if(display20==" ")
            {
                display20=display19;
                display19=" ";
                jtf20.setText(display20);
                jtf19.setText(display19);
            }
            if(display24==" ")
            {
                display24=display19;
                display19=" ";
                jtf24.setText(display24);
                jtf19.setText(display19);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwenty implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display15==" ")
            {
                display15=display20;
                display20=" ";
                jtf15.setText(display15);
                jtf20.setText(display20);
            }
          if(display19.equals(" "))
            {    
              display19=display20;
              display20=" ";
              jtf19.setText(display19);
              jtf20.setText(display20);
            }
         if(display25==" ")
            {
                display25=display20;
                display20=" ";
                jtf25.setText(display25);
                jtf20.setText(display20);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwentyone implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display16==" ")
            {
                display16=display21;
                display21=" ";
                jtf16.setText(display16);
                jtf21.setText(display21);
            }
          if(display22.equals(" "))
            {    
              display22=display21;
              display21=" ";
              jtf22.setText(display22);
              jtf21.setText(display21);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwentytwo implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display17==" ")
            {
                display17=display22;
                display22=" ";
                jtf17.setText(display17);
                jtf22.setText(display22);
            }
          if(display21.equals(" "))
            {    
              display21=display22;
              display22=" ";
              jtf21.setText(display21);
              jtf22.setText(display22);
            }
         if(display23==" ")
            {
                display23=display22;
                display22=" ";
                jtf23.setText(display23);
                jtf22.setText(display22);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwentythree implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
           if(display18==" ")
            {
                display18=display23;
                display23=" ";
                jtf18.setText(display18);
                jtf23.setText(display23);
            }
          if(display22.equals(" "))
            {    
              display22=display23;
              display23=" ";
              jtf22.setText(display22);
              jtf23.setText(display23);
            }
         if(display24==" ")
            {
                display24=display23;
                display23=" ";
                jtf24.setText(display24);
                jtf23.setText(display23);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwentyfour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
          d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25; 
           if(display19==" ")
            {
                display19=display24;
                display24=" ";
                jtf19.setText(display19);
                jtf24.setText(display24);
            }
          if(display23.equals(" "))
            {    
              display23=display24;
              display24=" ";
              jtf23.setText(display23);
              jtf24.setText(display24);
            }
         if(display25==" ")
            {
                display25=display24;
                display24=" ";
                jtf25.setText(display25);
                jtf24.setText(display24);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
    class ListenTotwentyfive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
           d1= display1;
           d2=display2;
           d3=display3;
           d4=display4;
           d5=display5;
           d6=display6;
           d7=display7;
           d8=display8;
           d9=display9;
           d10=display10;
           d11=display11;
           d12=display12;
           d13=display13;
           d14=display14;
           d15=display15;
           d16=display16;
           d17=display17;
           d18=display18;
           d19=display19;
           d20=display20;
           d21=display21;
           d22=display22;
           d23=display23;
           d24=display24;
           d25=display25;
            if(display20==" ")
            {
                display20=display25;
                display25=" ";
                jtf20.setText(display20);
                jtf25.setText(display25);
            }
          if(display24.equals(" "))
            {    
              display24=display25;
              display25=" ";
              jtf24.setText(display24);
              jtf25.setText(display25);
            }
             if(display1=="      [A]"&&display2=="      [B]"&&display3=="      [C]"&&display4=="      [D]"&&display5=="      [E]"&&display6=="      [F]"&&display7=="      [G]"&&display8=="      [H]"&&display9=="      [I]"&&display10=="      [J]"&&display11=="      [K]"&&display12=="      [L]"&&display13=="      [M]"&&display14=="      [N]"&&display15=="      [O]"&&display16=="      [P]"&&display17=="      [Q]"&&display18=="      [R]"&&display19=="      [S]"&&display20=="      [T]"&&display21=="      [U]"&&display22=="      [V]"&&display23=="      [W]"&&display24=="      [X]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
       }
     class ListenTonewgame implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           display1="      [F]";
           display2="      [G]";
           display3="      [C]";
           display4="      [E]";
           display5="      [D]";
           display6="      [Q]";
           display7="      [M]";
           display8="      [L]";
           display9="      [B]";
           display10="      [J]";
           display11="      [S]";
           display12="      [A]";
           display13="      [V]";
           display14="      [X]";
           display15="      [T]";
           display16="      [P]";
           display17="      [K]";
           display18="      [R]";
           display19="      [N]";
           display20="      [I]";
           display21="      [U]";
           display22="      [W]";
           display23="      [O]";
           display24="      [H]";
           display25=" ";
           jtf1.setText(display1);
           jtf2.setText(display2);
           jtf3.setText(display3);
           jtf4.setText(display4);
           jtf5.setText(display5);
           jtf6.setText(display6);
           jtf7.setText(display7);
           jtf8.setText(display8);
           jtf9.setText(display9);
           jtf10.setText(display10);
           jtf11.setText(display11);
           jtf12.setText(display12);
           jtf13.setText(display13);
           jtf14.setText(display14);
           jtf15.setText(display15);
           jtf16.setText(display16);
           jtf17.setText(display17);
           jtf18.setText(display18);
           jtf19.setText(display19);
           jtf20.setText(display20);
           jtf21.setText(display21);
           jtf22.setText(display22);
           jtf23.setText(display23);
           jtf24.setText(display24);
           jtf25.setText(display25);
           jtfR.setText("");  
        }
    }
     class ListenToresume implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           display1=d1;
           display2=d2;
           display3=d3;
           display4=d4;
           display5=d5;
           display6=d6;
           display7=d7;
           display8=d8;
           display9=d9;
           display10=d10;
           display11=d11;
           display12=d12;
           display13=d13;
           display14=d14;
           display15=d15;
           display16=d16;
           display17=d17;
           display18=d18;
           display19=d19;
           display20=d20;
           display21=d21;
           display22=d22;
           display23=d23;
           display24=d24;
           display25=d25;
           
           jtf1.setText(display1);
           jtf2.setText(display2);
           jtf3.setText(display3);
           jtf4.setText(display4);
           jtf5.setText(display5);
           jtf6.setText(display6);
           jtf7.setText(display7);
           jtf8.setText(display8);
           jtf9.setText(display9);
           jtf10.setText(display10);
           jtf11.setText(display11);
           jtf12.setText(display12);
           jtf13.setText(display13);
           jtf14.setText(display14);
           jtf15.setText(display15);
           jtf16.setText(display16);
           jtf17.setText(display17);
           jtf18.setText(display18);
           jtf19.setText(display19);
           jtf20.setText(display20);
           jtf21.setText(display21);
           jtf22.setText(display22);
           jtf23.setText(display23);
           jtf24.setText(display24);
           jtf25.setText(display25);
           jtfR.setText("");  
        }
    }
      public static void main(String[] args)
    {
         JFrame Puzzle2 = new JFrame("game");
        Puzzle2 calc = new Puzzle2();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);//                               made   by   sudeep  sharma    
    }  
}