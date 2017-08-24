package io.mrchenli.springboot.charpter06exceptionhandler.AOP.dynamicproxy;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("----add-----");
    }
}
