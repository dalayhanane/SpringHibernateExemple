package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.EmployeeDao;


@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	
}
