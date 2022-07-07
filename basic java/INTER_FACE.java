interface A
{
void print1();
}
interface B
{
void print2();
}
class D implements A,B
{
public void print1()
{
System.out.println("Welcome");
}
public void print2()
{
System.out.println("To MITRC");
}
}
class INTER_FACE
{
public static void main(String args[])
{
D obj = new D();
obj.print1();
obj.print2();
}
}




