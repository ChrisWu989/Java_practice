package zJavaCertPractice.Nov12;

interface I1
{
void m1() throws java.io.IOException;
}

interface I2
{
void m1() throws java.sql.SQLException;
}
public class Test3 implements I1, I2 {
    public void m1() throw //impossible
}
// What methods have to be implemented by a class that says it implements I1 and I2 ?
// (Assume that IOException and SQLException do not have a parent-child relationship.)