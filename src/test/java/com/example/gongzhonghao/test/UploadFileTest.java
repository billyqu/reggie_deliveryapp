package com.example.gongzhonghao.test;

import org.junit.jupiter.api.Test;

public class UploadFileTest {
    @Test
    public void test(){
        String filename = "sdadsa.jpg";
        String suffix = filename.substring(filename.lastIndexOf("."));
        System.out.println(suffix);
    }
}
