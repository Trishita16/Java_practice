import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        if(n%2==0)
        {
            System.out.println("The given number "+n+" is even");
        }
        else
        {
            System.out.println("The given number "+n+" is odd");
        }
    }
    

}