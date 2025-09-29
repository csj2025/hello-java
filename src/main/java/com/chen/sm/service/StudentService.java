package com.chen.sm.service;

import com.chen.sm.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();
    public boolean add(Student s){
        if(s ==null && s.getId() ==null){
            return false;
        }
        if(this.getById(s.getId())!=null){//判断是否已经存在
            return false;
        }
        return students.add(s);
    }
    public boolean remove(String id){
        Student s = this.getById(id);
        return s != null && students.remove(s);
    }
    public boolean update(String id,String name,Integer age,Double score){
        Student s = this.getById(id);
        if(s==null){
            return false;
        }
        if(name !=null){
            s.setName(name);
        }
        if(age !=null){
            s.setAge(age);
        }
        if(score !=null){
            s.setScore(score);
        }
        return true;
    }
    public Student getById(String id){
        for(Student s:students){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }
    public List<Student> listAll() { return Collections.unmodifiableList(students); }
}
