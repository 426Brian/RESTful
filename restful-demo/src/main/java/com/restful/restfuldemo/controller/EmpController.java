package com.restful.restfuldemo.controller;

import com.restful.restfuldemo.entity.Emp;
import com.restful.restfuldemo.service.EmpService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    private static final Log log = (Log) LogFactory.getLog(EmpController.class);

    @Autowired
    private EmpService empService;

    @GetMapping("/allEmp")
    public List<Emp> getAll() {
        if (log.isTraceEnabled()) {
            log.trace("getAll ---> ");
        }

        List<Emp> list =  empService.getAllEmp();
        return list;
    }
}
