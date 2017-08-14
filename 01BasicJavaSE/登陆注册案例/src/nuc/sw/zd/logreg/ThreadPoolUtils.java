package nuc.sw.zd.logreg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {
	//采用线程池
    private static final ExecutorService THREADPOOL=Executors.newCachedThreadPool(); 
    public   static void exxcute(Runnable runnable){ 	
    	THREADPOOL.execute(runnable);
    }
}
