class Car{
    void show(){
        System.out.println("the vhiclaes in staks are \n");
    }
}

class two_wheelers extends Car{
    void show(){
        System.out.println("There are 4 two_wheelers \n");
    }
}

class three_wheelers extends Car{
    void show(){
        System.out.println("There are 3 three_wheelers \n");
    }
}

class four_wheelers extends Car{
    void show(){
        System.out.println("There are 2 four_wheelers \n");
    }
}
    

public class Main
{
	public static void main(String S[]) {
	Car c = new Car();
	    c.show();
	two_wheelers c2 = new two_wheelers();
	    c2.show();
	three_wheelers c3 = new three_wheelers();
	    c3.show();
	four_wheelers c4 = new four_wheelers();
	    c4.show();  
	}
}
