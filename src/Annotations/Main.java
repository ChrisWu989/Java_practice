package Annotations;

public class Main{
    public static void main(String[] args) {
        User u = new User("", 20, "abc@ddfsf");
        Validator.validate(u);
        System.out.println(u);
    }

    // @Override
    // public void printFile(String fileName) {
    //     System.out.println(fileName);
    // }
}
