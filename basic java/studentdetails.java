import java.util.*;
class student
{
    int regno;
    String name;
    int marks[];
    int total;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        marks = new int[5];
        System.out.print("Enter the registration number :");
        regno = sc.nextInt();
        System.out.print("Enter the name of the student :");
        name = sc1.nextLine();
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Enter marks " + i +":");
            marks[i] = sc.nextInt();
        }
        
        System.out.println("***********************************************************");

    }    

    public void total_marks()
    {
        for(int j = 0 ; j < 5 ; j++)
        {
            total =total + marks[j];
        }
    }
    
    public void display()
    {
        System.out.println("------------------------------------------------------------");
        System.err.println("Students name : " + name);
        System.out.println("Students registration no : " + regno);
        for(int i = 0 ;i < 5 ; i++)
        {
            System.out.println("Marks " + i + " " + marks[i]);
        }
        System.out.println("Total marks of student : " + total);
    }

}
public class studentdetails{
    public static void main(String args[])
    {
        student obj[] = new student[5];
        for(int i = 0 ; i < 5 ; i++)
        {
            obj[i] = new student();
        }

        for(int i = 0 ; i < 5 ; i++)
        {
            obj[i].input();
        }
        for(int i = 0;i < 5 ; i++)
        {
            obj[i].total_marks();
        }
        for(int i = 0 ; i < 5 ; i++ )
        {
            obj[i].display();
        }
    }
}