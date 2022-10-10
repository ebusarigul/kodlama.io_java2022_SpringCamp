package Day3_Homeworks.Homework_3.business;

import Day3_Homeworks.Homework_3.dataAccess.BasicDao;
import Day3_Homeworks.Homework_3.entities.Course;
import Day3_Homeworks.Homework_3.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private BasicDao basicDao;
    private List<Logger> loggers;

    public CourseManager(BasicDao basicDao, List<Logger> loggers) {
        this.basicDao = basicDao;
        this.loggers = loggers;
    }
    List<Course> courses = new ArrayList<>();
    public void add(Course newCourse) throws Exception {

        for (Course course1 : courses){
            if (course1.getCourseName().equals(newCourse.getCourseName())){
                throw new Exception("cannot repeat the same course");
            }
            if (newCourse.getCoursePrice()<0) {
                throw new Exception("The price of the course cannot be less than 0");
            }
        }
        courses.add(newCourse);
        basicDao.addCourse(newCourse);

        for (Logger logger : loggers){
            logger.log(newCourse.getCourseName());
        }

    }
}
