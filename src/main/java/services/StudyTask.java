package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudyTask {

    private static final  Logger logger = LoggerFactory.getLogger(StudyTask.class);

    public void doBiz(){
        logger.debug("Its time to study again！");
    }
}
