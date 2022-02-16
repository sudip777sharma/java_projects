import java.io.*;
class Day_prediction
{
    public static int year_day(int n3)
    {
        int c=0;int k=6;
        for(int i=0;i<n3;i++)
        {
            c++;
            if(i%4==0)
            {
                c++;
            }
        }
        c=c+k;
        c=c%7;
        return c;
    }

    public static int month_day(int n3c,int n2,int n3)
    {
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int al[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int s=0;
        for(int i=0;i<n2-1;i++)
        {
            if(n3%4==0)
            {
                s=s+al[i];
            }
            if(n3%4!=0)
            {
                s=s+a[i];
            }
        }
        s=s+n3c;
        s=s%7;
        return s;
    }

    public static int week_day(int n1,int n2c,int n_d_m)
    {
        int c=0;
        for(int i=1;i<n_d_m;i++)
        {
            if(n1==i)
            {
                break;
            }
            else
            {
                c++;
            }
        }
        c=c+n2c;
        c=c%7;
        if(c==0)
        {
            c=7;
        }
        return c;
    }

    public static void main(String args[])throws IOException
    {
        String day[]={"................Monday................","................Tuesday................","................Wednuesday................","................Thrusday................","................Friday................","................Saturday................","................Sunday................"};
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int al[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int n_d_m=0; 
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            for(int i=0;i<100;i++)
            {
                System.out.println("Enter the Date ");
                String s=br.readLine();
                if(s.equalsIgnoreCase("tr"))
                {
                    break;
                }
                String sc="";
                int l=s.length();
                for(int k=0;k<l;k++)
                {
                    if(s.charAt(k)==' ')
                    {
                        sc=sc+":";
                    }
                    else
                    {
                        sc=sc+s.charAt(k);
                    }
                }
                s=sc;
                l=s.length();
                String s1=s.substring(0,s.indexOf(':'));
                String s2=s.substring(s.indexOf(':')+1,s.lastIndexOf(':'));
                String s3=s.substring(s.lastIndexOf(':')+1,l);
                int l3=s3.length();
                if(l3==4)
                {
                    s3=s3.substring(2,4);
                }
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=Integer.parseInt(s3);
                if(n3==2000)
                {
                    n3=0;
                }
                int n3c=year_day(n3);
                int n2c=month_day(n3c,n2,n3);
                if(n3%4==0)
                {
                    n_d_m=al[n2-1];
                }
                if(n3%4!=0)
                {
                    n_d_m=a[n2-1];
                }
                int n1c=week_day(n1,n2c,n_d_m);
                String d=day[n1c-1]; 
                int ld=d.length();
                for(int j=0;j<ld;j++)
                {
                    for(double k=0;k<100000000;k+=1)
                    {
                    }
                    System.out.print(d.charAt(j));  
                }
                System.out.println();  
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
    }
}