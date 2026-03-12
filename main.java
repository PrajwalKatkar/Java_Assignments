// 1.Create a class called Person with name (String) and age (int) attributes. Implement
// a constructor to set these attributes upon object creation. Create two Person objects,
// set their details, and print them.

class Person{
    String name;
    int age;
    Person(String name , int age){
        this.name=name;
        this.age=age;
    }
}
public class main{
    public static void main(String [] args){
        Person p1 = new Person("Prajwal",20);
        Person p2 = new Person("Katkar",19);
        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
    
    }
}
