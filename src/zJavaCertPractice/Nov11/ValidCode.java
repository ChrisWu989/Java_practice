package zJavaCertPractice.Nov11;
/*
Var can be any variable it depends on the compiler
Var can only be used as local variable inside method cant be instance
Var cannot be used as return type because it is a compile-time inference (return is explicit)
*/
public class ValidCode {
    var v1; // 2 Not valid

    public int main1(String[] args)  { // 3 Valid

        var v2; //4 Not Valid

        double x=10, double y;  // 5 Not Valid

        var v3 = null; //6 Not Valid

        for(var k=0; k<x; k++){ } //7 Valid

        Float params[][] = {1.1f, 1.2f, 3.2f};  //8 Not Valid

        return 0;
    }
}