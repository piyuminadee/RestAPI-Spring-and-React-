//THIS CLASS USED TO MAP DTO AND ENTITY EXACH OTHER

package com.nadeesh.RestAPI.Mapper;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Entity.Employee;

public class EmpDtoMap {

    //MAP DTO TO ENTITY
   public static EmpDto maptoEmpDto(Employee employee){
       return new EmpDto(
               employee.getId(),
               employee.getFirstName(),
               employee.getLastName(),
               employee.getEmail()

       );
   }

    //MAP ENTITY TO DTO

    public static Employee maptoEmp(EmpDto empDto){
        return new Employee(
                empDto.getId(),
                empDto.getFirstName(),
                empDto.getLastName(),
                empDto.getEmail()

        );
    }

}
