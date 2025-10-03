package Collections;

public class Product {
    String name;
    String desc;
    int rating;
    Product(String name, String desc, int rating){
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + desc + "', rating=" + rating + "}";
    }

}
