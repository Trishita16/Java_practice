import java.util.Scanner;
class digit
{
    public static void main(String args[])
   {
    int n,r,sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.println("Sum of digit="+sum);
   }
}