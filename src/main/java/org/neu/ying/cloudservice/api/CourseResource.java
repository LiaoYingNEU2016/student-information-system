package org.neu.ying.cloudservice.api;

import org.neu.ying.cloudservice.object.Course;
import service.CoursesManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Ying on 1/31/18.
 */

@Path("courses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CourseResource {

    CoursesManager coursesManager = CoursesManager.getInstance();

    public CourseResource() throws Exception {
    }

    @GET
    public List<Course> getCourse() {
        return coursesManager.getAllCourses();
    }

    @GET
    @Path("{courseId}")
    public Course getCourse(@PathParam("courseId") String id) throws Exception {
        return coursesManager.getCourse(id);
    }

    @POST
    public Course addCourse(Course course) {
        return addCourse(course);
    }

    @PUT
    @Path("{courseId}")
    public Course updateCourse(@PathParam("courseId") String id, Course course) {
        course.setId(id);
        coursesManager.updateCourse(id, course);
        return course;
    }

    @DELETE
    @Path("{courseId}")
    public void removeCourse(@PathParam("courseId") String id) {
        coursesManager.removeCourse(id);
    }

}
