package com.ts.dubbo.service.impl;

import com.ts.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoDubboServiceImpl implements DemoDubboService {
    @Override
    public String demo(String param) {
        System.out.println("executing demo ...");
        return param+"123";
    }
}
