package com.ts.webdemov2;

import com.luhuiguo.fastdfs.domain.StorePath;
import com.luhuiguo.fastdfs.service.FastFileStorageClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
public class FastDFSClientSpringBootDemoApplicationTest {
    @Autowired
    private FastFileStorageClient fastFileStorageClient;
    @Test
    void contextLoads() throws FileNotFoundException {
        File file = new File("/Users/leiqinghua/Downloads/dog.jpg");
        StorePath path = fastFileStorageClient.uploadFile("",new FileInputStream(file),file.length(),"jpg");
        System.out.println(path.getFullPath());
    }
}
