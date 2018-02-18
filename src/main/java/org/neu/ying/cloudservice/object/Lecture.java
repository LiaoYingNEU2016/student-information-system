package org.neu.ying.cloudservice.object;

import java.util.List;

/**
 * Created by Ying on 2/16/18.
 */
public class Lecture {

    private static int count = 1;
    private String id;
    private Course course;
    private String material;
    private List<String> notes;

    public Lecture() {
        setId(String.valueOf(count++));
    }

    public Lecture(Course course, String material) {
        setId(String.valueOf(count++));
        this.setCourse(course);
        this.setMaterial(material);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }




}
