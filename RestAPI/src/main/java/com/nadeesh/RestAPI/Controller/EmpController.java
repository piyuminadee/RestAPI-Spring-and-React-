package com.nadeesh.RestAPI.Controller;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Entity.Employee;
import com.nadeesh.RestAPI.Service.EmpService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")

public class EmpController {
   @Autowired
   private EmpService empService;

   //BUILD ADD EMP METHOD
   @PostMapping
   public ResponseEntity<EmpDto> createEmp(@RequestBody EmpDto empDto){
      EmpDto savedEmp = empService.createEmployee(empDto);
      return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
   }   //RESPONSE ENTITY IS RETURN TYPE(type is EmpDto)


   //BUILD GET EMP METHOD
   @GetMapping("{id}")
   public ResponseEntity<EmpDto> getEmpById(@PathVariable("id") Long empId){
     EmpDto empDto = empService.getEmployeeById(empId);
     return ResponseEntity.ok(empDto);
   }


   //BUILD GET ALL EMP METHOD

   @GetMapping
   public ResponseEntity<List<EmpDto>> getAllEmp(){
      List<EmpDto> em =   empService.allEmp();
       return ResponseEntity.ok(em);
   }
}
