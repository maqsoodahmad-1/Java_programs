import java.util.*;
interface A{
    void print();
}

interface B{
    void print1();
}

class C implements A,B{
    public void print()
    {
        System.out.println("function of A");
    }

    public void print1()
    {
        System.out.println("function of B");
    }
}

public class interfacetest {
    public static void main(String args[])
    {
        C c = new C();
        c.print();
        c.print1();
    }
    
}
