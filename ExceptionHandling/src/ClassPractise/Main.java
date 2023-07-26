package ClassPractise;

public class Main {
	   public static void main(String[] args) {
	      MyThread myThread = new MyThread();
	      myThread.start();

	      for (int i = 0; i < 10; i++) {
	         System.out.println("Main Thread Running " + i);
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	}

//Note that the order in which the messages are printed may change 
//each time the program is run, as the two threads run concurrently 
//and can interleave their execution in different ways.