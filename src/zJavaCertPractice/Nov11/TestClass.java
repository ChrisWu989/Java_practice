package zJavaCertPractice.Nov11;

class TestClass{
   int i, j;
   public TestClass getInstance() {  return new TestClass();    }  //1 getInstance() name
   public void TestClass(int x, int y) {   i = x;   j = y;   }     //2 has a return
   public TestClass TestClass() {   return new TestClass();   }    //3 has a return
}

