package category.topinterviewquestions.etc;

import java.util.concurrent.ExecutionException;

/**
 * Enum pattern.(thread safe and lazy)
 */
public class Singleton01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        threadTest();//        RESULT↓
//        Here → Because of lazy.
//        Instance 1 hash: 807683689
//        Instance 2 hash: 807683689


    }
    public enum MySingleton {
        INSTANCE;
        private MySingleton() {
            System.out.println("Here");
        }
    }


    public static void threadTest() {
        //Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton instance1 = MySingleton.INSTANCE;
                System.out.println("Instance 1 hash: " + instance1.hashCode());
            }
        });

        //Thread 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton instance2 = MySingleton.INSTANCE;
                System.out.println("Instance 2 hash: " + instance2.hashCode());
            }
        });

        //start both the threads
        t1.start();
        t2.start();
    }
}
