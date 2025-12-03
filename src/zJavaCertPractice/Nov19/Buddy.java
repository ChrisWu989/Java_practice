package zJavaCertPractice.Nov19;

public class Buddy {
    Buddy upper;
    String name;
    public Buddy(){ }
    
    public Buddy(String name){
        this.name = name;
    }
    public Buddy(String name, Buddy upper){
        this.name =  name;
        Buddy b = new Buddy(upper.name);//1
        upper = b; //2
    }
    
    public static void main(String[] args) {
        Buddy b1 = new Buddy("A");     //3
        Buddy b2 = new Buddy("B", b1); //4
        System.out.println(b1); //5
    } //b1 garbage after line 5 main
}       // line 2 garbage var