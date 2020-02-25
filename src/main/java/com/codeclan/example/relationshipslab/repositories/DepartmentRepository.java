package com.codeclan.example.relationshipslab.repositories;

import com.codeclan.example.relationshipslab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
