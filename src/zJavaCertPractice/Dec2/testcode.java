package zJavaCertPractice.Dec2;

SequencedCollection<String> s1 = new ArrayList<>( ); -> []
s1.addFirst("a"); -> ["a"]
s1.addFirst("b"); ->["b", "a"]


s1.addLast("c"); -> ["b", "a", "c"]
s1.add("a"); -> ["b", "a", "c", "a"]
System.out.println(s1.removeFirst()+" "+s1.remove("a")+" "+s1.remove("x")); -> b true false


List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
messages.stream().forEach(s->s.append("helloworld"));
messages.forEach(s->{
    s.insert(5,",");
    System.out.println(s);
});
/*
1. An overloading method must have a different parameter list and same return type as that of the overloaded method.
2. If there is another method with the same name but with a different number of arguments in a class then that method can be called as overloaded.
3. If there is another method with the same name and same number and type of arguments but with a different return type in a class then that method can be called as overloaded.
4. An overloaded method means a method with the same name and same number and type of arguments exists in the super class and sub class.

parameters different 
2 is correct
*/

/*
Which of the following class definitions is/are legal definition(s) of a class that cannot be instantiated?

class Automobile{
   abstract void honk();  //(1)
}

abstract class Automobile{
   void honk();   //(2)
}

abstract class Automobile{
   void honk(){};   //(3)
}

abstract class Automobile{
   abstract void honk(){}   //(4)
}

abstract class Automobile{
   abstract void honk();   //(5)
}

OPTIONS 3 and 5 correct
*/

/*
    String a = "java";
    char[] b = { 'j', 'a', 'v', 'a' };
    String c = new String(b);
    String d = a;


Which of the following expressions will evaluate to true?

Select 3 option(s):
1 (a == d) true
2 (b == d) false
3 (a == "java") true
4 a.equals(c) true
*/