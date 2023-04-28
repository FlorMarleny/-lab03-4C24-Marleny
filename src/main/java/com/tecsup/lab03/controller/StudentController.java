package com.tecsup.lab03.controller;
import java.util.ArrayList;
import java.util.List;
import com.tecsup.lab03.model.Student;
public class StudentController {
	
	private List<Student> students;

    public StudentController() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void updateStudent(Student student) {
        int index = students.indexOf(student);
        students.set(index, student);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
