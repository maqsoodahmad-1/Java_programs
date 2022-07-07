import java.util.*;
class player
{
String name;
int age;
player(String n, int a)
{
name = n;
age = a;
}
public void show()
{
System.out.println("Name of player :"+name);
System.out.println("Age of player :"+age);
}
}
class cricket_player extends playerdetails
{
String type;
cricket_player(String n,int a,String b)
{
super(n,a);
type = b;
}
public void show()
{
super.show();
System.out.println("Type of game:"+type);
}
}
class hockey_player extends playerdetails
{
String type;
hockey_player(String n,int a,String b)
{
super(n,a);
type =b;
}
public void show()
{
super.show();
System.out.println("Type of game:"+type);
}
}
class football_player extends playerdetails
{
String type;
football_player(String n,int a,String b)
{
super(n,a);
type =b;
}
public void show()
{
super.show();
System.out.println("Type of game:"+type);
}
}

class ab
{
public static void main(String args[])
{
cricket_player a = new cricket_player("ram",23,"cricket");
football_player b = new football_player("mohan",34,"football");
hockey_player c = new hockey_player("shahid",24,"hockey");
a.show();
b.show();
c.show();
}
}
