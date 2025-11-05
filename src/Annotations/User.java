package Annotations;

public class User {

    String name;

    @NotEmpty
    String email;

    int age;

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString(){
        return "name";
    }
}
