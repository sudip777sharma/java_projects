import java.awt.*;      
import java.awt.event.*;     
import javax.swing.*;     
import java.awt.Dimension;     
import javax.swing.JFrame;     
import javax.swing.JPanel;     
public class puzzle extends JFrame      
{     
          JButton jbtNum1;     
          JButton jbtNum2;     
          JButton jbtNum3;     
          JButton jbtNum4;     
          JButton jbtNum5;     
          JButton jbtNum6;     
          JButton jbtNum7;     
          JButton jbtNum8;
          JButton jbtNum9;
          JButton jbtdone;
          JButton jbtnewgame;//
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
        public puzzle() 
    {	
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3,3));     
        p2.add(jtf1 = new JTextField(2));
        p2.add(jtf2 = new JTextField(2));     
        p2.add(jtf3 = new JTextField(2));
        p2.add(jtf4 = new JTextField(2));
        p2.add(jtf5 = new JTextField(2));     
        p2.add(jtf6 = new JTextField(2)); 
        p2.add(jtf7 = new JTextField(2));
        p2.add(jtf8 = new JTextField(2));
        p2.add(jtf9 = new JTextField(2));  
        jtf1.setEditable(false);
        jtf2.setEditable(false);
        jtf3.setEditable(false);     
        jtf4.setEditable(false);
        jtf5.setEditable(false);          
        jtf6.setEditable(false);
        jtf7.setEditable(false);
        jtf8.setEditable(false);   
        jtf9.setEditable(false);    
            
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,3));     
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtNum4 = new JButton("4"));          
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));     
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(3,10434534));
        p3.add(jbtnewgame = new JButton("New Game"));
        p3.add(jtfR = new JTextField(2));
        p3.add(jbtdone = new JButton("Done"));

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(550,200));
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.CENTER);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.SOUTH);  
        
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
        jbtdone.addActionListener(new ListenTodone());
        jbtnewgame.addActionListener(new ListenTonewgame());
    }
    
    class ListenToOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        { 
            if(display2==" ")
            {
                display2=display1;
                display1=" ";
                jtf2.setText(display2);
                jtf1.setText(display1);
            }
            if(display4.equals(" "))
            { 
                display4=display1;
                display1=" ";
              jtf4.setText(display4);  
              jtf1.setText(display1);
             }
            }
       }
    class ListenToTwo implements ActionListener      
    {
        public void actionPerformed(ActionEvent e)
        {
           if(display5==" ")
            {
                display5=display2;
                display2=" ";
                jtf5.setText(display5);
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
        }
    }
    class ListenToThree implements ActionListener 
    {     
        public void actionPerformed(ActionEvent e) 
        {
            if(display2==" ")
            {
                display2=display3;
                display3=" ";
                jtf2.setText(display2);
                jtf3.setText(display3);
            }
            if(display6.equals(" "))
            {    
                display6=display3;
                display3=" ";
              jtf6.setText(display6);
              jtf3.setText(display3);
             }  
        }
    }
    class ListenToFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           if(display1==" ")
            {
                display1=display4;
                display4=" ";
                jtf1.setText(display1);
                jtf4.setText(display4);
            }
           if(display5.equals(" "))
            { 
               display5=display4;
               display4=" ";
              jtf5.setText(display5); 
              jtf4.setText(display4);
             }
           if(display7==" ")
            {
                display7=display4;
                display4=" ";
                jtf7.setText(display7);
                jtf4.setText(display4);
            } 
        }
    }
    class ListenToFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           if(display2==" ")
            {
                display2=display5;
                display5=" ";
                jtf2.setText(display2);
                jtf5.setText(display5);
            }
           if(display4.equals(" "))
            { 
               display4=display5;
               display5=" ";
              jtf4.setText(display4); 
              jtf5.setText(display5);
             }
           if(display6==" ")
            {
                display6=display5;
                display5=" ";
                jtf6.setText(display6);
                jtf5.setText(display5);
            }
           if(display8==" ")
            {
                display8=display5;
                display5=" ";
                jtf8.setText(display8);
                jtf5.setText(display5);
            }
        }
    }                              
    class ListenToSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           if(display3==" ")
            {
                display3=display6;
                display6=" ";
                jtf3.setText(display3);
                jtf6.setText(display6);
            }
           if(display5.equals(" "))
            { 
               display5=display6;
               display6=" ";
              jtf5.setText(display5); 
              jtf6.setText(display6);
             }
           if(display9==" ")
            {
                display9=display6;
                display6=" ";
                jtf9.setText(display9);
                jtf6.setText(display6);
            } 
        }
    }
    class ListenToSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
          if(display4==" ")
            {
                display4=display7;
                display7=" ";
                jtf4.setText(display4);
                jtf7.setText(display7);
            }
          if(display8.equals(" "))
            {    
              display8=display7;
              display7=" ";
              jtf8.setText(display8);
              jtf7.setText(display7);
            } 
        }
    }
    class ListenToEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
          if(display5==" ")
            {
                display5=display8;
                display8=" ";
                jtf5.setText(display5);
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
        }
    }
    class ListenTonine implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
          if(display6==" ")
            {
                display6=display9;
                display9=" ";
                jtf6.setText(display6);
                jtf9.setText(display9);
            }
          if(display8.equals(" "))
            {    
              display8=display9;
              display9=" ";
              jtf8.setText(display8);
              jtf9.setText(display9);
            }    
        }
    }
     class ListenTonewgame implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
           display1="      [6]";
           display2="      [4]";
           display3="      [3]";
           display4="      [2]";
           display5="      [1]";
           display6="      [7]";
           display7="      [5]";
           display8="      [8]";
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
           jtfR.setText("");  
        }
    }
      class ListenTodone implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
         if(display1=="      [1]"&&display2=="      [2]"&&display3=="      [3]"&&display4=="      [4]"&&display5=="      [5]"&&display6=="      [6]"&&display7=="      [7]"&&display8=="      [8]")
         {
           jtfR.setText(" =-=-=-=-=-'Well done'-=-=-=-=-=");  
          }
        }
    }
      public static void main(String[] args)
    {
         JFrame game = new JFrame("game");
        puzzle calc = new puzzle();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);     
    }  
}