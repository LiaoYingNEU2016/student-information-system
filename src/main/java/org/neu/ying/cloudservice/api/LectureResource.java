package org.neu.ying.cloudservice.api;

import org.neu.ying.cloudservice.object.Lecture;
import org.neu.ying.cloudservice.service.LecturesManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Ying on 1/31/18.
 */

@Path("lectures")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LectureResource {

    LecturesManager lecturesManager = LecturesManager.getInstance();

    public LectureResource() throws Exception {
    }

    @GET
    public List<Lecture> getLecture() {
        return lecturesManager.getAllLectures();
    }

    @GET
    @Path("{lectureId}")
    public Lecture getLecture(@PathParam("lectureId") String id) throws Exception {
        return lecturesManager.getLecture(id);
    }

    @POST
    public Lecture addLecture(Lecture lecture) {
        return addLecture(lecture);
    }

    @PUT
    @Path("{lectureId}")
    public Lecture updateLecture(@PathParam("lectureId") String id, Lecture lecture) {
        lecture.setId(id);
        lecturesManager.updateLecture(id, lecture);
        return lecture;
    }

    @DELETE
    @Path("{lectureId}")
    public void removeLecture(@PathParam("lectureId") String id) {
        lecturesManager.removeLecture(id);
    }

}
