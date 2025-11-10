package JavaCertPractice;
//Creating constructor that calls a parent class super class is called automatically
class ClassX {
    ClassX(){
        System.out.println("Class X");
    }
}

class ClassY extends ClassX {
    ClassY(){
        System.out.println("Class Y");
    }
}

class ClassZ extends ClassY{
    ClassZ(){
        System.out.println("Class Z");
    }
}

public class Encapsulation11_10{
    public static void main(String[] args) {
        ClassY  Y = new ClassZ();

    }
}