package Day3_Homeworks.Homework_3.dataAccess;

import Day3_Homeworks.Homework_3.entities.Category;
import Day3_Homeworks.Homework_3.entities.Course;
import Day3_Homeworks.Homework_3.entities.Instructor;

public interface BasicDao {
    void addCategory(Category category);
    void addCourse(Course course);
    void addIntructor(Instructor instructor);

}
