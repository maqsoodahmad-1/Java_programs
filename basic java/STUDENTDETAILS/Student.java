package STUDENTDETAILS;
public class Student{
 
    String name;
    String fathers_name;
    String mobile_number;
    String date_of_birth;   
    String address; 

    public Student(String name, String fathersname, String mobile_number, String date_of_birth,String address)
    {
        this.name = name;
        this.fathers_name = fathersname;
        this.date_of_birth = date_of_birth;
        this.mobile_number = mobile_number;
        this.address = address;
    }



     void printname()
    {
        System.out.println("The name of student is : "+name);
    }

    void printfathersname()
    {
        System.out.println("Fathers name of student is : "+fathers_name);
    }

    void printmobileno()
    {
        System.out.println("The mobile number of student is : "+mobile_number);
    }
 
    void printdob()
    {
        System.out.println("Date of birth of student is : "+date_of_birth);
    }

    void setname(String name)
    {
        this.name = name;
    }

    void setfathersname(String fathers_name)
    {
        this.fathers_name = fathers_name;
    }

    void setmobileno(String  mobile_no)
    {
        this.mobile_number = mobile_no;
    }

    void setdob(String dob)
    {
        this.date_of_birth = dob;
    }

   public void print()
    {
        printname();
        printfathersname();
        printmobileno();
        printdob();
    }

}


