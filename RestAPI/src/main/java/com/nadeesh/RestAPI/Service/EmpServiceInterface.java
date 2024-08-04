package com.nadeesh.RestAPI.Service;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Entity.Employee;

import java.util.List;

public interface EmpServiceInterface {
    EmpDto createEmployee(EmpDto empDto);

    EmpDto getEmployeeById(Long empId);

    List<EmpDto> allEmp();

    EmpDto updateEmpById(Long id ,EmpDto empDto);

    EmpDto deletEmpById(Long id);
}
