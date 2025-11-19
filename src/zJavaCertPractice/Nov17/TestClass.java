package zJavaCertPractice.Nov17;

import java.util.TreeSet;

enum Title
{
    MR("Mr."), MS1("Ms."), MS2("Ms.");
    private String title;

    private Title(String s){
        title = s;
    }

    public String format(String first, String last) {
        return title + " " + first + " " + last;
    }
}  

enum AccountType{
    CHECKING("Checking account"), SAVINGS("Savings account"),
    FD("Fixed Deposit");
    
    private String desc;
    AccountType(String desc){
        this.desc =  desc;
    }
    
    @Override
    public String toString(){
        return "Acct type:"+super.toString();
    }
    
}


public class TestClass{
    public String printer(Title t, String f, String l) {
        return t.format(f, l);
    }

    public static void main(String[] args) {
        // One Problem
        var ts = new TreeSet<Title>();
        ts.add(Title.MS2);
        ts.add(Title.MR);
        ts.add(Title.MS1);
        // Treeset sorts elements and enums are sorted ordinal (order of declaration)
        for(Title t :  ts){
            System.out.println(t);
        }

        //Two Problem
        TestClass tc = new TestClass();
        System.out.println(tc.printer(Title.MR, "John", "Doe"));

        //Three Problem
        // 2 is order
        // act type FD because super calls main
        var at = AccountType.valueOf("FD");
        System.out.println(at.ordinal()+" "+at);
    }
}

LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0); 

ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
date = date.plus(Duration.ofDays(1)); // Means exactly 24 hrs later
System.out.println(date); // Nov 1

date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
date = date.plus(Period.ofDays(1)); // Adds calender based day
System.out.println(date); // Nov 1