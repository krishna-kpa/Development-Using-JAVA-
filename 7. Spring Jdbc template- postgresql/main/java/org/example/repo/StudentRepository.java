package org.example.repo;

import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    public void setJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }




    public void save(Student student){
        String sql = "insert into student(roll_no,name,mark) values(?,?,?)";
        int rows = jdbc.update(sql,student.getRollNo(),student.getName(),student.getMark());
        System.out.println(rows + " no of rows affected");
    }

    public List<Student> findAll(){
        String query = "select * from student";
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setRollNo(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setMark(rs.getInt(3));
                return student;
            }
        };
        return jdbc.query(query,rowMapper);
    }
}
