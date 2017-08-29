package io.mrchenli.springboot.charpter12async.others;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestRunnable {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        IntStream.range(1,10).forEach(i->{
            es.submit(new RunnableTask());
        });
        Thread.sleep(10000)
        ;
        System.out.println("------");
    }
}

