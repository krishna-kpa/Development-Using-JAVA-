package org.example;

/**
 * Hello world!
 *
 */

import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootDemo
{
    public static void main( String[] args )
    {
        ApplicationContext context  = SpringApplication.run(SpringBootDemo.class,args);

        StudentService studentService = context.getBean(StudentService.class);
        Student student = context.getBean(Student.class);
        student.setMark(24);
        student.setName("rajesh");
        student.setRollNo(4);
        studentService.addStudent(student);

        List<Student> students = studentService.getStudent();
        System.out.println(students);

    }
}
