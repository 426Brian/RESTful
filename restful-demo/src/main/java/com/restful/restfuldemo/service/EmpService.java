package com.restful.restfuldemo.service;

import com.restful.restfuldemo.entity.Emp;
import com.restful.restfuldemo.entity.EmpExample;
import com.restful.restfuldemo.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> getAllEmp(){
        return empMapper.selectByExample(new EmpExample());
    }
}
