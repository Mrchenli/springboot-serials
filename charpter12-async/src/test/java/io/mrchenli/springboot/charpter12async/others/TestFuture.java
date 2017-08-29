package io.mrchenli.springboot.charpter12async.others;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class TestFuture {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<String>> results = new ArrayList<>();
        ExecutorService es = Executors.newCachedThreadPool();
        IntStream.range(1,10).forEach(i->{
            results.add(es.submit(new CallableTask()));
        });
        for (Future<String> result : results){
            System.out.println(result.get());
        }
    }

}
