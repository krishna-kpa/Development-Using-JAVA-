package org.example.service;

import org.example.model.Student;
import org.example.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter of repo called in service");
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository(){
        return this.studentRepository;
    }

    public void addStudent(Student student){
        System.out.println("Student at service !");
        this.studentRepository.save(student);
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
}
