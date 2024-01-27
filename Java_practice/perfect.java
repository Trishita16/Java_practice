import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        int n,sum=0,temp;
        System.out.println("Enter the number:");
        Scanner p=new Scanner(System.in);
        n=p.nextInt();
        temp=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(temp==sum)
        System.out.println("The number is perfect");
        else
        System.out.println("The number is not perfect");
    }
}