package org.neu.ying.cloudservice.object;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Ying on 2/16/18.
 */
public class Student {

    private static int count = 1;
    private String id;
    private String name;
    private String address;
    private String image;
    private Set<Course> courses;
    private Program program;

    public Student() {
        setId(String.valueOf(count++));
        this.courses = new HashSet<>();
    }

    public Student(String name) {
        setName(name);
        setId(String.valueOf(count++));
        this.courses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getCourses() {
        List<String> courseNames = new LinkedList<>();
        for (Course c : courses) courseNames.add(c.getId());
        return courseNames;
    }

    public void addCourses(Course course) {
        this.courses.add(course);
    }

    public void removeCourses(Course course) {
        this.courses.remove(course);
    }

    public String getProgram() {
        return program.getName();
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    enum Gender {
        MALE, FEMALE, OTHER, UNKNOWN;
    }

}
