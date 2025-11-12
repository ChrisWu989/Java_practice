package zJavaCertPractice.Nov11;

class Square {
    private double side = 0;
    String color;

    public Square(double length){
        this.side = length;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(5.5);
        sq.color = "Black";
        sq.setSide(7.5);
    }
}
