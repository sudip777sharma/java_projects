import java.awt.*;    
import java.awt.event.*;                     
import javax.swing.*;                     
import java.util.*;                             
import java.awt.Dimension;                         
import javax.swing.JFrame;                     
import java.awt.image.BufferStrategy;                     
import javax.swing.JPanel;                     
public class calculator_gui extends JFrame                      
{                     
    private JButton jbtNum1;                     
    private JButton jbtNum2;                     
    private JButton jbtNum3;                     
    private JButton jbtNum4;                     
    private JButton jbtNum5;                     
    private JButton jbtNum6;                     
    private JButton jbtNum7;                     
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;                     
    private JButton jbtEqual;
    private JButton jbtAdd;                     
    private JButton jbtSubtract;
    private JButton jbtMultiply;                     
    private JButton jbtDivide;
    private JButton jbtpower;                     
    private JButton jbtsqrt;
    private JButton jbtnumroot;                     
    private JButton jbtfactorial;
    private JButton jbtnCr;

    private JButton jbtfactor;
    private JButton jbtSolve;                     
    private JButton jbtpoint;
    private JButton jbtClear;
    private JButton jbtblank;                     
    private JButton jbttime;
    private JButton jbthi;
    private JButton jbtfblank;                     
    private JButton jbtBQ;
    private JButton jbtvalue; 
    private JButton jbtvalue2; 
    private JButton jbtreturn2;                      
    private JButton jbtreturn; 
    private JButton jbtshift;
    private JButton jbtE;
    private JButton jbtE1;
    private JButton jbtE2;
    private JButton jbtE3;
    private JButton jbtE4;
    private JButton jbtE5;

    private JTextField jtfResult;
    private JTextField jtfeResult;
    private JTextField jtftResult;                     
    private JTextField jtfhiResult;
    private JTextField jtfbqResult;
    private JTextField jtfvaResult;
    private JTextField jtfva2Result;                     
    private JTextField jtfqResult;

    private BufferStrategy strategy;

    String s = "";
    private JFrame jfcal;                     
    String value="";
    String value2="";                     
    String an="";                     
    String shift="";
    public calculator_gui() 
    {
        JFrame container = new JFrame();
        JPanel panel = (JPanel) container.getContentPane();

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,2));                     
        p2.add(jtfeResult = new JTextField(25));
        p2.add(jtfResult = new JTextField(25));                     
        p2.add(jtfvaResult = new JTextField(25));

        p2.add(jtfva2Result = new JTextField(25));
        p2.add(jtfhiResult = new JTextField(25));                     
        p2.add(jtfbqResult = new JTextField(25));
                             
        p2.add(jtftResult = new JTextField(25 ));
        p2.add(jtfqResult = new JTextField(25 ));        
                             
        jtfResult.setHorizontalAlignment(JTextField.CENTER);
        jtfeResult.setHorizontalAlignment(JTextField.CENTER);
        jtftResult.setHorizontalAlignment(JTextField.CENTER);
        jtfhiResult.setHorizontalAlignment(JTextField.CENTER);
        jtfbqResult.setHorizontalAlignment(JTextField.CENTER);
        jtfvaResult.setHorizontalAlignment(JTextField.CENTER);
        jtfva2Result.setHorizontalAlignment(JTextField.CENTER);
        jtfqResult.setHorizontalAlignment(JTextField.CENTER);
        jtfResult.setEditable(true);
        jtfeResult.setEditable(false);
        jtftResult.setEditable(false);                     
        jtfhiResult.setEditable(false);
        jtfvaResult.setEditable(false);                                          
        jtfva2Result.setEditable(false);
        jtfbqResult.setEditable(false);
        jtfeResult.setIgnoreRepaint(true);                     

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(0,5));                     
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtAdd = new JButton("+"));
        p1.add(jbtSubtract = new JButton("-"));
        p1.add(jbtNum4 = new JButton("4"));                                          
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtMultiply = new JButton("*"));
        p1.add(jbtDivide = new JButton("/"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));                     
        p1.add(jbtNum9 = new JButton("9"));                 
        p1.add(jbtpower = new JButton("^"));
        p1.add(jbtnumroot = new JButton("Sqrt"));
        p1.add(jbtNum0 = new JButton("0"));
        p1.add(jbtpoint = new JButton("."));
        p1.add(jbtClear = new JButton("Del")); 
        p1.add(jbtblank = new JButton("c"));                     
        p1.add(jbtSolve = new JButton("= "));
        p1.add(jbtvalue = new JButton("A Str"));
        p1.add(jbtreturn = new JButton("A Dra"));
        p1.add(jbtvalue2 = new JButton("("));
        p1.add(jbtreturn2 = new JButton(")"));
        p1.add(jbtE = new JButton("E"));
        p1.add(jbttime = new JButton("Time"));
        p1.add(jbthi = new JButton("HI"));
        p1.add(jbtBQ = new JButton("?"));
        p1.add(jbtfblank = new JButton("[__]"));
        p1.add(jbtshift = new JButton("SHIFT"));
        
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(660,270));
        p.setLayout(new GridLayout());
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
        jbtNum9.addActionListener(new ListenToNine());
        jbtNum0.addActionListener(new ListenToZero());
        jbtClear.addActionListener(new ListenToclear());
        jbtpoint.addActionListener(new ListenTopoint());
        jbtAdd.addActionListener(new ListenToAdd());
        jbtSubtract.addActionListener(new ListenToSubtract());
        jbtMultiply.addActionListener(new ListenToMultiply());
        jbtDivide.addActionListener(new ListenToDivide());                     
        jbtpower.addActionListener(new ListenTopower());
        jbtnumroot.addActionListener(new ListenTonumroot());
        jbtSolve.addActionListener(new ListenToSolve());
        jbtvalue.addActionListener(new ListenTovalue());                     
        jbtreturn.addActionListener(new ListenToreturn());
        jbtblank.addActionListener(new ListenToblank());
        jbttime.addActionListener(new ListenTotime());
        jbthi.addActionListener(new ListenTohi());
        jbtBQ.addActionListener(new ListenToremender());
        jbtfblank.addActionListener(new ListenTofb());
        jbtshift.addActionListener(new ListenToshift());
        jbtE.addActionListener(new ListenToE());
    }                     

    class ListenToOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "1");//made by sudeep sharma
        }
    }
    class ListenToTwo implements ActionListener                      
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "2");
        }
    }
    class ListenToThree implements ActionListener 
    {                     
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "3");
        }
    }
    class ListenToFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();                     
            jtfResult.setText(s + "4");
        }
    }
    class ListenToFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "5");
        }
    }                                                                                                                              
    class ListenToSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "6");
        }
    }
    class ListenToSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "7");
        }
    }
    class ListenToEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "8");
        }
    }
    class ListenToNine implements ActionListener 
    {                                                               
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            jtfResult.setText(s + "9");
        }
    }
    class ListenToZero implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();                                          
            jtfResult.setText(s + "0");
        }
    }

    class ListenToAdd implements ActionListener                                           
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            s=s.concat("+");
            jtfResult.setText(s);

        }
    }
    class ListenToSubtract implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            s=s.concat("-");
            jtfResult.setText(s);
        }
    }
    class ListenToMultiply implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            s = jtfResult.getText();
            s=s.concat("*");
            jtfResult.setText(s);
        }
    }
    class ListenToDivide implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("/");
            jtfResult.setText(s);
        }
    }
    class ListenTopower implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("^");
            jtfResult.setText(s);
        }
    }
    class ListenTosqrt implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("q");
            jtfResult.setText(s);
        }
    }
    class ListenTonumroot implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1="v";
            s = jtfResult.getText();
            s=s.concat(s1);
            jtfResult.setText(s);
        }
    }
    class ListenTofactorial implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("!");
            jtfResult.setText(s);
        }
    }
    class ListenTofactor implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            double ans=Double.parseDouble(s);
            double pro=ans*10; 
            String dis=Double.toString(pro);
            jtfResult.setText(dis);
        }
    }
    class ListenTonCr implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("c");
            jtfResult.setText(s);
        }
    }
    class ListenToE implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();
            s=s.concat("E");
            jtfResult.setText(s);
        }
    }
    class ListenToblank implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText(); 
            s="";
            jtfResult.setText("");
            jtfeResult.setText(" ANSWER:                            =");
            jtfqResult.setText("Made by sudeep sharma");
        }
    }
    class ListenTotime implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String ap="";
            Date d=new Date();
            String s=d.toString();
            String s1=s.substring(0,10);
            String s2=s.substring(24);
            String time=s.substring(11,19);
            String HOUR=s.substring(11,13);
            int hour=Integer.parseInt(HOUR);
            String HOU=s.substring(11,13);
            int hou=Integer.parseInt(HOUR);
            if(hou>12)
            {
                hou=hou-12;
            }
            String MINUTE=s.substring(14,16);
            int minute=Integer.parseInt(MINUTE);
            String SECOND=s.substring(17,19);
            int second=Integer.parseInt(SECOND);
            if(hour<12)
            {
                ap="AM";  
            }
            else if(hour>=12)
            {
                ap="PM";
            }
            jtftResult.setText(" DATE: "+s1+" "+s2);
            jtfhiResult.setText("TIME: "+hou+" : "+minute+" : "+second+" "+ap);
        }
    }
    class ListenToremender implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar c=Calendar.getInstance(); 
            if(c.get(Calendar.DAY_OF_YEAR)==1)
            {
                jtfbqResult.setText(" JANUARY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==2)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==3)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==4)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==5)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==6)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==7)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==8)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==9)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==10)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==11)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==12)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==13)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==14)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==15)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==16)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==17)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==18)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==19)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==20)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==21)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==22)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==23)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==24)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==25)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==26)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==27)
            {
                jtfbqResult.setText("International Day of Commemoration in Memory of the Victims of the Holocaust");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==28)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==29)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==30)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==31)
            {
                jtfbqResult.setText(" JANUARY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==32)
            {
                jtfbqResult.setText(" FEBUARY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==33)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==34)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==35)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==36)
            {
                jtfbqResult.setText("World Cancer Day");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==37)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==38)
            {
                jtfbqResult.setText("International Day of Zero Tolerance to Female Genital Mutilation ");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==39)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==40)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==41)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==42)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==43)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==44)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==45)
            {
                jtfbqResult.setText("World Radio Day ");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==46)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==47)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==48)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==49)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==50)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==51)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==52)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==53)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==54)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==55)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==56)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==57)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==58)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==59)
            {
                jtfbqResult.setText(" FEBUARY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==60)
            {
                jtfbqResult.setText(" MARCH:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==61)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==62)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==63)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==64)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==65)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==66)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==67)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==68)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==69)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==70)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==71)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==72)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==73)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==74)
            {
                jtfbqResult.setText("TODAY IS : MARCH 14 ALBERT EINSTEIN S' BIRTHDAY");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==75)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==76)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==77)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==78)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==79)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==80)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==81)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==82)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==83)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==84)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==85)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==86)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==87)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==88)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==89)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==90)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==91)
            {
                jtfbqResult.setText(" MARCH:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==92)
            {
                jtfbqResult.setText("APRIL:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==93)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==94)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==95)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==96)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==97)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==98)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==99)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==100)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==101)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==102)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==103)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==104)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==105)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==106)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==107)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==108)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==109)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==110)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==111)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==112)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==113)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==114)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==115)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==116)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==117)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==118)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==119)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==120)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==121)
            {
                jtfbqResult.setText("APRIL:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==122)
            {
                jtfbqResult.setText("MAY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==123)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==124)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==125)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==126)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==127)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==128)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==129)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==130)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==131)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==132)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==133)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==134)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==135)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==136)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==137)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==138)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==139)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==140)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==141)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==142)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==143)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==144)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==145)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==146)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==147)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==148)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==149)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==150)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==151)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==152)
            {
                jtfbqResult.setText("MAY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==153)
            {
                jtfbqResult.setText("JUNE:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==154)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==155)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==156)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==157)
            {
                jtfbqResult.setText("                                                                =-=-=-=-=-=-=-=-=-=TODAY IS BEAR GRYILLS BIRTHDAY=-=-=-=-=-=-=-=-=-=");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==158)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==159)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==160)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==161)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==162)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==163)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==164)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==165)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==166)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==167)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==168)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==169)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==170)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==171)
            {
                jtfbqResult.setText("World Refugee Day");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==172)
            {
                jtfbqResult.setText("International Day of Yoga");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==173)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==174)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==175)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==176)
            {
                jtfbqResult.setText("International Widows' Day :25 June");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==177)
            {
                jtfbqResult.setText("Day of the Seafarer :26 June && International Day against Drug Abuse and Illicit Trafficking :26 June");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==178)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==179)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==180)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==181)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==182)
            {
                jtfbqResult.setText("JUNE:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==183)
            {
                jtfbqResult.setText("JULY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==184)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==185)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==186)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==187)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==188)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==189)
            {
                jtfbqResult.setText("=-=-=-=-=-=-=-=-=-=-=-=-=-=GUNGUN S' BIRTHDAY=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==190)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==191)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==192)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==193)
            {
                jtfbqResult.setText("default");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==194)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==195)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==196)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==197)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==198)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==199)
            {
                jtfbqResult.setText("default");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==201)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==202)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==203)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==204)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==205)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==206)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==207)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==208)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==209)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==210)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==211)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==212)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==213)
            {
                jtfbqResult.setText("JULY:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==214)
            {
                jtfbqResult.setText("AUGUST:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==215)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==216)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==217)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==218)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==219)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==220)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==221)
            {
                jtfbqResult.setText("World Day against Trafficking in Persons");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==222)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==223)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==224)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==225)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==226)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==227)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==228)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==229)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==230)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==231)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==232)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==234)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==235)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==236)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==237)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==238)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==239)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==240)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==241)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==242)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==243)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==244)
            {
                jtfbqResult.setText("AUGUST:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==245)
            {
                jtfbqResult.setText("SEPTEMBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==246)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==247)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==248)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==249)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==250)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==251)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==252)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==253)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==254)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==255)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==256)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==257)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==258)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==259)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==260)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==261)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==262)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==263)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==264)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==265)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==266)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==267)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==268)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==269)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==270)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==271)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==272)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==273)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==274)
            {
                jtfbqResult.setText("SEPTEMBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==275)
            {
                jtfbqResult.setText("OCTOBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==276)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==277)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==278)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==279)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==280)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==281)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==282)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==283)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==284)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==285)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==286)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==287)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==288)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==289)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==290)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==291)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==292)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==293)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==294)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==295)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==296)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==297)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==298)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==299)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==300)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==301)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==302)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==303)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==304)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==305)
            {
                jtfbqResult.setText("OCTOBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==306)
            {
                jtfbqResult.setText("NOVEMBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==307)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==308)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==309)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==310)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==311)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==312)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==313)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==314)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==315)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==316)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==317)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==318)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==319)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==320)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==321)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==322)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==323)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==324)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==325)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==326)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==327)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==328)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==329)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==330)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==331)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==332)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==333)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==334)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==335)
            {
                jtfbqResult.setText("NOVEMBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==336)
            {
                jtfbqResult.setText("DECEMBER:");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==337)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==338)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==339)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==340)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==341)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==342)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==343)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==344)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==345)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==346)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==347)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==348)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==349)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==350)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==351)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==352)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==353)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==354)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==355)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==356)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==357)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==358)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==359)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==360)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==361)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==362)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==363)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==364)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==365)
            {
                jtfbqResult.setText("");
            }
            if(c.get(Calendar.DAY_OF_YEAR)==366)
            {
                jtfbqResult.setText("DECEMBER:");
            }
        }
    }
    class ListenTohi implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Date d=new Date();
            String s=d.toString();
            String s1=s.substring(0,10);
            String s2=s.substring(24);
            String time=s.substring(11,19);
            String HOUR=s.substring(11,13);
            int hour=Integer.parseInt(HOUR);
            String HOU=s.substring(11,13);
            int hou=Integer.parseInt(HOUR);
            if(hou>12)
            {
                hou=hou-12;
            }
            String MINUTE=s.substring(14,16);
            int minute=Integer.parseInt(MINUTE);
            String SECOND=s.substring(17,19);
            int second=Integer.parseInt(SECOND);
            if(hour>=1&&hour<12)
            {
                jtfbqResult.setText("....GOOD--MORNING--SIR....");   
            }                     
            if(hour==12&&minute==0)
            {
                jtfbqResult.setText("....GOOD--NOON--SIR....");   
            }
            if(hour>=12&&minute>0&&hour<17)
            {
                jtfbqResult.setText("....GOOD--AFTERNOON--SIR....");   
            }
            if(hour>=17&&hour<21)
            {
                jtfbqResult.setText("....GOOD--EVENING--SIR....");   
            }
            if(hour>=21&&hour<24)
            {                     
                jtfbqResult.setText("....GOOD--NIGHT--SIR....");   
            }
        }
    }
    class ListenTofb implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            value ="";
            value2="";
            jtfvaResult.setText("Empty");
            jtfeResult.setText(" ANSWER:                             =");  
            jtfResult.setText("");                     
            jtfqResult.setText("");
        }
    }

    class ListenToclear implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s= jtfResult.getText();
            int l=s.length();
            StringBuffer s1=new StringBuffer(s);
            if(s!="")
            {
                s1.delete(l-1,l);                     
            }
            else
            {
            }
            s=s1.toString();
            s=s.trim();
            jtfResult.setText(s);
        }
    }
    class ListenTopoint implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = jtfResult.getText();                     
            jtfResult.setText(s+".");
        }
    } 

    class ListenTovalue implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            value=s;
            jtfvaResult.setText("Ans Stored :  "+value);
            jtfResult.setText("");
            value=s;
            s="";
        }                     
    } 

    class ListenToreturn implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfvaResult.setText("Ans Draged :  ");
            jtfResult.setText(s+value);
        }
    } 

    class ListenToshift implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            shift = jtfResult.getText();
            shift="shift";
            jtfeResult.setText(shift);  
        }                     
    } 

    class ListenToSolve implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfeResult.setText(" ANSWER:                             =");
            s = jtfResult.getText();
            if(shift.equals(""))
            {
                int flagpo=0;int pow=0;int flagsq=0;int sqrt=0;
                int flag=0;int flagsc=0;int flagsck=0;
                int cou=0,coun=0,count=1,flagbreak=0,flagbrea=0,flagbre=0,flagcount=0,flagcou=0,flagd=0,flagm=0,flagp=0,flags=0,sub=0,plus=0,pro=0,div=0,i=0;
                double ans=0;
                String an="",ng1="",ng2="",ns2="",ns1="";
                int l=s.length();
                for(int ter=0;ter<50;ter++)
                {
                    for( i=0;i<l;i++)
                    {
                        char ch=s.charAt(i);
                        if(ch=='+'&&s.charAt(i+1)=='-')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"-");
                            s=s1.toString();
                            l=s.length();
                            i=0;
                        }
                        if(ch=='-'&&s.charAt(i+1)=='+')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"-");
                            s=s1.toString();
                            l=s.length();
                            i=0;
                        }
                        if(ch=='-'&&s.charAt(i+1)=='-')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"+");
                            s=s1.toString();
                            l=s.length();
                            i=0;
                        }
                        if(ch=='-'&&s.charAt(i+1)=='+')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"-");
                            s=s1.toString();
                            l=s.length();
                            i=0;
                        }
                    }
                    try
                    {
                        int flag_IE=0;
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            if(ch=='+'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"+");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='+'&&s.charAt(i+1)=='-')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"-");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='-'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"-");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='-'&&s.charAt(i+1)=='-')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"+");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='*'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"*");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='/'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"/");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='+'&&s.charAt(i+1)=='/')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"+");
                                s=s1.toString();
                                l=s.length();
                                flag_IE=1;
                            }
                            if(ch=='-'&&s.charAt(i+1)=='/')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"-");
                                s=s1.toString();
                                l=s.length();
                                flag_IE=1;
                            }
                            if(ch=='+'&&s.charAt(i+1)=='*')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"+");
                                s=s1.toString();
                                l=s.length();
                                flag_IE=1;
                            }
                            if(ch=='-'&&s.charAt(i+1)=='*')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"-");
                                s=s1.toString();
                                l=s.length();
                                flag_IE=1;
                            }
                            if(ch=='E'&&s.charAt(i+1)=='-')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"EM");
                                s=s1.toString();
                                l=s.length();
                            }
                        }
                        if(flag_IE==1)
                        {
                            jtfeResult.setText("INVALID EXPRESSION:");
                            flag_IE=0;
                        }
                    }
                    catch(Exception b)
                    {
                        jtfeResult.setText("INVALID EXPRESSION:");
                    }
                    for(int k=0;k<100;k++)
                    {
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            if(ch=='E'&&s.charAt(i+1)=='-')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"EM");
                                s=s1.toString();
                                l=s.length();
                                jtfResult.setText(s);
                            }
                        }
                        if(flagsq==1)
                        {
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            if(s.endsWith("v"))
                            {
                                int len=s.length();
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(len-1,len);
                                s=sp.toString();
                                s="v"+s;
                                l=s.length();  
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int z=0;
                                char ch=s.charAt(i);
                                if(ch=='v')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);
                                    int l2=n2.length();
                                    for(int j=0;j<l2;j++)
                                    {
                                        char ch2=n2.charAt(j);
                                        {
                                            if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                            {
                                                ns2=n2.substring(0,j);
                                                z=1;

                                                StringBuffer sc2=new StringBuffer(n2);
                                                sc2.delete(0,j);
                                                ng2=sc2.toString();
                                                l2=n2.length();
                                            }
                                            else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                            {
                                                ns2=n2;
                                            }
                                            if(z==1)
                                            {
                                                break;
                                            }
                                        }
                                    }
                                    double num2=0;
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    try
                                    {
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception h)
                                    {
                                        jtfeResult.setText(" MATH ERORR:");
                                    }
                                    ans=Math.sqrt(num2);
                                    an=Double.toString(ans);
                                    int nq=n1.length();
                                    if(n1.equals("")==false)
                                    {
                                        if(Character.isDigit(n1.charAt(nq-1)))
                                        {
                                            n1=n1+"*";
                                        }
                                    }
                                    s=n1+an+ng2;
                                    l=s.length();
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns2="";
                                    num2=0;
                                    an="";
                                    sqrt--;
                                    jtfResult.setText(s);
                                }
                                else
                                {
                                    sqrt=0;  
                                }
                            }
                        }
                        if(an.equals(s))
                        {
                            break;
                        }
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 

                        if(flagpo==1&&pow!=0&&sqrt<=0)
                        {
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int g=0;
                                int h=0;
                                char ch=s.charAt(i);
                                if(ch=='^')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);
                                    if(n2.startsWith("-"))
                                    {
                                        StringBuffer sm=new StringBuffer(n2);
                                        sm.delete(0,1);
                                        n2=sm.toString();
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/'||ch2=='^'||ch2=='v')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    ns2="-"+ns2;
                                                    g=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/'||ch2!='^'||ch2!='v')
                                                {
                                                    ns2="-"+n2;
                                                }
                                                if(g==1)
                                                {
                                                    break;
                                                }
                                            }
                                        } 
                                    }

                                    else if(n2.startsWith("1")||n2.startsWith("2")||n2.startsWith("3")||n2.startsWith("4")||n2.startsWith("5")||n2.startsWith("6")||n2.startsWith("7")||n2.startsWith("8")||n2.startsWith("9")||n2.startsWith("0")||n2.startsWith("."))
                                    {
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/'||ch2=='^'||ch2=='v')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    g=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/'||ch2!='^'||ch2!='v')
                                                {
                                                    ns2=n2;
                                                }
                                                if(g==1)
                                                {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    StringBuffer s1=new StringBuffer(n1);
                                    s1.reverse();
                                    n1=s1.toString();
                                    int l1=n1.length();
                                    for(int j=0;j<l1;j++)
                                    {
                                        char ch1=n1.charAt(j);
                                        if(ch1=='+'||ch1=='-'||ch1=='*'||ch1=='/'||ch1=='^'||ch1=='v')
                                        {    
                                            ns1=n1.substring(0,j); 

                                            StringBuffer sc1=new StringBuffer(n1);
                                            sc1.delete(0,j);
                                            sc1.reverse();
                                            ng1=sc1.toString();

                                            StringBuffer s2=new StringBuffer(ns1);
                                            ns1=s2.toString();
                                            h=1;
                                            l1=n1.length();
                                        }
                                        if(h==1)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            ns1=n1;
                                        }
                                    }
                                    double num1=0;
                                    double num2=0;
                                    StringBuffer s2=new StringBuffer(ns1);
                                    s2.reverse();
                                    ns1=s2.toString();
                                    int length_ns1=ns1.length();
                                    for(int i_ns1=0;i_ns1<length_ns1;i_ns1++)
                                    {
                                        char ch_ns1=ns1.charAt(i_ns1);
                                        if(ch_ns1=='E'&&ns1.charAt(i_ns1+1)=='M')
                                        {
                                            StringBuffer sb_ns1=new StringBuffer(ns1);
                                            sb_ns1.delete(i_ns1,i_ns1+2);
                                            sb_ns1.insert(i_ns1,"E-");
                                            ns1=String.valueOf(sb_ns1);
                                            break;
                                        }
                                    }
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    try
                                    {
                                        num1=Double.parseDouble(ns1);
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception fh)
                                    {
                                        jtfeResult.setText("INVALID EXPRESSION:");;
                                    }
                                    ans=Math.pow(num1,num2);
                                    an=Double.toString(ans);
                                    if(num2%2==0)
                                    {
                                        if(ng1.endsWith("-"))
                                        {
                                            int lng1=ng1.length();
                                            StringBuffer sq=new StringBuffer(ng1);
                                            sq.delete(lng1-1,lng1);
                                            ng1=sq.toString();
                                            ng1=ng1+"+";
                                        }
                                    }
                                    s=ng1+an+ng2;
                                    l=s.length();
                                    for(int i_s=0;i_s<l;i_s++)
                                    {
                                        char ch_s=s.charAt(i_s);
                                        if(ch_s=='E'&&s.charAt(i_s+1)=='-')
                                        {
                                            StringBuffer sb_s=new StringBuffer(s);
                                            sb_s.delete(i_s,i_s+2);
                                            sb_s.insert(i_s,"EM");
                                            s=sb_s.toString();
                                            l=s.length();
                                        }
                                    }
                                    i=0;
                                    n1="";
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns1="";
                                    ns2="";
                                    num1=0;
                                    num2=0;
                                    an="";
                                    pow--;
                                    jtfResult.setText(s);
                                }
                                else
                                {
                                    pow=0;  
                                }
                            }
                        }
                        if(an.equals(s))
                        {
                            break;
                        }
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            if(ch=='*'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"*");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='/'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"/");
                                s=s1.toString();
                                l=s.length();
                            }
                        }
                        l=s.length();
                        int dm=0;
                        for(int i_div=0;i_div<l;i_div++)
                        {
                            char ch_div=s.charAt(i_div);
                            {
                                if(ch_div=='/')
                                {
                                    flagd=1;
                                    div++;
                                    dm++;
                                }
                                if(ch_div=='^')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                            }
                        } 

                        if(flagd==1&&div!=0&&pow<=0&&dm!=0)
                        {
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int c=0;
                                int d=0;
                                char ch=s.charAt(i);
                                if(ch=='/')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);
                                    if(n2.startsWith("-"))
                                    {
                                        StringBuffer sm=new StringBuffer(n2);
                                        sm.delete(0,1);
                                        n2=sm.toString();
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    ns2="-"+ns2;
                                                    c=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                                {
                                                    ns2="-"+n2;
                                                }
                                                if(c==1)
                                                {
                                                    break;
                                                }
                                            }
                                        } 
                                    }

                                    else if(n2.startsWith("1")||n2.startsWith("2")||n2.startsWith("3")||n2.startsWith("4")||n2.startsWith("5")||n2.startsWith("6")||n2.startsWith("7")||n2.startsWith("8")||n2.startsWith("9")||n2.startsWith("0")||n2.startsWith("."))
                                    {
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    c=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                                {
                                                    ns2=n2;
                                                }
                                                if(c==1)
                                                {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    StringBuffer s1=new StringBuffer(n1);
                                    s1.reverse();
                                    n1=s1.toString();
                                    int l1=n1.length();
                                    for(int j=0;j<l1;j++)
                                    {
                                        char ch1=n1.charAt(j);
                                        if(ch1=='+'||ch1=='-'||ch1=='*'||ch1=='/')
                                        {    
                                            ns1=n1.substring(0,j); 

                                            StringBuffer sc1=new StringBuffer(n1);
                                            sc1.delete(0,j);
                                            sc1.reverse();
                                            ng1=sc1.toString();

                                            StringBuffer s2=new StringBuffer(ns1);
                                            ns1=s2.toString();
                                            d=1;
                                            l1=n1.length();
                                        }
                                        if(d==1)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            ns1=n1;
                                        }
                                    }
                                    double num1=0;
                                    double num2=0;
                                    StringBuffer s2=new StringBuffer(ns1);
                                    s2.reverse();
                                    ns1=s2.toString();
                                    int length_ns1=ns1.length();
                                    for(int i_ns1=0;i_ns1<length_ns1;i_ns1++)
                                    {
                                        char ch_ns1=ns1.charAt(i_ns1);
                                        if(ch_ns1=='E'&&ns1.charAt(i_ns1+1)=='M')
                                        {
                                            StringBuffer sb_ns1=new StringBuffer(ns1);
                                            sb_ns1.delete(i_ns1,i_ns1+2);
                                            sb_ns1.insert(i_ns1,"E-");
                                            ns1=String.valueOf(sb_ns1);
                                            break;
                                        }
                                    }
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    if(ng1.endsWith("-")&&ns2.startsWith("-"))
                                    {
                                        ns1="-"+ns1;
                                        int lng1=ng1.length();
                                        StringBuffer sq=new StringBuffer(ng1);
                                        sq.delete(lng1-1,lng1);
                                        ng1=sq.toString();
                                        ng1=ng1+"+";
                                    }
                                    try
                                    {
                                        num1=Double.parseDouble(ns1);
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception fgh)
                                    {
                                        jtfeResult.setText("INVALID EXPRESSION:");;
                                    }
                                    ans=num1/num2;
                                    an=Double.toString(ans); 
                                    if(an.startsWith("-"))
                                    {
                                        if(ng1.endsWith("-"))
                                        {
                                            int lng1=ng1.length();
                                            StringBuffer sq=new StringBuffer(ng1);
                                            sq.delete(lng1-1,lng1);
                                            ng1=sq.toString();
                                            ng1=ng1+"+";
                                        }
                                        if(ng1.endsWith("+"))
                                        {
                                            int lng1=ng1.length();
                                            StringBuffer sq=new StringBuffer(ng1);
                                            sq.delete(lng1-1,lng1);
                                            ng1=sq.toString();
                                        }
                                    }
                                    if(s.startsWith("+"))
                                    {
                                        StringBuffer sp=new StringBuffer(s);
                                        sp.delete(0,1);
                                        s=sp.toString();
                                        l=s.length();  
                                    }
                                    if(ng1.endsWith("*+"))
                                    {
                                        int lng1=ng1.length();
                                        StringBuffer sq=new StringBuffer(ng1);
                                        sq.delete(lng1-1,lng1);
                                        ng1=sq.toString();
                                    }
                                    s=ng1+an+ng2;
                                    l=s.length();
                                    for(int i_s=0;i_s<l;i_s++)
                                    {
                                        char ch_s=s.charAt(i_s);
                                        if(ch_s=='E'&&s.charAt(i_s+1)=='-')
                                        {
                                            StringBuffer sb_s=new StringBuffer(s);
                                            sb_s.delete(i_s,i_s+2);
                                            sb_s.insert(i_s,"EM");
                                            s=sb_s.toString();
                                            l=s.length();
                                        }
                                    }
                                    i=0;
                                    n1="";
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns1="";
                                    ns2="";
                                    num1=0;
                                    num2=0;
                                    an="";
                                    div--;
                                    if(s.startsWith("+"))
                                    {
                                        StringBuffer sp=new StringBuffer(s);
                                        sp.delete(0,1);
                                        s=sp.toString();
                                        l=s.length();  
                                    }
                                    jtfResult.setText(s);
                                }
                                else
                                {
                                    div=0;  
                                }
                            }
                        }
                        if(an.equals(s))
                        {
                            break;
                        }
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            if(ch=='*'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"*");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='/'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"/");
                                s=s1.toString();
                                l=s.length();
                            }
                        }
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 
                        if(flagm==1&&div<=0&&pro!=0)
                        {
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int m=0;
                                int n=0;
                                char ch=s.charAt(i);
                                if(ch=='*')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);
                                    if(n2.startsWith("-"))
                                    {
                                        StringBuffer sm=new StringBuffer(n2);
                                        sm.delete(0,1);
                                        n2=sm.toString();
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    ns2="-"+ns2;
                                                    m=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                                {
                                                    ns2="-"+n2;
                                                }
                                                if(m==1)
                                                {
                                                    break;
                                                }
                                            }
                                        } 
                                    }

                                    else if(n2.startsWith("1")||n2.startsWith("2")||n2.startsWith("3")||n2.startsWith("4")||n2.startsWith("5")||n2.startsWith("6")||n2.startsWith("7")||n2.startsWith("8")||n2.startsWith("9")||n2.startsWith("0")||n2.startsWith("."))
                                    {
                                        int l2=n2.length();
                                        for(int j=0;j<l2;j++)
                                        {
                                            char ch2=n2.charAt(j);
                                            {
                                                if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                                {
                                                    ns2=n2.substring(0,j);
                                                    m=1;

                                                    StringBuffer sc2=new StringBuffer(n2);
                                                    sc2.delete(0,j);
                                                    ng2=sc2.toString();
                                                    l2=n2.length();
                                                }
                                                else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                                {
                                                    ns2=n2;
                                                }
                                                if(m==1)
                                                {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    StringBuffer s1=new StringBuffer(n1);
                                    s1.reverse();
                                    n1=s1.toString();
                                    int l1=n1.length();
                                    for(int j=0;j<l1;j++)
                                    {
                                        char ch1=n1.charAt(j);
                                        if(ch1=='+'||ch1=='-'||ch1=='*'||ch1=='/')
                                        {    
                                            ns1=n1.substring(0,j); 

                                            StringBuffer sc1=new StringBuffer(n1);
                                            sc1.delete(0,j);
                                            sc1.reverse();
                                            ng1=sc1.toString();

                                            StringBuffer s2=new StringBuffer(ns1);
                                            ns1=s2.toString();
                                            n=1;
                                            l1=n1.length();
                                        }
                                        if(n==1)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            ns1=n1;
                                        }
                                    }
                                    double num1=0;
                                    double num2=0;
                                    StringBuffer s2=new StringBuffer(ns1);
                                    s2.reverse();
                                    ns1=s2.toString();
                                    int length_ns1=ns1.length();
                                    for(int i_ns1=0;i_ns1<length_ns1;i_ns1++)
                                    {
                                        char ch_ns1=ns1.charAt(i_ns1);
                                        if(ch_ns1=='E'&&ns1.charAt(i_ns1+1)=='M')
                                        {
                                            StringBuffer sb_ns1=new StringBuffer(ns1);
                                            sb_ns1.delete(i_ns1,i_ns1+2);
                                            sb_ns1.insert(i_ns1,"E-");
                                            ns1=String.valueOf(sb_ns1);
                                            break;
                                        }
                                    }
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    if(ng1.endsWith("-")&&ns2.startsWith("-"))
                                    {
                                        ns1="-"+ns1;
                                        int lng1=ng1.length();
                                        StringBuffer sq=new StringBuffer(ng1);
                                        sq.delete(lng1-1,lng1);
                                        ng1=sq.toString();
                                        ng1=ng1+"+";
                                    }
                                    try
                                    {
                                        num1=Double.parseDouble(ns1);
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception fg)
                                    {
                                        jtfeResult.setText("INVALID EXPRESSION:");;
                                    }
                                    ans=num1*num2;
                                    an=Double.toString(ans); 
                                    if(an.startsWith("-"))
                                    {
                                        if(ng1.endsWith("-"))
                                        {
                                            int lng1=ng1.length();
                                            StringBuffer sq=new StringBuffer(ng1);
                                            sq.delete(lng1-1,lng1);
                                            ng1=sq.toString();
                                            ng1=ng1+"+";
                                        }
                                        if(ng1.endsWith("+"))
                                        {
                                            int lng1=ng1.length();
                                            StringBuffer sq=new StringBuffer(ng1);
                                            sq.delete(lng1-1,lng1);
                                            ng1=sq.toString();
                                        }
                                    }
                                    if(s.startsWith("+"))
                                    {
                                        StringBuffer sp=new StringBuffer(s);
                                        sp.delete(0,1);
                                        s=sp.toString();
                                        l=s.length();  
                                    }
                                    if(ng1.endsWith("/+"))
                                    {
                                        int lng1=ng1.length();
                                        StringBuffer sq=new StringBuffer(ng1);
                                        sq.delete(lng1-1,lng1);
                                        ng1=sq.toString();
                                    }
                                    s=ng1+an+ng2;
                                    if(s.startsWith("+"))
                                    {
                                        StringBuffer sp=new StringBuffer(s);
                                        sp.delete(0,1);
                                        s=sp.toString();
                                        l=s.length();  
                                    }
                                    l=s.length();
                                    for(int i_s=0;i_s<l;i_s++)
                                    {
                                        char ch_s=s.charAt(i_s);
                                        if(ch_s=='E'&&s.charAt(i_s+1)=='-')
                                        {
                                            StringBuffer sb_s=new StringBuffer(s);
                                            sb_s.delete(i_s,i_s+2);
                                            sb_s.insert(i_s,"EM");
                                            s=sb_s.toString();
                                            l=s.length();
                                        }
                                    }
                                    i=0;
                                    n1="";
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns1="";
                                    ns2="";
                                    num1=0;
                                    num2=0;
                                    an="";
                                    pro--;
                                    jtfResult.setText(s);
                                }
                                else
                                {
                                    pro=0;  
                                }
                            }
                        }
                        if(an.equals(s))
                        {
                            break;
                        }
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            if(ch=='*'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"*");
                                s=s1.toString();
                                l=s.length();
                            }
                            if(ch=='/'&&s.charAt(i+1)=='+')
                            {
                                StringBuffer s1=new StringBuffer(s);
                                s1.delete(i,i+2);
                                s1.insert(i,"/");
                                s=s1.toString();
                                l=s.length();
                            }
                        }
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 
                        if(flagp==1&&pro<=0&&plus!=0)
                        {
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            if(s.startsWith("-")&&coun==1)
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                                flagcount=1;
                                coun=0;
                                l=s.length();
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int a=0;
                                int b=0;
                                char ch=s.charAt(i);
                                if(ch=='+')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);

                                    int l2=n2.length();
                                    for(int j=0;j<l2;j++)
                                    {
                                        char ch2=n2.charAt(j);
                                        {
                                            if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                            {
                                                ns2=n2.substring(0,j);
                                                a=1;

                                                StringBuffer sc2=new StringBuffer(n2);
                                                sc2.delete(0,j);
                                                ng2=sc2.toString();
                                                l2=n2.length();
                                            }
                                            else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                            {
                                                ns2=n2;
                                            }
                                            if(a==1)
                                            {
                                                break;
                                            }
                                        }
                                    }
                                    StringBuffer s1=new StringBuffer(n1);
                                    s1.reverse();
                                    n1=s1.toString();
                                    int l1=n1.length();
                                    for(int j=0;j<l1;j++)
                                    {
                                        char ch1=n1.charAt(j);
                                        if(ch1=='+'||ch1=='-'||ch1=='*'||ch1=='/')
                                        {    
                                            ns1=n1.substring(0,j+1); 

                                            StringBuffer sc1=new StringBuffer(n1);
                                            sc1.delete(0,j+1);
                                            sc1.reverse();
                                            ng1=sc1.toString();

                                            StringBuffer s2=new StringBuffer(ns1);
                                            ns1=s2.toString();
                                            b=1;
                                            l1=n1.length();
                                        }
                                        if(b==1)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            ns1=n1;
                                        }
                                    }
                                    double num1=0;
                                    double num2=0;
                                    StringBuffer s2=new StringBuffer(ns1);
                                    s2.reverse();
                                    ns1=s2.toString();
                                    int length_ns1=ns1.length();
                                    for(int i_ns1=0;i_ns1<length_ns1;i_ns1++)
                                    {
                                        char ch_ns1=ns1.charAt(i_ns1);
                                        if(ch_ns1=='E'&&ns1.charAt(i_ns1+1)=='M')
                                        {
                                            StringBuffer sb_ns1=new StringBuffer(ns1);
                                            sb_ns1.delete(i_ns1,i_ns1+2);
                                            sb_ns1.insert(i_ns1,"E-");
                                            ns1=String.valueOf(sb_ns1);
                                            break;
                                        }
                                    }
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    if(ns1.equals("")==true&&s.startsWith("-"))
                                    {
                                        flagbrea=1;
                                        break; 
                                    }
                                    try
                                    {
                                        num1=Double.parseDouble(ns1);
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception ghdf)
                                    {
                                        jtfeResult.setText("INVALID EXPRESSION:");;
                                    }
                                    if(flagcount==1)
                                    {
                                        num1=-num1;   
                                    }
                                    ans=num1+num2;
                                    an=Double.toString(ans); 
                                    boolean bln=ng1.equals("");
                                    if(an.startsWith("1")||an.startsWith("2")||an.startsWith("3")||an.startsWith("4")||an.startsWith("5")||an.startsWith("6")||an.startsWith("7")||an.startsWith("8")||an.startsWith("9")||an.startsWith("0")||an.startsWith("."))
                                    {
                                        an="+"+an;
                                    }
                                    if(bln==true&&an.startsWith("+"))
                                    {
                                        StringBuffer sk=new StringBuffer(an);
                                        sk.delete(0,1);
                                        an=sk.toString();
                                    }
                                    s=ng1+an+ng2;
                                    l=s.length();
                                    for(int i_s=0;i_s<l;i_s++)
                                    {
                                        char ch_s=s.charAt(i_s);
                                        if(ch_s=='E'&&s.charAt(i_s+1)=='-')
                                        {
                                            StringBuffer sb_s=new StringBuffer(s);
                                            sb_s.delete(i_s,i_s+2);
                                            sb_s.insert(i_s,"EM");
                                            s=sb_s.toString();
                                            l=s.length();
                                        }
                                    }
                                    i=0;
                                    n1="";
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns1="";
                                    ns2="";
                                    num1=0;
                                    num2=0;
                                    plus--;
                                    jtfResult.setText(s);;
                                }
                                if(ch!='+')
                                {
                                    plus=0;  
                                }
                            }
                        }
                        if(flagbrea==1)
                        {
                            break;
                        }
                        if(an.equals(s))
                        {
                            break;
                        }
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 
                        l=s.length();
                        int flagsp=0;
                        for( i=0;i<l;i++)
                        {
                            char chs=s.charAt(i);
                            if(chs=='+')
                            {
                                flagsp=1;
                                plus++;
                            }
                        }
                        l=s.length();
                        if(flags==1&&plus<=0&&sub!=0&&flagsp==0)
                        {
                            if(s.startsWith("-")&&count==1)
                            {
                                int flagspl=0;int flagss=0;int flagsr=0;int flagsd=0;int flagspo=0;int flagsqr=0;
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();
                                for(int fa=0;fa<l;fa++)
                                {
                                    char chsm=s.charAt(fa);
                                    if(chsm=='+')
                                    {
                                        flagspl=1;
                                    }
                                    if(chsm=='-')
                                    {
                                        flagss=1;
                                    }
                                    if(chsm=='*')
                                    {
                                        flagsr=1;
                                    }
                                    if(chsm=='/')
                                    {
                                        flagsr=1;
                                    } 
                                    if(chsm=='^'||chsm=='E')
                                    {
                                        flagspo=1;
                                    } 
                                    if(chsm=='v')
                                    {
                                        flagsqr=1;
                                    } 
                                }
                                if(flagspl==0&&flagss==0&&flagsr==0&&flagsd==0&&flagspo==0)
                                {
                                    s="-"+s;   
                                }                  
                                l=s.length();  
                                flagcount=1;
                                count=0;
                                l=s.length();
                            }
                            l=s.length();
                            for( i=0;i<l;i++)
                            {
                                int p=0;
                                int q=0;
                                char ch=s.charAt(i);
                                if(ch=='-')
                                {
                                    String n1=s.substring(0,i);
                                    String n2=s.substring(i+1,l);
                                    int l2=n2.length();
                                    for(int j=0;j<l2;j++)
                                    {
                                        char ch2=n2.charAt(j);
                                        {
                                            if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/')
                                            {
                                                ns2=n2.substring(0,j);
                                                p=1;

                                                StringBuffer sc2=new StringBuffer(n2);
                                                sc2.delete(0,j);
                                                ng2=sc2.toString();
                                                l2=n2.length();
                                            }
                                            else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/')
                                            {
                                                ns2=n2;
                                            }
                                            if(p==1)
                                            {
                                                break;
                                            }
                                        }
                                    }
                                    StringBuffer s1=new StringBuffer(n1);
                                    s1.reverse();
                                    n1=s1.toString();
                                    int l1=n1.length();
                                    for(int j=0;j<l1;j++)
                                    {
                                        char ch1=n1.charAt(j);
                                        if(ch1=='+'||ch1=='-'||ch1=='*'||ch1=='/')
                                        {    
                                            ns1=n1.substring(0,j+1); 

                                            StringBuffer sc1=new StringBuffer(n1);
                                            sc1.delete(0,j+1);
                                            sc1.reverse();
                                            ng1=sc1.toString();

                                            StringBuffer s2=new StringBuffer(ns1);
                                            ns1=s2.toString();
                                            q=1;
                                            l1=n1.length();
                                        }
                                        if(q==1)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            ns1=n1;
                                        }
                                    }
                                    double num1=0;
                                    double num2=0;
                                    StringBuffer s2=new StringBuffer(ns1);
                                    s2.reverse();
                                    ns1=s2.toString();
                                    int length_ns1=ns1.length();
                                    for(int i_ns1=0;i_ns1<length_ns1;i_ns1++)
                                    {
                                        char ch_ns1=ns1.charAt(i_ns1);
                                        if(ch_ns1=='E'&&ns1.charAt(i_ns1+1)=='M')
                                        {
                                            StringBuffer sb_ns1=new StringBuffer(ns1);
                                            sb_ns1.delete(i_ns1,i_ns1+2);
                                            sb_ns1.insert(i_ns1,"E-");
                                            ns1=String.valueOf(sb_ns1);
                                            break;
                                        }
                                    }
                                    int length_ns2=ns2.length();
                                    for(int i_ns2=0;i_ns2<length_ns2;i_ns2++)
                                    {
                                        char ch_ns2=ns2.charAt(i_ns2);
                                        if(ch_ns2=='E'&&ns2.charAt(i_ns2+1)=='M')
                                        {
                                            StringBuffer sb_ns2=new StringBuffer(ns2);
                                            sb_ns2.delete(i_ns2,i_ns2+2);
                                            sb_ns2.insert(i_ns2,"E-");
                                            ns2=String.valueOf(sb_ns2);
                                            break;
                                        }
                                    }
                                    boolean bln=ng1.equals("");
                                    if(ns1.equals("")==true&&s.startsWith("-"))
                                    {
                                        flagbreak=1;
                                        break; 
                                    }
                                    try
                                    {
                                        num1=Double.parseDouble(ns1);
                                        num2=Double.parseDouble(ns2);
                                    }
                                    catch(Exception fgfd)
                                    {
                                        jtfeResult.setText("INVALID EXPRESSION:");;
                                    }
                                    if(flagcount==1)
                                    {
                                        if(ns1.startsWith("-")==false)
                                            num1=-num1;   
                                    }
                                    ans=num1-num2;
                                    an=Double.toString(ans); 
                                    s=ng1+an+ng2;
                                    l=s.length();
                                    for(int i_s=0;i_s<l;i_s++)
                                    {
                                        char ch_s=s.charAt(i_s);
                                        if(ch_s=='E'&&s.charAt(i_s+1)=='-')
                                        {
                                            StringBuffer sb_s=new StringBuffer(s);
                                            sb_s.delete(i_s,i_s+2);
                                            sb_s.insert(i_s,"EM");
                                            s=sb_s.toString();
                                            l=s.length();
                                        }
                                    }
                                    i=0;
                                    n1="";
                                    n2="";
                                    ng1="";
                                    ng2="";
                                    ns1="";
                                    ns2="";
                                    num1=0;
                                    num2=0;
                                    sub--;
                                    jtfResult.setText(s);
                                }
                                else
                                {
                                    sub=0;  
                                }         
                            }
                        }
                        if(flagbreak==1)
                        {
                            break;
                        }
                        l=s.length();
                        for( i=0;i<l;i++)
                        {
                            char ch=s.charAt(i);
                            {
                                if(ch=='+')
                                {
                                    flagp=1;
                                    plus++;
                                }
                                if(ch=='-')
                                {
                                    flags=1;
                                    sub++;
                                }
                                if(ch=='*')
                                {
                                    flagm=1;
                                    pro++;
                                }
                                if(ch=='/')
                                {
                                    flagd=1;
                                    div++;
                                }
                                if(ch=='^'||ch=='E')
                                {
                                    flagpo=1;
                                    pow++;
                                }
                                if(ch=='v')
                                {
                                    flagsq=1;
                                    sqrt++;
                                }
                            }
                        } 
                        l=s.length();
                        try{
                            if(an.equals(s))
                            {
                                break;
                            }
                        }
                        catch(Exception dfgd)
                        {
                        }
                    }
                }
            }
            int flagsh=0;
            if(shift.equals("shift"))
            {
                flagsh=1;
                shift="";
                String n1="";
                String n2="";
                String nu1="";int m;int n;
                String nu2="1";
                int str1=0;
                int str2=0;
                int c1=0;int c2=0;int num1=0;int num2=0;int f1=1;int f2=1;
                String sd="";
                int l=s.length();
                for(int i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='.')
                    {
                        n1=s.substring(0,i);
                        n2=s.substring(i+1,l);
                        nu1=n1+n2;
                        int l1=n2.length();
                        for(int j=0;j<l1;j++)
                        {
                            nu2=nu2+"0";
                        }
                    }
                    if(ch=='/')
                    {
                        n1=s.substring(0,i);
                        n2=s.substring(i+1,l);
                        nu1=n1;
                        nu2=n2;
                    }
                }
                num1=Integer.parseInt(nu1);
                num2=Integer.parseInt(nu2);

                for(int t=0;t<20;t++)
                {
                    for(m=f1;m<=num1;m++)
                    {
                        if(num1%m==0)
                        {
                            c1=1;
                            str1=str1+m;   
                        }
                        if(c1==1)
                        {
                            c1=0;
                            break;
                        }
                    }

                    for(n=f2;n<=num2;n++)
                    {
                        if(num2%n==0)
                        {
                            c2=1;
                            str2=str2+n;   
                        }
                        if(c2==1)
                        {
                            c2=0;
                            break;
                        }
                    }
                    if(str1==str2)
                    {
                        if(str1==0||str2==0)
                        {
                            str1=1;
                            str2=1;
                        }
                        num1=num1/str1;
                        num2=num2/str2;
                        String t1=String.valueOf(num1);
                        String t2=String.valueOf(num2);
                        s=t1+"/"+t2;
                        f1=1;
                        f2=1;
                        jtfResult.setText(s);
                    }
                    str1=0;str2=0;
                    f1++;
                    f2++;
                }
                if(flagsh==1)
                {
                    int r=num1%num2;
                    int d=num1/num2;
                    s=d+"+"+r+"/"+num2;
                    if(d!=0)
                    {
                        jtfResult.setText(s);
                    }
                }
            }
            int l=s.length();
            String s1="";
            for(int ip=0;ip<l;ip++)
            {
                char ch=s.charAt(ip);
                if(ch=='M'&&s.charAt(ip-1)=='E')
                {
                    s1=s1+"-";
                }
                else
                {
                    s1=s1+ch;
                }
            }
            s=s1;
            jtfResult.setText(s);
        }
    }

    public static void main(String[] args)
    {
        calculator_gui calc = new calculator_gui();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);                     
    }
}
