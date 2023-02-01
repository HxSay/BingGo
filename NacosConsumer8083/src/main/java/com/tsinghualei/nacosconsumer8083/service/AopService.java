package com.tsinghualei.nacosconsumer8083.service;

import com.tsinghualei.nacosconsumer8083.aoptest.AnnotationTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class AopService {

    @AnnotationTest
    public void aopTest(Long[] ids){
        System.out.println(Arrays.toString(ids));
    }
}
