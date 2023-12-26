    package MULTITHREADING.Example1;
    public class example extends Thread {
        public void run()
        {
            if(getName().equals("number"))
            {
                Number();
                
            }
            else
            {
                characeter();
            }
        }
        public static void Number()
        {
            for (int i = 0; i <=5; i++) 
            {
                System.err.println(i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        public static void characeter()
        {
            for (char i = 'A'; i <='E'; i++) 
            {
                System.err.println(i);
                try
                {
                    Thread.sleep(3000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
