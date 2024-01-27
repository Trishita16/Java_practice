class EMP{
    int empcode;
    String empname;
    void getdata(String n,int c){
        empcode = c;
        empname = n;
    }
    void showdata(){
        System.out.println("The empcode is "+empcode);
        System.out.println("The empname is  "+empname);
    }
}
class Sal extends EMP{
    int grossSal,DA,HRA;
    void getinput(int h,int d, int gc){
		grossSal = gc;
        DA=d;
        HRA=h;
    }
    void display(){
        System.out.println("The GrossSalary is "+grossSal);
        System.out.println("The DA is "+DA);
        System.out.println("The HRA is "+HRA);
    }
}
interface Deduct{
    int PF = 148,IT = 249;
    void show();
}
class EMPSAL extends Sal implements Deduct{
    
    int totalsal;
    void nettotal(){
        totalsal=grossSal-(PF+DA+HRA+IT);
    }
    public void show(){
        System.out.println("The PF is "+PF);
        System.out.println("The IT is "+IT);
    }
    void showrecord(){
        showdata();
        display();
        show();
         System.out.println( "Total Salary is "+totalsal);
    }
}
class Main6
{
	public static void main(String[] args) {

        EMPSAL e = new EMPSAL();
        e.getdata("Trishita Das",41);
        e.getinput(3,4,30000);
        e.nettotal();
        e.showrecord();
	}
}

