package org.neu.ying.cloudservice.service;

import org.neu.ying.cloudservice.io.BaseData;
import org.neu.ying.cloudservice.object.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ying on 2/17/18.
 */
public class CoursesManager {
    private Map<String, Course> map;

    private static CoursesManager instance = null;

    protected CoursesManager() throws Exception {
        BaseData baseData = BaseData.getInstance();
        map = baseData.getCoursesData();
    }

    public static CoursesManager getInstance() throws Exception {
        if(instance == null) {
            instance = new CoursesManager();
        }
        return instance;
    }

    public Course getCourse(String id) throws Exception {
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            throw new Exception("No such course id");
        }
    }

    public Course addCourse(Course course) {
        map.put(course.getId(), course);
        return course;
    }

    public void removeCourse(String id) {
        map.remove(id);
    }

    public void updateCourse(String id, Course course) {
        map.put(id, course);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(map.values());
    }

}
