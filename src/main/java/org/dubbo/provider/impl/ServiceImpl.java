package org.dubbo.provider.impl;

import org.dubbo.provider.Service;

public class ServiceImpl implements Service {
    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }
}
