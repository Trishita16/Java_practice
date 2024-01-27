interface Area
{
    float pi=3.14f;
    public void compute(float one,float two);
}
class Circle implements Area
{
    public void compute(float r,float d)
    {
        System.out.println("Area of this circle:"+(pi*r*r));
    }
}
class Rectangle implements Area
{
    public void compute(float w,float h)
    {
        System.out.println("Area of this rectangle:"+(w*h));
    }
}
class Area_of_circle_and_rectangle
{
    public static void main(String S[])
        {
            Circle cir=new Circle();
            cir.compute(5.2f,0f);
            Rectangle rec=new Rectangle();
            rec.compute(6.7f,8.9f);
        }
}