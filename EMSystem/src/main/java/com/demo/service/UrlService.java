package com.demo.service;

import com.demo.dao.examinee.ExamineeDao;
import com.demo.entity.MyExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zrq on 2018-4-18.
 */
@Service
public class UrlService {
    @Autowired
    private ExamineeDao examineeDao;

    public MyExam findMyexamById(Integer id) {
        return examineeDao.findMyexamById(id);
    }
}
