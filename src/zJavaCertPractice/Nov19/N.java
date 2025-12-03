package zJavaCertPractice.Nov19;

class M {
   static Object obj = null;
   public M(String val){ obj = val; }
}

class N{

   private M m = new M("hello");

   public static void main(String[] args){
      N n = new N();
      n = null;
        System.gc(); // collects n but static field not garbage
        System.out.println(M.obj); //Prints hello 
   }
}
