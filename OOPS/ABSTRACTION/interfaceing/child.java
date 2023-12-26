package interfaceing;

public class child implements parent1,parent2 {

    @Override
    public void Mother() {
        System.out.println("parent2 not own mother");
    }

    @Override
    public void ownfather() {
        System.out.println("own father");
    }

    @Override
    public void ownMother() {
        System.out.println("own mother");
        }

    @Override
    public void father() {
        System.out.println("parent1 not own father");
       }
    
}
