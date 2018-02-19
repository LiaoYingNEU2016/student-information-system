package org.neu.ying.cloudservice.service;


import org.neu.ying.cloudservice.io.BaseData;
import org.neu.ying.cloudservice.object.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ying on 2/16/18.
 */
public class ProgramManager {
    private Map<String, Program> map;

    private static ProgramManager instance = null;

    protected ProgramManager() throws Exception {
        BaseData baseData = BaseData.getInstance();
        map = baseData.getProgramsData();
    }

    public static ProgramManager getInstance() throws Exception {
        if(instance == null) {
            instance = new ProgramManager();
        }
        return instance;
    }

    public Program getProgram(String name) throws Exception {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            throw new Exception("No such program name");
        }
    }

    public Program addProgram(Program program) {
        map.put(program.getName(), program);
        return program;
    }

    public void removeProgram(String name) {
        map.remove(name);
    }

    public void updateProgram(String name, Program program) {
        map.put(name, program);
    }

    public List<Program> getAllPrograms() {
        return new ArrayList<>(map.values());
    }
}
