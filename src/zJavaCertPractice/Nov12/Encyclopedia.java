package zJavaCertPractice.Nov12;

interface Book{
  public default String getId(){
     return "ISBN123456";
  }
}

interface Encyclopedia extends Book{
   //INSERT CODE HERE
}

// No Overriding NOT VALID
// static String getId(){
//   return "AIN8888";
// }

// Works because default/abstract no static
// String getId(); 
// default String getId(){
//    return "AIN8888";
// };

// No static allowed Unvalid
// abstract static String getName();

// static method needs a body Unvalid
// static String getAuthor();

// default needs a body Unvalid
// default String getAuthor();

// 
// private String getId(){
//     return "ISBN123456";
