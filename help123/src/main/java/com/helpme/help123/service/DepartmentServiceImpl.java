package com.helpme.help123.service;

import com.helpme.help123.entity.Department;
import com.helpme.help123.repository.DepartmenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmenRepo dr;
    @Override
    public Department saveDepartment(Department department) {
        return dr.save(department);
    }

    @Override
    public List<Department> fdl() {
        return dr.findAll();
    }

    @Override
    public Department fDI(Long departmentId) {
        return dr.findById(departmentId).get();
    }

    @Override
    public void dDI(Long deptid) {
        dr.deleteById(deptid);
    }

    @Override
    public Department uDI(Long depid, Department d) {
        Department d1=dr.findById(depid).get();
        if(Objects.nonNull(d.getDepartmentName()) && !" ".equals(d.getDepartmentName())){
            d1.setDepartmentName(d.getDepartmentName());
        }


        if(Objects.nonNull(d.getDepartmentCode()) && !" ".equals(d.getDepartmentCode())){
            d1.setDepartmentCode(d.getDepartmentCode());
        }

        if(Objects.nonNull(d.getDepartmentAddress()) && !" ".equals(d.getDepartmentAddress())){
            d1.setDepartmentAddress(d.getDepartmentAddress());
        }
        return dr.save(d1);
    }

    @Override
    public Department fDIN(String deptName) {
        return dr.findByDepartmentName(deptName);
    }

    @Override
    public Department fDL(String location) {
        return dr.findByDepartmentAddressIgnoreCase(location);
    }

}
