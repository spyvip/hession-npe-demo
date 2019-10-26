package com.spy.test.dubbo.hessian.server;

import com.spy.test.dubbo.hessian.service.GreetingService;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingServiceImpl implements GreetingService {

    private static AtomicLong count = new AtomicLong();

    @Override
    public String sayHello() throws Exception {
        while (true) {
            System.out.println("--count=" + count.getAndIncrement());
            try {
                ((Object) null).getClass();
            } catch (Exception e) {
                if (e.getStackTrace().length == 0) {
                    System.out.println("##########yeah!!!!!!!!");
                    throw e;
                }
            }
        }
    }
}
