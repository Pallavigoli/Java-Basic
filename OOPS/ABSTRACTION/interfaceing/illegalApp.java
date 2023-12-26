package interfaceing;
public class illegalApp {
    
    public static void main(String[] args) {
        System.out.println("=======================");

        parent1 p=new child();
        parent2 p2=new child();
        p.father();
        p.ownMother();

        p2.Mother();
        p2.ownfather();
    }

}
