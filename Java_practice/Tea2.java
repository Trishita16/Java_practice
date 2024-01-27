class Method_1{

    void method()
	{
		System.out.println("Method 1");
	}
}

class Method_2 extends Method_1{

    void method()
	{
		System.out.println("Method 2");
	}
}
public class Tea2{
	public static void main(String args[])
	{
		Method_1 m = new Method_2();
		m.method();
	}
}
