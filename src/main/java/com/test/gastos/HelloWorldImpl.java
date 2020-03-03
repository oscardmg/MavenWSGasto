
package com.test.gastos;

import javax.jws.WebService;

@WebService(endpointInterface = "com.test.gastos.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

