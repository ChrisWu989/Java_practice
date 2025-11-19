package zJavaCertPractice.Nov17;

public enum Coffee 
{   
    //Add string strength to Mocha and Latte
    ESPRESSO("Very Strong"), MOCHA, LATTE("Weak"); 

    public String strength;

    Coffee(String strength) 
    {
         this.strength = strength; 
    }
    public String toString(){   return strength + ordinal(); } 
}
