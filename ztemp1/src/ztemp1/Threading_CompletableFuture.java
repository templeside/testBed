package ztemp1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Threading_CompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
    	//example
//    	CompletableFuture<String> completableFuture = new CompletableFuture<String>();
//        String result = completableFuture.get();
//        completableFuture.complete("Future's result");
//    	System.out.println(result);
    	// Run a task specified by a Runnable Object asynchronously.
    	
//		//runAsync - async run, no return
//    	CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
//    	    @Override
//    	    public void run() {
//    	        // Simulate a long-running Job
//    	        try {
//    	            TimeUnit.SECONDS.sleep(1);
//    	        } catch (InterruptedException e) {
//    	            throw new IllegalStateException(e);
//    	        }
//    	        System.out.println("I'll run in a separate thread than the main thread.");
//    	    }
//    	});
//
//    	// Block and wait for the future to complete
//    	future.get();

    	CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
    	    @Override
    	    public String get() {
    	        try {
    	            TimeUnit.SECONDS.sleep(1);
    	        } catch (InterruptedException e) {
    	            throw new IllegalStateException(e);
    	        }
    	        return "Result of the asynchronous computation";
    	    }
    	});

    	// Block and get the result of the Future
    	String result = future.get();
    	System.out.println(result);
	}

}
