package com.example.shankz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shankz.employee.Employee;

public interface EmpoRepo extends JpaRepository<Employee, Integer> {

}
