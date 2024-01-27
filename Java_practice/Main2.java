class Parents{
    int a=5;
    void show(){
        System.out.println("parent class value = "+a);
    }
}

class Child extends Parents{
    void show(int a){
        System.out.println("child class value = "+(super.a));
        this.a=a;
        show();
    }
}

class Main2{
    public static void main (String[] args) {
        AX t=new AX();
        t.show(20);
    }
}