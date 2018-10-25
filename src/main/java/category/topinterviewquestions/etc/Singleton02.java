package category.topinterviewquestions.etc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Bill Pugh Singleton pattern(thread safe and lazy)
 */
public class Singleton02 {
    private Singleton02() {
        System.out.println("Here");
    }

    // static inner class - inner classes are not loaded until they are referenced.
    private static class Singleton03Holder {
        private static Singleton02 logger = new Singleton02();
    }
    // global access point
    public static Singleton02 getInstance() {
        return Singleton03Holder.logger;
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println("instance1 hash: "+instance1.hashCode());
        System.out.println("instance2 hash: "+instance2.hashCode());// RESULT ↓
//        Here → Because of lazy
//        instance1 hash: 401424608
//        instance2 hash: 401424608


//        singletonThreadSafeTest();
    }

    public static void singletonThreadSafeTest() throws ExecutionException, InterruptedException {
        Callable<Singleton02> c = new Callable<Singleton02>() {
            @Override
            public Singleton02 call() throws Exception {
                return Singleton02.getInstance();
            }
        };
        ExecutorService ex = Executors.newFixedThreadPool(2);
        for(;;) {
            Future<Singleton02> f1 = ex.submit(c);
            Future<Singleton02> f2 = ex.submit(c);
            if (f1.get() != f2.get()) {
                System.out.println("Not Singleton instance.[instance1: "+f1.get().hashCode()+"],[instance1: "+f2.get().hashCode()+"]");
            } else {
//                System.out.println("Singleton instance.[instance1: "+f1.get().hashCode()+"],[instance1: "+f2.get().hashCode()+"]");
            }
            Singleton03Holder.logger = null;//reset
        }
    }

}
