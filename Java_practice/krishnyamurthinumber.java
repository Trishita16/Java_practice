import java.util.*;
class krishnyamurthy
{
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc=new scanner(System.in);
        int n=sc.nextInt();
        int i,m=n,r=0,f=1,sum=0;
        while(n>0);
        {
            r=n%10;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
        sum=sum+f;
        n=n/10;
        f=1;
        }
        if(sum==m)
        System.out.println("Krishnyamurthi number");
        else
        system.out.println("Not Krishnyamurthi number");
    }
}