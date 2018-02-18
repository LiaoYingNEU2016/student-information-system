package org.neu.ying.cloudservice.object;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ying on 2/16/18.
 */
public class Program {

    private Set<Course> courses;
    private Set<Student> students;
    private String name;

    public Program() {

    }

    public Program(String name) {
        this.name = name;
        this.courses = new HashSet<>();
        this.students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }


}
