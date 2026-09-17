import java.util.Scanner;
public class Person {
    private static Scanner input = new Scanner(System.in);
    private String name = input.nextLine();
    private int age = input.nextInt();
    private String email = input.nextLine();

    public String getName()
    {
        return name;
    }//ends getName

    private String setName()
    {
        System.out.println("Please enter your name.");
        Person.name = name;
        return name;
    }//ends setName

    public int getAge()
    {
        return age;
    }//engs getAge

    private int setAge()
    {
        System.out.println("Please enter your age.");
        Person.age = age;
        return age;
    }//ends setAge

    public String getEmail()
    {
        return email;
    }//ends getEmail

    private String setEmail(String email)
    {
        System.out.println("Please eneter your email.");
        Person.email = email;
        return email;
    }//ends setEmail

    public String displayInfo(String n, int a, String e)
    {
        String info = "Personal Information\n-----------------\nName: " + n + "\nAge: " + a + "\nEmail: " + e;
        return info;
    }//ends displayInfo

}//ends class
