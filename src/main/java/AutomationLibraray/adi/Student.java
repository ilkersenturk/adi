package AutomationLibraray.adi;

import java.util.List;

public class Student {


    /*
     * Every Student has
     *
     * name : String
     * last name : String
     * address : String
     * age : integer
     * money : Credit Class object
     * books : List of Book Object
     * point : integer
     *
     */
    private String name;
    private String lastName;
    private String adress;
    private int age;
    private double book;
    private int point;

    private String quote;

    //This method is constructor
    Student(String studentName, String studentLastName, String studentAddress, int studentAge, double studentMoney, int studentPoint) {
        name = studentName;
        lastName = studentLastName;
        adress = studentAddress;
        age = studentAge;
        book = studentMoney;
        point = studentPoint;
    }




    //Getter method to get the name
    public String getName() {
        return this.name;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    //Getter method to get the lastName
    public String getLastName() {
        return this.lastName;
    }

    //Setter method to set the lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter method to get the address
    public String getAdress() {
        return this.adress;
    }

    //Setter method to set the address
    public void setAdress(String address) {
        this.adress = address;
    }

    //Getter method to get the age
    public int getAge() {
        return this.age;
    }

    //Setter method to set the age
    public void setAge(int age) {
        this.age = age;
    }
//Getter method to get the money
    public double getBook(){
        return this.book;
    }

    //Setter method to set the money
    public void  setBook(double book){
        this.book=book;
    }

    //Getter method to get the point
    public int getPoint(){
        return this.point;
    }

    //Setter method to set the point
    public  void setPoint(int point){
        this.point=point;
    }

    public  String getQuote(List<List<String>>quotes){
        return this.quote;
    }
}
