    package OOPS.ENCAPSULATION;

    // Problem 2: Create a class 'Person' with private properties 'name', 'age', and 'address'.
    // Provide public methods to set and get these properties.
    // Implement a method 'displayInfo' to display the person's information.

    class Person {
        // private properties: name, age, address
        private String name;
        private int age;
        private String address;

        // public constructor
        public Person(String name, int age,String address)
        {
            this.address=address;
            this.age=age;
            this.name=name;
        }
        // public methods to set and get properties
        public String getname(){
            return this.name;
        }
        public String getaddress(){
            return this.address;
        }
        public int getage(){
            return this.age;
        }
        // method: displayInfo
        public void displayInfo()
        {
            System.out.println(this.name+" "+this.address+" "+this.age);
        }
    }
    public class v{
        public static void main(String[] args) {
        Person p=new Person("pallavi", 21, "Armoor");
        System.out.println("======================================");
        System.out.println(p.getaddress());
        System.out.println("======================================");
        System.out.println(p.getage());
        System.out.println("======================================");
        System.out.println(p.getname());
        System.out.println("======================================");
        p.displayInfo();
        System.out.println("======================================");

    }
    }
