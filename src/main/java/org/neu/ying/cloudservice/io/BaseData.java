package org.neu.ying.cloudservice.io;

import org.neu.ying.cloudservice.object.*;
import service.ProgramManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ying on 2/17/18.
 */
public class BaseData {

    private static BaseData instance = null;
    private static Map<String, Student> studentData = new HashMap<>();
    private static Map<String, Program> programData = new HashMap<>();
    private static Map<String, Course> courseData = new HashMap<>();
    private static Map<String, Lecture> lectureData = new HashMap<>();

    protected BaseData() throws Exception {
        Student ruby = new Student("Ruby");
        studentData.put(ruby.getId(), ruby);
        Student alice = new Student("Alice");
        studentData.put(alice.getId(), alice);
        Student bob = new Student("Bob");
        studentData.put(bob.getId(), bob);
        Program is = new Program("Inoformation System");
        programData.put(is.getName(), is);
        Program cs = new Program("Computer Science");
        programData.put(cs.getName(), cs);
        ruby.setProgram(programData.get("Inoformation System"));
        alice.setProgram(programData.get("Computer Science"));
        bob.setProgram(programData.get("Computer Science"));
        Course info = new Course("INFO 5100");
        courseData.put(info.getId(), info);
        Course encp = new Course("ENCP 6000");
        courseData.put(encp.getId(), encp);
        Lecture info_1 = new Lecture(info, "Introduction");
        Lecture info_2 = new Lecture(info, "Web history");
        Lecture encp_1 = new Lecture(encp, "Hello");
        cs.addCourse(encp);
        is.addCourse(info);
        cs.addStudent(alice);
        cs.addStudent(bob);
        is.addStudent(ruby);
        lectureData.put(info_1.getId(), info_1);
        lectureData.put(info_2.getId(), info_2);
        lectureData.put(encp_1.getId(), info_2);
        info.getRoster().add(alice);
        alice.addCourses(info);
        encp.getRoster().add(bob);
        bob.addCourses(encp);
    }

    public static BaseData getInstance() throws Exception {
        if(instance == null) {
            instance = new BaseData();
        }
        return instance;
    }

    public Map<String, Student> getStudentsData() {
        return studentData;
    }

    public Map<String, Program> getProgramsData() {
        return programData;
    }

    public Map<String, Course> getCoursesData() {
        return courseData;
    }

    public Map<String, Lecture> getLectureData() {
        return lectureData;
    }

}
