package service;


import org.neu.ying.cloudservice.io.BaseData;
import org.neu.ying.cloudservice.object.Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ying on 2/17/18.
 */
public class LecturesManager {

    private Map<String, Lecture> map;

    private static LecturesManager instance = null;

    protected LecturesManager() throws Exception {
        BaseData baseData = BaseData.getInstance();
        map = baseData.getLectureData();
    }

    public static LecturesManager getInstance() throws Exception {
        if(instance == null) {
            instance = new LecturesManager();
        }
        return instance;
    }

    public Lecture getLecture(String id) throws Exception {
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            throw new Exception("No such lecture id");
        }
    }

    public Lecture addLecture(Lecture lecture) {
        map.put(lecture.getId(), lecture);
        return lecture;
    }

    public void removeLecture(String id) {
        map.remove(id);
    }

    public void updateLecture(String id, Lecture lecture) {
        map.put(id, lecture);
    }

    public List<Lecture> getAllLectures() {
        return new ArrayList<>(map.values());
    }

}
