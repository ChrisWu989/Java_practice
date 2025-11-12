package zJavaCertPractice.Nov11;

class Automobile{
   abstract void honk();  //(1) Not valid Abstract in normal class
}

abstract class Automobile{
   void honk();   //(2) Not Valid Needs body
}

abstract class Automobile{
   void honk(){};   //(3) Valid
}

abstract class Automobile{
   abstract void honk(){}   //(4) Not Valid has body
}

abstract class Automobile{
   abstract void honk();   //(5) Valid
}