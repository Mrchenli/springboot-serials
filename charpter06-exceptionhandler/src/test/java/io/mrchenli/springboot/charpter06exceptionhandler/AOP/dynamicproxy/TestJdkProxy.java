package io.mrchenli.springboot.charpter06exceptionhandler.AOP.dynamicproxy;

public class TestJdkProxy {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.add();
    }

}
