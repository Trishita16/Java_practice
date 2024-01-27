import java.util.Scanner;
class fact
{
    public static void main(String[] args) {
        int n,fact=1;
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1; i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is="+fact);
    }
}