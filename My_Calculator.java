import java.io.*;
class My_Calculator
{
    public static void main(String[] agrs)throws IOException
    {
        String s,ab="on",bc="t",a="+",b="-",c="*",d="/",e="v",f="^",g="<",h=">",en="<+",ne="+>",fac="%",xs="Q",sx="$",tr="tr",cd="off",de="[]",ca="x",ce="=";int tm,te=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                _____________");
        System.out.println("               |-------------|");
        System.out.println("               |____________0|");
        System.out.println("               |-------------|");
        System.out.println("               |"+"[*on]"+"[+]"+"[off]"+"|");
        System.out.println("               |  "+"[/]"+"[=]"+"[*]"+"  |");
        System.out.println("               |  "+"[v]"+"[-]"+"[^]"+"  |");
        System.out.println("               | "+"[<+]"+"[x]"+"[+>]"+" |");
        System.out.println("               |-------------|");
        System.out.println("               |  "+"[Q]"+"[%]"+"[$]"+"  |");
        System.out.println("               | "+"[tr]"+"[t]"+"[.]"+"  |");
        System.out.println("               |_____________|");
        for(tm=1;tm<100;tm++)
        {
         System.out.print("         CONDTION:");
         s=br.readLine();
        if(s.equals(ab))
        {
            System.out.print("                             enter the number:   ");
            double zy=Double.parseDouble(br.readLine());
            double ans=zy;
             do
              {
             System.out.print("                                         SIGN: ");
             String con=br.readLine();
             if(con.equals(ce))
             {
                System.out.println("                         -----------------------------------------"); 
                System.out.println("                                      answer:  "+ans);
            }
             if(con.equals(ca))
             {
                System.out.println("                         -----------------------------------------");
                ans=0.0;
                System.out.println("                                       number:   "+ans);
                System.out.print("                             enter the number:   ");
                double yz=Double.parseDouble(br.readLine());
                ans=yz;
            }
             if(con.equals(a))
            {
              System.out.print("       enter the number for addtion(NO SPACE):   ");
              double sum=Double.parseDouble(br.readLine());
              ans=ans+sum;
              System.out.println("                         -----------------------------------------");
              System.out.println("                                       answer:   "+ans); 
            }
             if(con.equals(b))
            {
                System.out.print("      enter number for substraction(NO SPACE):   ");
                double sub=Double.parseDouble(br.readLine());
                ans=ans-sub;
                System.out.println("                         -----------------------------------------");
                System.out.println("                                       answer:   "+ans); 
            }
             if(con.equals(c))
            {
                System.out.print("    enter number for multiplication(NO SPACE):   ");
                double pro=Double.parseDouble(br.readLine());
                ans=ans*pro;
                System.out.println("                         -----------------------------------------");
                System.out.println("                                       answer:   "+ans); 
            }
             if(con.equals(d))
             {
                System.out.print("      enter the number for division(NO SPACE):   ");
                double div=Double.parseDouble(br.readLine());
                ans=ans/div;
                System.out.println("                         -----------------------------------------");
                System.out.println("                                       answer:   "+ans); 
            }
            if(con.equals(e))
             {
                ans=Math.sqrt(ans);
                System.out.println("                         -----------------------------------------");
                System.out.println("                                       answer:   "+ans); 
            }
            if(con.equals(f))
             {
                System.out.print("                    enter the power(NO SPACE):   ");
                double pow=Double.parseDouble(br.readLine());
                ans=Math.pow(ans,pow);
                System.out.println("                         -----------------------------------------");
                System.out.println("                                       answer:   "+ans); 
            } 
            if(con.equals(tr))
             {
                System.out.println("-----------------------This Continued calculation is Ended---------------------"); 
                break;
             }
            }while(te<100);
            }
            else if(s.equals(bc))
            {
               System.out.print("                   enter the number(NO SPACE): ");
               int num=Integer.parseInt(br.readLine());
                  if(num==0)
            {
                break;
            }
               for(int t=1;t<11;t++)
               {
                   int product=num*t;
                   System.out.println("                                               "+num+" "+"*"+" "+t+" "+"="+" "+product);
               } 
            }
             else if(s.equals(fac))
            {
              System.out.print("                   Enter the number(NO SPACE):  ");
              double num=Double.parseDouble(br.readLine());
               if(num==0)
            {
                break;
            }
              System.out.print("                        factors of the number:  ");
            for(int fa=1;fa<=num;fa++)
              {
                  if(num%fa==0)
                  {
                  System.out.print(fa+",");
                  }
             }
             System.out.println();
            }
            else if(s.equalsIgnoreCase(xs))
           {
           System.out.println("                             enter the number :");
           System.out.print("                                               ");
           double a1=Double.parseDouble(br.readLine());
           if(a1==0)
            {
                break;
            }
           System.out.println("                             enter the number :");
           System.out.print("                                               ");
           double b1=Double.parseDouble(br.readLine());
           System.out.println("                             enter the number :");
           System.out.print("                                               ");
           double c1=Double.parseDouble(br.readLine());
           double pos=((-b1+Math.sqrt(b1*b1-4*a1*c1)))/((2.0*a1));
           double neg=((-b1-Math.sqrt(b1*b1-4*a1*c1)))/((2.0*a1));
           System.out.println("              positive value of this equation :"+pos);
           System.out.println("              negetive value of this equation :"+neg);
           }
           else if(s.equalsIgnoreCase(sx))
           {
            System.out.println("                             Enter the number:");
            System.out.print("                                               ");
            double num1=Double.parseDouble(br.readLine());
            if(num1==0)
            {
                break;
            }
            System.out.println("                             Enter the nmuber:");
            System.out.print("                                               ");
            double num2=Double.parseDouble(br.readLine());
            System.out.println("                             Enter the number:");
            System.out.print("                                               ");
            double num3=Double.parseDouble(br.readLine());
            System.out.println("                             Enter the number:");
            System.out.print("                                               ");
            double num4=Double.parseDouble(br.readLine());
            System.out.println("                             Enter the number:");
            System.out.print("                                               ");
            double num5=Double.parseDouble(br.readLine());
            System.out.println("                             enter the number:");
            System.out.print("                                               ");
            double num6=Double.parseDouble(br.readLine());
            double vofx=(num3*num5-num2*num6)/(num1*num5-num4*num2);
            double vofy=(num1*num6-num3*num4)/(num1*num5-num4*num2);
           if(num1*num5-num4*num2==0)
           {
           System.out.println("                                     'No solution'");
           }
           else
           System.out.println("                                Value of x is: "+vofx);
           System.out.println("                                Value of y is: "+vofy);
    }
            else if(s.equals(cd))
            {
               break;
            }
    }
}
}
