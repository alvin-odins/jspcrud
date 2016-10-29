package com.student.dao;

import com.dto.Student;

import java.util.List;

/**
 * Created by AlvinOdins on 10/28/2016.
 */
public interface IStudentDao {

    public boolean addStudent(Student student);
    public List<Student> getAllStudents();
}
