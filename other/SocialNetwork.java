package other;
import java.util.Scanner;

class User
{
    String name;
    int age;
    User(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void displayInfo()
    {
        System.out.println("User "+name+" ,Age "+age);
    }
}
class Friend extends User
{

    Friend(String name, int age) {
        super(name, age);
    }
    void manageFriend()
    {
        System.out.println(name+" is your friends");
    }
    
}
class Follower extends User
{
    Follower(String name,int age)
    {
        super(name, age);
    }
    void manageFollower()
    {
        System.out.println(name+" is your Followers");
        
    }
}
public class SocialNetwork {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the in");
        int in=scan.nextInt();
        if(in==1)
        {
            System.out.println("name:");
            scan.nextLine();
            String name=scan.nextLine();
            System.out.println("age");
            int age=scan.nextInt();
            Friend f=new Friend(name, age);
            System.out.println("Friend Information: ");
            f.displayInfo();
            f.manageFriend();
        }
        if(in==2)
        {
            System.out.println("name:");
            scan.nextLine();
            String name=scan.nextLine();
            System.out.println("age");
            int age=scan.nextInt();
            Follower f=new Follower(name, age);
            System.out.println("Follower Information: ");
            f.displayInfo();
            f.manageFollower();
    }
    scan.close();
}
}
