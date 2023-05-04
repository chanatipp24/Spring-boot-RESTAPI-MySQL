package com.chanatipcodes.studentsystem.service;

import com.chanatipcodes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
