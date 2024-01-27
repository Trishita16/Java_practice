class Emp
{
    int emcode;
    String empname;
    void getdata(int c,String n)
    {
        c=emcode;
        n=empname;
    }
    void showdata()
    {
        System.out.println("The emcode is "+emcode);
        System.out.println("The empname is "+empname);
    }
}
class Sal extends Emp
{
    int grossal;
    int DA;
    int HRA;
    void getinput(int g,int d,int h)
    {
        g=grossal;
        d=DA;
        h=HRA;
    }
    void dispaly()
    {
        System.out.println("The grossal is "+g);
        System.out.println("The DA is "+d);
        System.out.println("The HRA is "+h);
    }
}
interface Deduct
{
    int PF=765,IT=294;
    void show();
}
class EMPSAL extends Sal implements Deduct{
    
    int totalsal;
    void nettotal(){
        totalsal=grossSal-(PF+DA+HRA+IT);
    }
    public void show(){
        System.out.println("PF - "+PF);
        System.out.println("IT - "+IT);
    }
    void showrecord(){
        showdata();
        display();
        show();
         System.out.println("NET Salary "+totalsal);
    }
}
class Main5
{
	public static void main(String[] args) {

        EMPSAL e3 = new EMPSAL();
        e3.getdata("Trishita Das",041);
        e3.getinput(30000,3,4);
        e3.nettotal();
        e3.showrecord();
	}
}
