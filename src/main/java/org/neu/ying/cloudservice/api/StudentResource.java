package org.neu.ying.cloudservice.api;

import org.neu.ying.cloudservice.object.Student;
import service.StudentsManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Ying on 1/31/18.
 */

@Path("students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {

    StudentsManager studentsManager = StudentsManager.getInstance();

    public StudentResource() throws Exception {}

    @GET
    public List<Student> getStudent() {
        return studentsManager.getAllStudents();
    }

    @GET
    @Path("{studentId}")
    public Student getStudent(@PathParam("studentId") String id) throws Exception {
        return studentsManager.getStudent(id);
    }

    @POST
    public Student addStudent(Student student) {
        return studentsManager.addStudent(student);
    }

    @PUT
    @Path("{studentId}")
    public Student updateStudent(@PathParam("studentId") String id, Student student) {
        student.setId(id);
        studentsManager.updateStudent(id, student);
        return student;
    }

    @DELETE
    @Path("{studentId}")
    public void removeStudent(@PathParam("studentId") String id) {
        studentsManager.removeStudent(id);
    }

}
