package com.nadeesh.RestAPI.Controller;

import com.nadeesh.RestAPI.Dto.EmpDto;
import com.nadeesh.RestAPI.Service.EmpService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")

public class EmpController {
   @Autowired
   private EmpService empService;

   @PostMapping
   public ResponseEntity<EmpDto> createEmp(@RequestBody EmpDto empDto){
      EmpDto savedEmp = empService.createEmployee(empDto);
      return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
   }



}
