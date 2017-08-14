package cn.edu360_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {
	private static final ExecutorService THREADPOOL = Executors.newCachedThreadPool();

	public static void execute(Runnable command) {
		THREADPOOL.execute(command);
	}
}
