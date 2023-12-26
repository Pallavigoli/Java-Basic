    package MULTITHREADING.Example1;

    public class exampleAPP {
        public static void main(String[] args) {
            example e=new example();
            example e1=new example();
            e.setName("number");
            e1.setName("characeter");
            e.start();
            try 
            {
                e.join();
            }
            catch (Exception e2) 
            {
                e2.printStackTrace();
            }
            e1.start();
        }
    }
