package JavaCertPractice;
// Static methods belong to class itself not instances of the class
// Can call static method without creating an Object of that class
// RULE: USE STATIC METHOD WHEN OPERATION IS RELATED TO CLASS AS A WHOLE AND DOES NOT REQUIRE OBJECT STATE

//Instant method cant override static
//Fields are not polymorphic
class StaticMethods11_10 {
    int x = 200;
    public static void method1(){
        System.out.println("class A static method");
    }
}

class ClassB extends StaticMethods11_10 {
    int x = 300;
    public static void method1(){
        System.out.println("class B static method");
    }

    // public void method1(){
    //     System.out.println("class B method");
    // }
}

class Main {
    public static void main(String[] args) {
        StaticMethods11_10 a = new ClassB(); //a is a type ClassA and it refers to ClassB
        System.out.println(a.x);
    }
}
