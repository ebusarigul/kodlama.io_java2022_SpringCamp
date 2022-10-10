package Day3_Homeworks.Homework_3.business;

import Day3_Homeworks.Homework_3.dataAccess.BasicDao;
import Day3_Homeworks.Homework_3.entities.Instructor;
import Day3_Homeworks.Homework_3.logging.Logger;

import java.util.List;

public class InstructorManager {

    private BasicDao basicDao;
    private List<Logger> loggers;

    public InstructorManager(BasicDao basicDao, List<Logger> loggers) {
        this.basicDao = basicDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){

        basicDao.addIntructor(instructor);

        for (Logger logger : loggers){
            logger.log(instructor.getInstructorName()+" "+instructor.getInstructorLastName());
        }
    }
}
