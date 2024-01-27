class Area{
    void area(){
        System.out.println("the area and Peremeters of citrcle,rectengandle,squre and triangle are:\n");
    }
}

class Circle extends Area{
    float pi=22/7;
    float Area(float r){
        System.out.println("the area of circle is: "+(pi*(r*r)));
    return 0;
    }
    float Perimeter(float r){
        System.out.println("the Perimeter of circle is: "+(pi*(r*r))+"\n");
    return 0; 
    }
}

class Rectangle extends Area{
    float Area(float l,float b){
        System.out.println("the area of Rectangle is:"+(l*b));
    return 0;
    }
    float Perimeter(float d,float c){
        System.out.println("the Perimeter of Rectangle is:"+(2*(d+c))+"\n");
    return 0; 
    }
}

class Square extends Area{
    float Area(float s){
        System.out.println("the area of Square is:"+(s*s));
    return 0;
    }
    float Perimeter(float s){
        System.out.println("the Perimeter of Square is:"+(4*s)+("\n"));
    return 0; 
    }
}

class Traingle extends Area{
    float Area(float h,float b){
        System.out.println("the area of Traingle is:"+(0.5*h*b));
    return 0;
    }
    float Perimeter(float h,float b,float a){
        System.out.println("the Perimeter of Traingle is:"+(h+b+a)+"\n");
    return 0; 
    }
}
    

public class Area2
{
	public static void main(String S[]) {
	Area a = new Area();
	    a.area();
	    
	    
	Circle c = new Circle();
	    c.Area(8);
	    c.Perimeter(9);
	    
	Rectangle r= new Rectangle();
	    r.Area(9,6);
	    r.Perimeter(5,5);
	
	Square s= new Square();
	    s.Area(4);
	    s.Perimeter(6);
	    
	Traingle t= new Traingle();
	    t.Area(6,2);
	    t.Perimeter(9,8,7);
	    
	}
}
