package com.helpme.help123.cont123;

import com.helpme.help123.entity.Department;
import com.helpme.help123.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Deptcont {
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER= LoggerFactory.getLogger(Deptcont.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside save dept of");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside get dept of");
        return departmentService.fdl();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDeptId(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside getbyid dept of");
        return departmentService.fDI(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDeptId(@PathVariable("id") Long deptid){
        departmentService.dDI(deptid);
        LOGGER.info("Inside delete dept of");
        return "deleted";
    }

    @PutMapping("/departments/{id}")
    public Department upd8Dept(@PathVariable("id") Long depid, @RequestBody Department d){
        LOGGER.info("Inside update dept of");
        return departmentService.uDI(depid,d);
    }

    @GetMapping("/departments/name/{name}")
    public Department findDeptByName(@PathVariable("name") String deptName){
        LOGGER.info("Inside find by name of dept of");
        return departmentService.fDIN(deptName);
    }
    @GetMapping("/departments/location/{location}")
    public Department fetchDeptByLoc(@PathVariable("location") String locat){
        LOGGER.info("Inside fetch by location dept of");
        return departmentService.fDL(locat);
    }

}
