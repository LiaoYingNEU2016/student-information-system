package org.neu.ying.cloudservice.service;

import org.neu.ying.cloudservice.io.BaseData;
import org.neu.ying.cloudservice.object.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ying on 2/16/18.
 */
public class StudentsManager {

    private Map<String, Student> map;
    private static StudentsManager instance = null;

    protected StudentsManager() throws Exception {
        BaseData baseData = BaseData.getInstance();
        map = baseData.getStudentsData();
    }

    public static StudentsManager getInstance() throws Exception {
        if(instance == null) {
            instance = new StudentsManager();
        }
        return instance;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(map.values());
    }

    public Student getStudent(String id) throws Exception {
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            throw new Exception("No such student id");
        }
    }

    public Student addStudent(Student student) {
        map.put(student.getId(), student);
        return student;
    }

    public void removeStudent(String id) {
        map.remove(id);
    }

    public void updateStudent(String id, Student student) {
        map.put(id, student);
    }

}
