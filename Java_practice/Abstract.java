Abstract classs A 
{
    abstract void f1();
}
class B extends Abstract
{
    void f1();
    {
        System.out.println("HELLO");
    }
}
class C extends B
{
    void f2();
    {
        System.out.println("WORLD");
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.f1();
        C obj=new C();
        obj.f2();
    }
}
