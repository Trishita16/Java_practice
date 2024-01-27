import java.util.Scanner;

class Students {

    String name;
    int rollno;
    int classno;
}

class Arts extends Students{

    int bengali;
    int history;

    Arts(String name,int rollno,int classno)
    {
        this.name=name;
        this.rollno=rollno;
        this.classno=classno;
    }

    void getdata(int b,int h)
    {
        bengali=b;
        history=h;
    }

    void display(){
        System.out.println("NAME: "+name);
        System.out.println("ROLLNO.: "+rollno);
        System.out.println("CLASS : "+classno);
        System.out.println("BENGALI: "+bengali);
        System.out.println("HISTORY: "+history);
    }
}

class Science extends Students{

    int maths;
    int chemistry;
    Science(String name,int rollno,int classno)
    {
        this.name=name;
        this.rollno=rollno;
        this.classno=classno;
    }

    void getdata(int m,int c)
    {
        maths=m;
        chemistry=c;
    }

    void display(){
        System.out.println("NAME: "+name);
        System.out.println("ROLLNO.: "+rollno);
        System.out.println("CLASS : "+classno);
        System.out.println("MATHS: "+maths);
        System.out.println("CHEMISTRY: "+chemistry);
    }
}
class ST{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String n = sc.next();
        System.out.println("Enter the rollno.:");
        int r = sc.nextInt();
        System.out.println("Enter the classno:");
        int c  = sc.nextInt();

        System.out.println("Enter the marks of bengali:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of history:");
        int h = sc.nextInt();

        Arts a = new Arts(n,r,c);
        a.getdata(b,h);
        a.display();

        System.out.println("Enter the marks of maths:");
        int m = sc.nextInt();
        System.out.println("Enter the marks of chemistry:");
        int ch = sc.nextInt();

        Science sci = new Science(n,r,c);
        sci.getdata(b,h);
        sci.display();
    }
}