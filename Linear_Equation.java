import java.io.*;
class Linear_Equation
{
    public static String multivariable_correction(String s)
    {
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)||ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='v'||ch=='^'||ch=='V')
            {
                s1=s1+ch;
            }
            else if(ch=='x')
            {
                s1=s1+ch;
            }
            else
            {
                s1=s1+'x';
            }
        }
        String s2="";
        int l1=s1.length();
        for(int i=0;i<l1;i++)
        {
            char ch1=s1.charAt(i);
            if(ch1=='x')
            {
                if(s1.charAt(i+1)=='x')
                {
                    continue;
                }
                else
                {
                    s2=s2+ch1;
                }
            }
            else
            {
                s2=s2+ch1;
            }
        }
        s="";
        s=s2;
        return s;
    }

    public static String Decimal_Zero_Remover(String s)
    {
        int l=s.length();int c=0;int l1=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='.')
            {
                String s1=s.substring(i+1,l); 
                l1=s1.length();
                if(s1.charAt(l1-1)=='0'&&l1==1)
                {
                    c=1;
                }
                if(c==1)
                {
                    StringBuffer s0=new StringBuffer(s);
                    s0.delete(i,l);
                    s=s0.toString();
                    l=s.length();
                }
            }
        }
        return s;
    }

    public static String print(String s)
    {
        return s; 
    }

    public static void print_nx(String s)
    {
        String s1=s;
        String s2="";
        int lp=s1.length();
        System.out.print("                  = ");
        for(int ip=0;ip<lp;ip++)
        {
            char ch=s1.charAt(ip);
            if(ch=='M'&&s1.charAt(ip-1)=='E')
            {
                s2=s2+"-";
            }
            else
            {
                s2=s2+ch;
            }
        }
        int c=1;int d=1;
        for(int ip=0;ip<lp;ip++)
        {
            char ch=s1.charAt(ip);
            if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'||ch=='.'||ch=='E'||ch=='('||ch==')'||ch=='x')
            {
                System.out.print(ch);
            }
            else
            {
                if(s1.charAt(0)=='-'&&c==1)
                {
                    c=0;
                    System.out.print(ch);
                }
                else
                {
                    if(ch=='M'&&s1.charAt(ip-1)=='E')
                    {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" "+ch+" ");
                    }
                }
            }
        }

        int l=s.length();int flag=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='=')
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println();
        }
        if(flag==0)
        {
            System.out.println(" = 0");  
        }
        if(s.endsWith("*")||s.endsWith("/")||s.endsWith("^")||s.endsWith("v"))
        {
            s=s+"1";
        }
        if(s.endsWith("+")||s.endsWith("-"))
        {
            s=s+"0";
        }
    }

    public static String space_remover(String s)
    {
        int l=s.length();
        String s1="";
        for(int ip=0;ip<l;ip++)
        {
            char ch=s.charAt(ip);
            if(ch==' ')
            {
            }
            else
            {
                s1=s1+ch;
            }
            l=s.length();
        }
        return s1;
    }

    public static String rubbish_remover(String s)
    {
        int l=s.length();String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='h'||ch=='H')
            {
                if(i==0)
                {
                    s1=s1+ch;
                }
            }
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='v'||ch=='V'||ch=='('||ch==')'||ch=='E'||ch=='.'||Character.isDigit(ch))
            {
                s1=s1+ch;
            }
            l=s.length();
        }
        s=s1;
        return s;
    }

    public static String bodmas(String s,String nb1,String nb2)
    {
        int flagpo=0;int pow=0;int flagsq=0;int sqrt=0;
        int flag=0;int flagsc=0;int flagsck=0;
        int cou=0,coun=0,count=1,flagbreak=0,flagbrea=0,flagbre=0,flagcount=0,flagcou=0,flagd=0,flagm=0,flagp=0,flags=0,sub=0,plus=0,pro=0,div=0,i=0;
        double ans=0;
        String an="",ng1="",ng2="",ns2="",ns1="";
        int flagbracket=0;
        s=rubbish_remover(s);
        int l=s.length();
        if(s.startsWith("(")==true&&s.endsWith(")")==true)
        {
            flagbracket=1;
            StringBuffer s1=new StringBuffer(s);
            s1.delete(0,1);
            s1.delete(l-2,l);
            s=s1.toString();
            l=s.length();
        }
        try
        {
            l=s.length();
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
                    i=0;
                }
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
            l=s.length();
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
                    i=0;
                }
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
                if(ch=='*'&&s.charAt(i+1)=='+')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"*");
                    s=s1.toString();
                    l=s.length();
                    i=0;
                }
                if(ch=='/'&&s.charAt(i+1)=='+')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"/");
                    s=s1.toString();
                    l=s.length();
                    i=0;
                }
                if(ch=='+'&&s.charAt(i+1)=='/')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"+");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='-'&&s.charAt(i+1)=='/')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"-");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='+'&&s.charAt(i+1)=='*')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"+");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='-'&&s.charAt(i+1)=='*')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"-");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='/'&&s.charAt(i+1)=='*')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"/");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='*'&&s.charAt(i+1)=='/')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"*");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='/'&&s.charAt(i+1)=='/')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"/");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='*'&&s.charAt(i+1)=='*')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"*");
                    s=s1.toString();
                    l=s.length();
                    flag_IE=1;
                    i=0;
                }
                if(ch=='E'&&s.charAt(i+1)=='-')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"EM");
                    s=s1.toString();
                    l=s.length();
                    i=0;
                }
            }
            if(flag_IE==1)
            {
                s=print(s);
                flag_IE=0;
            }
        }
        catch(Exception e)
        {

        }
        try
        {
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
                        if(ch=='^')
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
                        s=print(s);
                    }
                }
                l=s.length();
                for( i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='N'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='N')
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.delete(i,i+3);
                        if(s.charAt(i+3)=='*'||s.charAt(i+3)=='/'||s.charAt(i+3)=='^'||s.charAt(i+3)=='v')
                        {
                            s1.insert(i,"1");
                        }
                        if(s.charAt(i+3)=='+'||s.charAt(i+3)=='-')
                        {
                            s1.insert(i,"0");
                        }
                        s=s1.toString();
                        l=s.length();
                        s=print(s);
                    }
                }
                l=s.length();
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                l=s.length();
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
                                    if(ch2=='+'||ch2=='-'||ch2=='*'||ch2=='/'||ch2=='^'||ch2=='v')
                                    {
                                        ns2=n2.substring(0,j);
                                        z=1;

                                        StringBuffer sc2=new StringBuffer(n2);
                                        sc2.delete(0,j);
                                        ng2=sc2.toString();
                                        l2=n2.length();
                                    }
                                    else if(ch2!='+'||ch2!='-'||ch2!='*'||ch2!='/'||ch2!='^'||ch2!='v')
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
                            catch(Exception e)
                            {
                                System.out.println("    Math Erorr");
                            }
                            ans=Math.sqrt(num2);
                            an=Double.toString(ans);
                            an=Decimal_Zero_Remover(an);
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
                            i=0;
                            n2="";
                            ng1="";
                            ng2="";
                            ns2="";
                            num2=0;
                            an="";
                            sqrt--;
                            String nsn="";
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
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
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                l=s.length();
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
                            catch(Exception e)
                            {

                            }
                            ans=Math.pow(num1,num2);
                            an=Double.toString(ans);
                            an=Decimal_Zero_Remover(an);
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
                            String nsn="";
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
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
                l=s.length();
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                int flagspows=0;
                for( i=0;i<l;i++)
                {
                    char chs=s.charAt(i);
                    if(chs=='^')
                    {
                        flagspows=1;
                        pow++;
                    }
                }
                l=s.length();
                if(flagd==1&&div!=0&&pow<=0)
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
                            catch(Exception e)
                            {

                            }
                            ans=num1/num2;
                            an=Double.toString(ans); 
                            an=Decimal_Zero_Remover(an);
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
                            String nsn="";
                            if(s.startsWith("+"))
                            {
                                StringBuffer sp=new StringBuffer(s);
                                sp.delete(0,1);
                                s=sp.toString();
                                l=s.length();  
                            }
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
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
                l=s.length();
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                int flagsdivs=0;
                for( i=0;i<l;i++)
                {
                    char chs=s.charAt(i);
                    if(chs=='/')
                    {
                        flagsdivs=1;
                        div++;
                    }
                }
                l=s.length();
                if(flagm==1&&div<=0&&pro!=0&&flagsdivs==0&&flagspows==0)
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
                            catch(Exception e)
                            {

                            }
                            ans=num1*num2;
                            an=Double.toString(ans); 
                            an=Decimal_Zero_Remover(an);
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
                            String nsn="";
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
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
                l=s.length();
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                l=s.length();
                int flagspros=0;
                for( i=0;i<l;i++)
                {
                    char chs=s.charAt(i);
                    if(chs=='*')
                    {
                        flagspros=1;
                        pro++;
                    }
                }
                if(flagp==1&&pro<=0&&plus!=0&&flagspros==0)
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
                            catch(Exception e)
                            {

                            }
                            if(flagcount==1)
                            {
                                num1=-num1;   
                            }
                            ans=num1+num2;
                            an=Double.toString(ans); 
                            an=Decimal_Zero_Remover(an);
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
                            String nsn="";
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
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
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
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
                    if(s.startsWith("-"))
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
                            if(chsm=='^')
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
                            catch(Exception e)
                            {

                            }
                            if(flagcount==1)
                            {
                                if(ns1.startsWith("-")==false)
                                    num1=-num1;   
                            }
                            ans=num1-num2;
                            an=Double.toString(ans);
                            an=Decimal_Zero_Remover(an);
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
                            String nsn="";
                            if(flagbracket==1)
                            {
                                nsn=nb1+"("+s+")"+nb2;
                            }
                            if(flagbracket==0)
                            {
                                nsn=nb1+s+nb2;
                            }
                            nsn=print(nsn);
                        }
                        else
                        {
                            sub=0;  
                        }
                    }
                }
                l=s.length();
                try
                {
                    l=s.length();
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
                            i=0;
                        }
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
                    l=s.length();
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
                        if(ch=='/'&&s.charAt(i+1)=='*')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"/");
                            s=s1.toString();
                            l=s.length();
                            flag_IE=1;
                        }
                        if(ch=='*'&&s.charAt(i+1)=='/')
                        {
                            StringBuffer s1=new StringBuffer(s);
                            s1.delete(i,i+2);
                            s1.insert(i,"*");
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

                        flag_IE=0;
                    }
                }
                catch(Exception e)
                {

                }
                l=s.length();
                for( i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='N'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='N')
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.delete(i,i+3);
                        if(s.charAt(i+3)=='*'||s.charAt(i+3)=='/'||s.charAt(i+3)=='^'||s.charAt(i+3)=='v')
                        {
                            s1.insert(i,"1");
                        }
                        if(s.charAt(i+3)=='+'||s.charAt(i+3)=='-')
                        {
                            s1.insert(i,"0");
                        }
                        s=s1.toString();
                        l=s.length();
                        s=print(s);
                    }
                }
                l=s.length();
                if(flagbreak==1)
                {
                    break;
                }
                l=s.length();
                if(s.equalsIgnoreCase("infinity"))
                {
                    break;
                }
                try{
                    if(an.equals(s))
                    {
                        break;
                    }
                }
                catch(Exception e)
                {
                }
            }
        }
        catch(Exception e)
        {

        }
        return s;
    }

    public static String Calculate(String s)
    {
        int l=0;
        l=s.length();
        int flagbro=0;
        int flagbrok=0;int c=0;int c1=0;
        if(s.startsWith("(")==true)
        {
            flagbro=1;
            int flagsmm=0;char ch=' ';
            int p=0;int i;
            l=s.length();
            for( i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch=='(')
                {
                    p=i;
                    flagsmm=1;
                    l=s.length();
                    for(int j=i;j<l;j++)
                    {
                        char ch1=s.charAt(j);
                        if(ch1=='(')
                        {
                            c++;   
                        }
                        else
                        {
                            flagsmm=1; 
                            break;
                        }
                    }
                }
                if(flagsmm==1)
                {
                    break;
                }
            }
            if(flagsmm==1)
            {
                StringBuffer s1=new StringBuffer(s);
                s1.delete(p,p+c);
                s=s1.toString();
                l=s.length();
            }
            flagsmm=0;
            p=0;
        }
        String bo="";
        for(int i=0;i<c;i++)
        {
            bo=bo+"(";
        }
        if(s.endsWith(")")==true)
        {
            flagbrok=1;
            StringBuffer s2=new StringBuffer(s);
            s2.reverse();
            s=s2.toString();
            int flagsmm=0;char ch=' ';
            int p=0;int i;
            l=s.length();
            for( i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch==')')
                {
                    p=i;
                    flagsmm=1;
                    l=s.length();
                    for(int j=i;j<l;j++)
                    {
                        char ch1=s.charAt(j);
                        if(ch1==')')
                        {
                            c1++;   
                        }
                        else
                        {
                            flagsmm=1; 
                            break;
                        }
                    }
                }
                if(flagsmm==1)
                {
                    break;
                }
            }
            if(flagsmm==1)
            {
                StringBuffer s1=new StringBuffer(s);
                s1.delete(p,p+c1);
                s1.reverse();
                s=s1.toString();
                l=s.length();
            }
            flagsmm=0;
            p=0;
        }
        String bc="";
        for(int i=0;i<c1;i++)
        {
            bc=bc+")";
        }
        try {
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                if(s.startsWith("(")==false)
                {
                    if(ch=='('&&Character.isDigit(s.charAt(i-1))==true)
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.insert(i,"*");
                        s=s1.toString();
                        l=s.length();
                    } 
                    if(ch=='('&&s.charAt(i-1)=='-')
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.insert(i,"1");
                        s=s1.toString();
                        l=s.length();
                    } 
                }
                if(s.endsWith(")")==false)
                {
                    if(ch==')'&&Character.isDigit(s.charAt(i+1))==true)
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.insert(i+1,"*");
                        s=s1.toString();
                        l=s.length();
                    }
                }
                l=s.length();
            }
            if(flagbro==1)
            {
                s=bo+s;
            }
            if(flagbrok==1)
            {
                s=s+bc;
            }
            l=s.length();
            for(int j=0;j<10;j++)
            {
                l=s.length();
                for(int i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    l=s.length();
                    if(ch==')')
                    {
                        String n1=s.substring(0,i+1);
                        String n2=s.substring(i+1,l);
                        if(n2.startsWith("("))
                        {
                            n2="*"+n2;
                        }
                        int l1=n1.length();
                        String an=n1.substring(n1.lastIndexOf('('),l1);
                        StringBuffer s1=new StringBuffer(n1);
                        s1.delete(n1.lastIndexOf('('),l1);
                        n1=s1.toString();
                        an=bodmas(an,n1,n2);
                        s=n1+an+n2;
                        i=0;
                        s=print(s);
                    }
                    l=s.length();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("  Unmatched Parenthesis");
        }
        String nc1="";
        String nc2="";
        s=bodmas(s,nc1,nc2);
        return s;
    }

    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        System.out.println(" !  Note: Only Parenthesis can be as bracket \"(\" ,\")\"....");
        System.out.println(" !  Note: \"V\" - You can \"Enter\":\"v\" Only After the Answer to find its square root. \"NOt\" in the Middle of the Expression....");
        System.out.println(" !  Enter:\"V\" - Before a number to find its square root in the Middle of the Expression....");
        System.out.println(" !  Enter:\"Ans\"- For Draging The Answer Any Where....");
        System.out.println(" !  Enter:\"H With Index no. Example(H0,H1,H2,etc)\" To See History....");
        System.out.println(" !  Enter:\" \"- For Canceling Continued Calcutation....");
        System.out.println(" !  Enter:'TR'- For Terminating the programm....");
        System.out.println();
        for(int i=0;i<100;i++)
        {
            System.out.print("  Enter the Number :");
            String s=br.readLine();
            if(s.equalsIgnoreCase("tr"))
            {
                break;
            }
            if(s.equalsIgnoreCase(""))
            {
                flag=1;
            }
            if(flag==0)
            {
                s=multivariable_correction(s);
                print_nx(s);
                s=Extraction_nx(s);
            }
        }
    }

    public static String solve_pm(String s)
    {
        try{
            int l=s.length();
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                if(ch=='+'&&s.charAt(i+1)=='+')
                {
                    StringBuffer s1=new StringBuffer(s);
                    s1.delete(i,i+2);
                    s1.insert(i,"+");
                    s=s1.toString();
                    l=s.length();
                    i=0;
                }
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
            }
            l=s.length();
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                if(i>0)
                {
                    if(ch=='='&&s.charAt(i-1)=='+')
                    {
                        StringBuffer s1=new StringBuffer(s);
                        s1.delete(i-1,i);
                        s=s1.toString();
                        l=s.length();
                        i=0;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("  This Equation forms a Quadratic Equation");
        }
        return s;
    }

    public static String transfer_nx(String s)
    {
        int l=s.length();String s1="";String s2="";String s0="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='=')
            {
                s2=s.substring(0,i);
                s0=s.substring(i+1,l);
            }
        }
        int l1=s0.length();
        for(int i=0;i<l1;i++)
        {
            char ch=s0.charAt(i);
            if(ch=='+')
            {
                s1=s1+'-';
            }
            if(ch=='-')
            {
                s1=s1+'+';
            }
            else
            {
                s1=s1+ch;
            }
        }
        s=s2+s1;
        return s;
    }

    public static String ignore_equalto(String s)
    {
        int l=s.length();String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='=')
            {
                s1=s1+"+";
                s1=s1+ch+"+";
            }
            else
            {
                s1=s1+ch;
            }
        }
        return s1;
    }

    public static String remove_x(String s)
    {
        int l=s.length();String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='x'==false)
            {
                s1=s1+ch;
            }
            l=s.length();
        }
        s=s1;
        return s;
    }

    public static String div_x(String num1_s,String num2_s)
    {
        double ans=0;String an="";double num1=0;double num2=0;
        int l1=num1_s.length();int flagsd1=0;int flagsd2=0;int flagk=0;
        int l2=num2_s.length();
        String num1_sd="";String num2_sd="";
        if(num1_s.endsWith("x")||num2_s.endsWith("x"))
        {
            flagk=1;
            if(num1_s.endsWith("x"))
            {
                flagsd1=1;
                num1_sd=num1_s.substring(0,l1-1);
            }
            if(num2_s.endsWith("x"))
            {
                flagsd2=1;
                num2_sd=num2_s.substring(0,l2-1);
            }

            if(flagsd1==1)
            {
                num1=Double.parseDouble(num1_sd);
            }
            if(flagsd1==0)
            {
                num1=Double.parseDouble(num1_s);
            }

            if(flagsd2==1)
            {
                num2=Double.parseDouble(num2_sd);
            }
            if(flagsd2==0)
            {
                num2=Double.parseDouble(num2_s);
            }
            ans=num1/num2;
            an=Double.toString(ans);
            an=Decimal_Zero_Remover(an);
            if(flagsd2==1&&flagsd1==0)
            {
                an=an+"/x";  
            }
            if(flagsd2==0&&flagsd1==1)
            {
                an=an+"x";  
            }
        }

        if(num1_s.endsWith("x")&&num2_s.endsWith("x"))
        {
            flagk=1;
            num1_sd=num1_s.substring(0,l1-1);
            num2_sd=num2_s.substring(0,l2-1);
            num1=Double.parseDouble(num1_sd);
            num2=Double.parseDouble(num2_sd);
            ans=num1/num2;
            an=Double.toString(ans);
            an=Decimal_Zero_Remover(an);
        }
        else
        {
            if(flagk==0)
            {
                try{
                    num1=Double.parseDouble(num1_s);
                    num2=Double.parseDouble(num2_s);
                }
                catch(Exception e)
                {
                    System.out.println("  This Equation forms a Quadratic Equation");
                }
                ans=num1/num2;
                an=Double.toString(ans);
                an=Decimal_Zero_Remover(an);
            }
        }
        return an;
    }

    public static String pro_x(String num1_s,String num2_s)
    {
        double ans=0;String an="";double num1=0;double num2=0;
        int l1=num1_s.length();int flagsd1=0;int flagsd2=0;int flagk=0;
        int l2=num2_s.length();
        String num1_sd="";String num2_sd="";
        if(num1_s.endsWith("x")||num2_s.endsWith("x"))
        {
            flagk=1;
            if(num1_s.endsWith("x"))
            {
                flagsd1=1;
                num1_sd=num1_s.substring(0,l1-1);
            }
            if(num2_s.endsWith("x"))
            {
                flagsd2=1;
                num2_sd=num2_s.substring(0,l2-1);
            }

            if(flagsd1==1)
            {
                num1=Double.parseDouble(num1_sd);
            }
            if(flagsd1==0)
            {
                num1=Double.parseDouble(num1_s);
            }

            if(flagsd2==1)
            {
                num2=Double.parseDouble(num2_sd);
            }
            if(flagsd2==0)
            {
                num2=Double.parseDouble(num2_s);
            }
            ans=num1*num2;
            an=Double.toString(ans);
            an=Decimal_Zero_Remover(an);
            an=an+"x";  
        }

        if(num1_s.endsWith("x")&&num2_s.endsWith("x"))
        {
            flagk=1;
            num1_sd=num1_s.substring(0,l1-2);
            num2_sd=num2_s.substring(0,l2-2);
            num1=Double.parseDouble(num1_sd);
            num2=Double.parseDouble(num2_sd);
            ans=num1*num2;
            an=Double.toString(ans);
            an="";
            an=Decimal_Zero_Remover(an);
        }
        else
        {
            if(flagk==0)
            {
                num1=Double.parseDouble(num1_s);
                num2=Double.parseDouble(num2_s);
                ans=num1*num2;
                an=Double.toString(ans);
                an=Decimal_Zero_Remover(an);
            }
        }
        return an;
    }

    public static String solve_Div_pro(String s)
    {
        int flagd=1;int div=0;int i=0;String ns2="";String ng2="";String ns1="";String ng1="";double ans=0;String an="";int flagbracket=0;String nb1="";String nb2="";int flagm=1;int pro=0;
        int l=s.length();
        String num1_s="";String num2_s="";
        if(flagd==1)
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
                    num1_s=ns1;
                    num2_s=ns2;
                    an=div_x(num1_s,num2_s); 
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
                    String nsn="";
                    if(s.startsWith("+"))
                    {
                        StringBuffer sp=new StringBuffer(s);
                        sp.delete(0,1);
                        s=sp.toString();
                        l=s.length();  
                    }
                    if(flagbracket==1)
                    {
                        nsn=nb1+"("+s+")"+nb2;
                    }
                    if(flagbracket==0)
                    {
                        nsn=nb1+s+nb2;
                    }
                }
                else
                {
                    div=0;  
                }
            }
        }
        l=s.length();
        int flagsdivs=0;
        for( i=0;i<l;i++)
        {
            char chs=s.charAt(i);
            if(chs=='/')
            {
                flagsdivs=1;
                div++;
            }
        }
        l=s.length();
        if(flagm==1&&flagsdivs==0)
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
                    num1_s=ns1;
                    num2_s=ns2;
                    an=pro_x(num1_s,num2_s); 
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
                    String nsn="";
                    if(flagbracket==1)
                    {
                        nsn=nb1+"("+s+")"+nb2;
                    }
                    if(flagbracket==0)
                    {
                        nsn=nb1+s+nb2;
                    }
                }
                else
                {
                    pro=0;  
                }
            }
        }
        return s;
    }

    public static String Extraction_nx(String s)
    {
        int flag_print=0;
        System.out.println();
        print_nx(s);

        s=ignore_equalto(s);
        s=solve_Div_pro(s);  
        s=solve_pm(s);
        print_nx(s);

        s=transfer_nx(s);
        s=solve_pm(s);
        print_nx(s);

        s=solve_pm(s);

        s="+"+s+"+ ";
        int c=1;int p=0;int pb=0;int flag=0;String s1="";int j=0;int i=0;String s2="";
        int l=s.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                char ch=s.charAt(j);
                if(j>0)
                {
                    if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='v')
                    {
                        if(s1.endsWith("x"))
                        {
                            pb=j;
                            c=1;
                            flag=1;
                            l=s.length();
                            break;
                        }
                        else
                        {
                            pb=j;
                            s1="";
                            p=0;
                            c=1;
                            l=s.length();
                            pb=0;
                        }
                    }
                    else
                    {
                        if(c==1)
                        {
                            p=j-1;
                        }
                        s1=s1+ch;
                        c=0;
                        l=s.length();
                    }
                }
                flag=0;
                l=s.length();
            }
            l=s.length();
            if(flag==1)
            {
                if((s.charAt(p)=='+'||s.charAt(p)=='-')&&(s.charAt(pb)=='+'||s.charAt(pb)=='-'))
                {
                    s2=s2+s.charAt(p)+s1;
                    StringBuffer sb=new StringBuffer(s);
                    sb.delete(p,pb);
                    s=String.valueOf(sb);
                    l=s.length();
                }
            }
            l=s.length();
            c=1;pb=0;
            p=0;s1="";
        }
        s=solve_pm(s);
        s=space_remover(s);

        l=s.length();
        String nx_k=s2+s;
        print_nx(nx_k);

        s=Calculate(s);
        s2=remove_x(s2);
        s2=Calculate(s2);
        if(s2.equals("0")==false)
        {
            nx_k=s2+"x+"+s;
            nx_k=solve_pm(nx_k);
            print_nx(nx_k);

            nx_k=s2+"x=-"+s;
            s="-"+s;
            nx_k=solve_pm(nx_k);
            print_nx(nx_k);

            nx_k="x="+s+"/"+s2;
            nx_k=solve_pm(nx_k);
            print_nx(nx_k);
        }
        s=solve_pm(s);
        s2=solve_pm(s2);
        double num1=0;double num2=0;
        try{
            num1=Double.parseDouble(s);
            if(s.equalsIgnoreCase(" "))
            {
                s2="1";
            }
            num2=Double.parseDouble(s2);
        }
        catch(Exception e)
        {
            flag_print=1;
        }
        double ans=num1/num2;
        String an=String.valueOf(ans);
        an=Decimal_Zero_Remover(an);
        if(flag_print==0)
        {
            if(s2.equals("0")==false)
            {
                System.out.println("                x = "+an);	
            }
            else
            {
                System.out.println("  NO Variable Left");
            }
        }
        return nx_k;
    }
}
