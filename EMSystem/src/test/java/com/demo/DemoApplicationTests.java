package com.demo;

import com.demo.service.admin.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private AdminService adminService;
    @Test
    public void contextLoads() {
//		int i=adminService.batchCreateExamNum(1);
//		System.out.println("test:"+i);
//		System.out.println("changeString:"+ StringUtil.changeToString(100));
    }

}