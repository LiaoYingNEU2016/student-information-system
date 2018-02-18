package org.neu.ying.cloudservice.object;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ying on 2/16/18.
 */
public class Course {

    private Set<Lecture> lectures;
    private String board;
    private Set<Student> roster;
    private String id;

    public Course() {}

    public Course(String id) {
        this.id = id;
        this.roster = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public Set<Student> getRoster() {
        return roster;
    }

    public void setRoster(Set<Student> roster) {
        this.roster = roster;
    }



}
