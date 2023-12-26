package OOPS.INHERITENCE;
// Problem 1: Create a base class called 'Vehicle' with properties 'brand' and 'year'.
// Derive two classes 'Car' and 'Motorcycle' from 'Vehicle' with an additional property 'model'.
// Implement a method 'displayDetails' in each class to print the details of the vehicle.

class Vehicle {
    // properties: brand, year
    String brand;
    int year;
    // constructor
    Vehicle(String brand, int year)
    {
        this.brand=brand;
        this.year=year;
    }
    
    // method: displayDetails
    void displayDetails()
    {
        System.out.println(brand+" "+year);
    }
}

class Car extends Vehicle {
    String model;
    // constructor
    Car(String brand, int year,String model)
    {
        super(brand, year);
        this.model=model;
    }
    
    // method: displayDetails
    void displayDetails()
    {
        System.out.println(brand+" "+year+" "+model);
    }
}

class Motorcycle extends Vehicle {
    String model;
    // constructor
    Motorcycle(String brand, int year,String model)
    {
        super(brand, year);
        this.model=model;
    }
    
    // method: displayDetails
    void displayDetails()
    {
        System.out.println(brand+" "+year+" "+model);
    }
}
public class v
{
    public static void main(String[] args) {
        Vehicle c=new Car("maruti", 2023, "yu");
        Vehicle m=new Motorcycle("brezze", 2024, "zxi");
        Vehicle v=new Vehicle("car", 0);
        c.displayDetails();
        m.displayDetails();
        v.displayDetails();


    }
}
