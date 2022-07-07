import java.util.*;
interface polygon{
    void getArea();
    default void getSides(){
        System.out.println("I can get sides of a polygon");
    }
}

class rectangle implements polygon{
    public void getArea(){
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of ractangle is "+area);
    }

    public void getSides(){
        System.out.println("I have 4 sides.");
    }
}

class square implements polygon{
    public void getArea()
    {
        int length = 5;
        int area = length * length;
        System.out.println("The area of square is : "+area);
    }
}
class interfacedemo{
    public static void main(String args[])
    {
        rectangle r1 = new rectangle();
        r1.getArea();
        r1.getSides();

        square s1 = new square();
        s1.getArea();
        s1.getSides();
    }
}

