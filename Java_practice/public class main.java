interface Shape {
  public void calculatePerimeter();
  public void calculateArea(); 
}
class Circle implements Shape {
    double radius;
    Circle(double r){
        radius=r;
    }
  public void calculatePerimeter() {
    System.out.println("perimeter circle :"+(2*3.14*radius));
  }
  public void calculateArea() {
    System.out.println("area circle : "+(3.14*radius*radius));
  }
}

class Rectangle implements Shape {
    double width,height;
    Rectangle(double h,double w){
        height=h;
        width=w;
    }
  public void calculatePerimeter() {
    System.out.println("perimeter Rectangle :"+(2*(height*width)));
  }
  public void calculateArea() {
    System.out.println("area Rectangle : "+(height*width));
  }
}

public class main{
  public static void main(String[] args) 
  {
    Circle c = new Circle(7); 
    c.calculatePerimeter();
    c.calculateArea();
    
    System.out.println();
    
    Rectangle rec = new Rectangle(7.5,6.0); 
    rec.calculatePerimeter();
    rec.calculateArea();
  }
}