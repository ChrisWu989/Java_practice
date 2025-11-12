package zJavaCertPractice.Nov11;

class TestClass{
   int i, j;
   public TestClass getInstance() {  return new TestClass();    }  //1
   public void TestClass(int x, int y) {   i = x;   j = y;   }     //2
   public TestClass TestClass() {   return new TestClass();   }    //3
}

