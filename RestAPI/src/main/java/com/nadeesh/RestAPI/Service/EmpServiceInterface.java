package com.nadeesh.RestAPI.Service;

import com.nadeesh.RestAPI.Dto.EmpDto;

public interface EmpServiceInterface {
    EmpDto createEmployee(EmpDto empDto);

    EmpDto getEmployeeById(Long empId);
}
