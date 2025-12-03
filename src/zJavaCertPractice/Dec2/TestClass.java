package zJavaCertPractice.Dec2;

import java.io.IOException;

class MyException extends Exception {
  private final int code;
  public MyException(int code, Throwable actualEx){
    super(actualEx);
    this.code = code;
  }
  
  public MyException(int code, String message, Throwable actualEx){
    super(message, actualEx);//1
    this.code = code;
  }
  
  public String getMessage(){
      return String.format("Exception - Code=%d, Msg=%s, OrigMsg=%s",
                            code, super.getMessage(), this.getCause().getMessage()); //2
  }
}

public class TestClass {
    public static void main(String[] args) {
      try{
        throw new MyException(404, "NOT FOUND",
           new IOException("FILE UNREADABLE")); //3
      }catch(Exception e){
          System.out.println(e.getMessage());
      }

      try{
        RuntimeException re = null;
        throw re;
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
/*
Several similar default methods need to be added to this interface and each method is supposed to log a message at the start of the method. 
As of now, the logging is done using just a println statement but it may change later.

What changes can be done in the above interface to make it more maintainable without exposing any non-business functionality to the users of this interface?
Select 1 option(s):
1. Add a public void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
2. Add a protected void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
3. Add a private void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
4. Add a static void log(String msg) method to write the log message and invoke it from other methods instead of using println statement. 

OPTION 3 IS CORRECT
*/