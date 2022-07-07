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
class cricket_player extends player
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
class hockey_player extends player
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
class football_player extends player
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
cricket_player a = new cricket_player();
football_player b = new football_player();
hockey_player c = new hockey_player();
Scanner cname=new Scanner(System.in);
System.out.println("enter the name of cricketer");
String cricketer_name =  cname.nextLine();
Scanner cage =new Scanner(System.in);
System.out.println("enter the age of cricketer");
int cricketer_age = cage,nexInt();
Scanner hname = new Scanner(System.in);
System.out.println("enter the name of hockey-player");
String hockey_palyer_name = hname.nextLine();
Scanner hage = new Scanner(System.in);
System.out.println("enter the age of hokey_player");
int age = hage.nextInt();
Scanner fname = new Scanner(System.in);
System.out.println("enter the name of footballer");
String  footballer_name = fname.nextLine();
Scanner fage = new Scanner(Ststen.in);
System.out.println("enter the age of footballer");
int footballer_age = fage.nextINt();
a.
a.show();
b.show();
c.show();
}
}


