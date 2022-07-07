import java.util.*;

 class player{
    String  name;
    int age;
    player(String n , int a)
    {
        name = n;
        age = a; 
    }
  
    public void show()
    {
        System.out.println("Name of the player is " +name);
        System.out.println("Age of the player is " +age);
    }
}

class cricket_player extends player
{
    String type;
    cricket_player(String n, int a, String b)
    {
      super(n,a);
      type = b;
    }
    public void show(){
        super.show();
        System.out.println("Type of game " +type);
    }
}
class football_player extends player
{
         String type;
        football_player(String n, int a, String b)
       {
        super(n,a);
        type = b;
       }
        public void show()
       {
          super.show();
          System.out.println("Type of game " +type);
        }

}

class hockey_palyer extends player
{    
         String type;
       hockey_palyer(String n, int a, String b)
       {
        super(n,a);
        type = b;
       }
       public void show()
       {
         super.show();
         System.out.println("Type of game " +type);
       }
}

public class playerdetails
{
    public static void main(String args[])
    {
        cricket_player a = new cricket_player("maqsood", 20, "cricket");
        football_player b = new football_player("anmol", 22, "football");
        hockey_palyer c = new hockey_palyer("shahid", 23, "hockey");
        a.show();
        b.show();
        c.show();
    }
}

