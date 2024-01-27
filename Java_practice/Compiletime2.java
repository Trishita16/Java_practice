class Compiletime {

     int add(int a, int b)
	{
		System.out.println("a + b ="+ (a + b));
        return 0;
	}

     int add(int a,int b,int c)
	{
		 System.out.println("a + b + c ="+(a + b + c));
         return 0;
	}
}
public class Compiletime2{
	public static void main(String args[])
	{
        Compiletime c = new Compiletime();
	        c.add(9,6);

            c.add(5,4,3);
	}
}