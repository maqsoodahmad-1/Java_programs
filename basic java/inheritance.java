import java.util.*;
class SUBCLASS
{
int length ;
int breadth;
void area(int x,int y)
{
int area;
length=x;
breadth=y;
area=length*breadth;
System.out.println("the area is ="+area);
}
}
class inheritance 
{
public static void main(String args[])
{
SUBCLASS sub =new SUBCLASS();
sub.area(2,5);
}
}
