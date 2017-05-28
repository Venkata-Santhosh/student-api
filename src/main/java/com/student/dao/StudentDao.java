package com.student.dao;

import com.student.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by VenkataSanthosh on 5/28/17.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Santhosh", "Computer Science"));
                put(2, new Student(2,"Satheesh", "IT"));
                put(3, new Student(3,"Pavan", "Computer Engineer"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }


}
