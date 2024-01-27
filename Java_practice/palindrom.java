import java.util.*;
class palindrom
{
    public static void main(String args[])
    {
        int n,m=0,j,r;
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        j=n;
        while(n>0)
        {
            r=n%10;
            m=(m*10)+r;
            n=n/10;
        }
        System.out.println(n);
        System.out.println("Sum is:"+m);
        if(j==m)
        System.out.println("The num is a palindrom number.");
        else
        System.out.println("The num is not a palindrom number.");
    }
}