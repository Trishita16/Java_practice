class Animal_kingdom {
    void show(){
        System.out.println("the Animals in the park are \n");
    }
}

class mamles extends Animal_kingdom{
    void show(){
        System.out.println("Mamles\nHorse - 10\nPig - 17\nDonkey - 6\n");
    }
}

class amphibians extends Animal_kingdom{
    void show(){
        System.out.println("\namphibions\nFrog-9\n Toads -6\nNewts-7\n");
    }
}

class Arials extends Animal_kingdom{
    void show(){
        System.out.println("\narials\npigon - 10\nHumming bird- 2\n");
    }
}
    

public class Animal2
{
	public static void main(String S[]) {
	Animal_kingdom a= new Animal_kingdom();
	    a.show();
	mamles m= new mamles();
	    m.show();
	amphibians ap= new amphibians();
	    ap.show();
	arials ar = new arials();
	    ar.show();  
	}
}
