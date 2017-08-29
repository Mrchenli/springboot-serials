package io.mrchenli.springboot.charpter12async.others;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("ah");
        return "something";
    }
}
