package com.example.StudentInfo.repository;

import com.example.StudentInfo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student,Integer> {
}
