package zJavaCertPractice.Nov13;

class Test {
    public static void main(String[] args) {
        // Prints 2 1 
        // If j-- prints 2 1 0
        var j = 2;
        do {
            System.out.println(j);
        } while (--j > 0);

        
        //int, long, char, byte, short , var
        // m cannot be long var byte
        // m can be a int, short, char
        switch( m ){
            case 32  -> System.out.println("32");
            case 64  -> System.out.println("64");
            case 128 -> System.out.println("128");
        }

        // java Test.java
        // Input Hello World
        // prints Hello
        for(int i = 0; i < args.length; i++){
            System.out.println(i == 0 ? args[i] : " " + args[i]);
        }

        // Prints 1
        int a = 1;
        int[] ia = new int[10];
        int b = ia[a];
        int c = b + a;
        System.out.println(b = c);

        // Prints 7
        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;
        int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 )
                            + secondValue/2;
        System.out.println(functionValue);

        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        c = i;  //4 WRONG
        c++;    //5 
    } 
}
