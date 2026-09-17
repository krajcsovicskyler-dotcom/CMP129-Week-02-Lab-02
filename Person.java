public class Person {
    private String name;
    private int age;
    private String email;

    String getName()
    {
        return this.name;
    }//ends getName

    void setName(String name)
    {
        this.name = name;
    }//ends setName

    int getAge()
    {
        return this.age;
    }//engs getAge

    void setAge(int age)
    {
        this.age = age;
    }//ends setAge

    String getEmail()
    {
        return this.email;
    }//ends getEmail

    void setEmail(String email)
    {
        this.email = email;
    }//ends setEmail

    String displayInfo(String this.name, int this.age, String this.email)
    {
        String info = "Personal Information\n-----------------\nName: " + this.name + "\nAge: " + this.age + "\nEmail: " + this.email;
        return info;
    }//ends displayInfo

}//ends class
