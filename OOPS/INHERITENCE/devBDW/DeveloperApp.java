package OOPS.INHERITENCE.devBDW;
public class DeveloperApp {
    public static void doActivity(Developer d)
    {
        
        d.attendMeeting(); //inherited method

        
        d.project(); //overridden method

        //child specific method
        if(d instanceof BackEndDeveloper)
        {
            ((BackEndDeveloper)d).learnJava();//downcasting
        }
        else if(d instanceof DataBaseDeveloper){
            ((DataBaseDeveloper)d).learnSQl();
        }
        else
        {
            ((WebDeveloper)d).learnHtml();
        }
    }
public static void main(String[] args) {
        
        BackEndDeveloper b=new BackEndDeveloper();
        DataBaseDeveloper d=new DataBaseDeveloper();
        WebDeveloper w=new WebDeveloper();
        //s.attendMeeting();
        System.out.println("===================================");
        doActivity(b);
        System.out.println("===================================");
        doActivity(d);
        System.out.println("===================================");
        doActivity(w);
        
    }
}

