package com.helpme.help123.repository;

import com.helpme.help123.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmenRepo extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String departmentname);
    public Department findByDepartmentAddress(String departmentaddress);
    public Department findByDepartmentAddressIgnoreCase(String departmentaddress);
}
