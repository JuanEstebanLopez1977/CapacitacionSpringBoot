package com.bgba;

import java.util.Date;
import java.util.List;
 
import com.bgba.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
 
public interface EmployeeRepository extends MongoRepository<Employee, Long> { 
	 
    Employee findByEmpNo(String empNo);
 
    List<Employee> findByFullNameLike(String fullName);
 
    List<Employee> findByHireDateGreaterThan(Date hireDate);
 
    @Query("{fullName:'?0'}")
    List<Employee> findCustomByFullName(String fullName);
 
}