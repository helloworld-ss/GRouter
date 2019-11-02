package com.geek.grouter;

import android.util.Log;

import com.geek.base.TestService;
import com.geek.grouter.annotation.Route;



@Route(path = "/main/service2")
public class TestServiceImpl2 implements TestService {


    @Override
    public void test() {
        Log.i("Service", "我是app模块测试服务通信2");
    }
}
