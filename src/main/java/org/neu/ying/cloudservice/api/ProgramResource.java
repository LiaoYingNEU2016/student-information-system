package org.neu.ying.cloudservice.api;

import org.neu.ying.cloudservice.object.Program;
import org.neu.ying.cloudservice.service.ProgramManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Ying on 1/31/18.
 */

@Path("programs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProgramResource {

    ProgramManager programManager = ProgramManager.getInstance();

    public ProgramResource() throws Exception {
    }

    @GET
    public List<Program> getProgram() {
        return programManager.getAllPrograms();
    }

    @GET
    @Path("{programId}")
    public Program getProgram(@PathParam("programId") String id) throws Exception {
        return programManager.getProgram(id);
    }

    @POST
    public Program addProgram(Program program) {
        return addProgram(program);
    }

    @PUT
    @Path("{programId}")
    public Program updateProgram(@PathParam("programId") String name, Program program) {
        program.setName(name);
        programManager.updateProgram(name, program);
        return program;
    }

    @DELETE
    @Path("{programId}")
    public void removeProgram(@PathParam("programId") String id) {
        programManager.removeProgram(id);
    }

}
