package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * Add new employee
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * Employee Page Query
     * @param employeePageQueryDTO
     * @return PageResult
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * Employee status change
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * Get employee info by Id
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * Edit employee info
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
