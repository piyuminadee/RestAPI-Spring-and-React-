package com.nadeesh.RestAPI.Service;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Entity.Employee;
import com.nadeesh.RestAPI.Exception.ResourceNotFountException;
import com.nadeesh.RestAPI.Mapper.EmpDtoMap;
import com.nadeesh.RestAPI.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpService implements EmpServiceInterface{

    @Autowired
    private EmpRepository empRepository;
    @Override
    public EmpDto createEmployee(EmpDto empDto) {
        Employee employee = EmpDtoMap.maptoEmp(empDto);  // HERE CONVERT EMPLOYEEDTO TO EMPLOYEEJPA
        Employee savedEmp = empRepository.save(employee); //SAVE THIS ENTITY IN DB(THIS IN JPA ENTITY)
        //WANT TO RETURN SAVED EMPLOYEE BACK TO THE CLIENT. TO DO THIS WANT TO CONVER JPAENTITY AS DTO
        return EmpDtoMap.maptoEmpDto(savedEmp);
    }

    @Override
    public EmpDto getEmployeeById(Long empId) {
        Employee employee = empRepository.findById(empId)
                .orElseThrow(()->
                        new ResourceNotFountException("Employee is not exists with given id "+ empId));
        return EmpDtoMap.maptoEmpDto(employee);  //map employeejpa to Dto obeject
    }

    @Override
    public List<EmpDto> allEmp() {
        List<Employee> emps =  empRepository.findAll();
        return emps.stream().map((employee) -> EmpDtoMap.maptoEmpDto(employee))
                .collect(Collectors.toList());
    }
}
