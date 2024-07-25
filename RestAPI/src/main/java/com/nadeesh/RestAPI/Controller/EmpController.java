package com.nadeesh.RestAPI.Controller;

import com.nadeesh.RestAPI.Service.EmpService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin("*")
public class EmpController {
   private EmpService empService;


}
