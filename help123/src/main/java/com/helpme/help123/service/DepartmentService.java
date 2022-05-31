package com.helpme.help123.service;

import com.helpme.help123.entity.Department;

import java.util.List;

public interface DepartmentService {
    public default Department saveDepartment(Department department) {
        return department;
    }

    public List<Department> fdl();

    public Department fDI(Long departmentId);

    public void dDI(Long deptid);

    public Department uDI(Long depid, Department d);

    Department fDIN(String deptName);

    Department fDL(String location);
}
