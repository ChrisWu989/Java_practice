package zJavaCertPractice.Nov12;

interface I { // Defines one method fine
  int getI(int a, int b); 
}

interface J{ // Defines one method fine
    int getJ(int a, int b, int c);
}

abstract class MyIJ implements J , I { } // compiles because abstract and interfaces define abstract methods

class MyI{ // Regular class no relation to interface
    int getI(int x, int y){ return x+y; }
}

interface K extends J{ //extends J and adds overload works because not override
    int getJ(int a, int b, int c, int d);
}
