package com.nadeesh.RestAPI.Service;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Entity.Employee;
import com.nadeesh.RestAPI.Mapper.EmpDtoMap;
import com.nadeesh.RestAPI.Repository.EmpRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements EmpServiceInterface{

    private EmpRepository empRepository;
    @Override
    public EmpDto createEmployee(EmpDto empDto) {
        Employee employee = EmpDtoMap.maptoEmp(empDto);  // HERE CONVERT EMPLOYEEDTO TO EMPLOYEEJPA
        Employee savedEmp = empRepository.save(employee); //SAVE THIS ENTITY IN DB(THIS IN JPA ENTITY)
        //WANT TO RETURN SAVED EMPLOYEE BACK TO THE CLIENT. TO DO THIS WANT TO CONVER JPAENTITY AS DTO
        return EmpDtoMap.maptoEmpDto(savedEmp);
    }
}
