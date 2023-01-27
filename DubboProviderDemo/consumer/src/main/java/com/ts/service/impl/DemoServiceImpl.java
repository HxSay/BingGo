package com.ts.service.impl;

import com.ts.dubbo.service.DemoDubboService;
import com.ts.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Reference
    private DemoDubboService demoDubboService;

    @Override
    public String demo() {
        return demoDubboService.demo("tsinghua lei");
    }
}
