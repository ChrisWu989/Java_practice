package zJavaCertPractice.Nov11;
/*
psvm is public static void main

*/
public class Test {

    static int x;
    int y;

    Test() {
        int z;
        z = x;
        x++;
        y += z;
    }

    static boolean result;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.result);
    }
}
