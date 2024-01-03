public class Employee {
    float salary=4000;
}

class Programmer extends Employee{
    int bonus=1000;

public static void main(String args[]){

    Programmer p=new Programmer();
    System.out.println("Employee salary is:"+p.salary); //code-reusability
    System.out.println("bonus is:"+p.bonus);


} }
