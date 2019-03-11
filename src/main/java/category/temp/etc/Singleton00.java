package category.topinterviewquestions.etc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Basic pattern. (not thread safe)
 */
public class Singleton00 {
    private static Singleton00 singleton;
    private Singleton00() {
    }
    public static Singleton00 getInstance() {
        if (singleton == null) {
            singleton = new Singleton00();
        }
        return singleton;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        singletonThreadSafeTest();
    }

    public static void singletonThreadSafeTest() throws ExecutionException, InterruptedException {
        Callable<Singleton00> c = new Callable<Singleton00>() {
            @Override
            public Singleton00 call() throws Exception {
                return Singleton00.getInstance();
            }
        };
        ExecutorService ex = Executors.newFixedThreadPool(2);
        for(;;) {
            Future<Singleton00> f1 = ex.submit(c);
            Future<Singleton00> f2 = ex.submit(c);
            if (f1.get() != f2.get()) {
                System.out.println("Not Singleton instance.[instance1: "+f1.get().hashCode()+"],[instance1: "+f2.get().hashCode()+"]");
            } else {
//                System.out.println("Singleton instance.[instance1: "+f1.get().hashCode()+"],[instance1: "+f2.get().hashCode()+"]");
            }
            singleton = null;//reset
        }
    }
}
