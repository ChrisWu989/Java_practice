package JavaCertPractice;

class Parent{
    public short getValue(){
        return 1;
    }

    public long sum(int a, long b) {
        return a + b;
    }
}

class Child extends Parent{
    //Needs same return type
    public short getValue(){
        return 2;
    }
}
public class Polymorphism11_10 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.getValue());

        Parent p1 = new Parent();
        System.out.println(p1.sum(0,1));
    }
}
//Overriding is implementation
//Overloading is parameters

