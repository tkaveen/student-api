package com.example.studentapi;
import java.util.HashMap;
import java.util.Map;

public class InmemoryStudentRepository implements StudentRepository{
    
    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student){
        // save this student in the DB
        database.put(student.id, student);
        System.out.println("Student saved in the DB");

    }

    @Override
    public Student get(String id){
        return database.get(id);
    }

}