package Day3_Homeworks.Homework_3.dataAccess;

import Day3_Homeworks.Homework_3.entities.Category;
import Day3_Homeworks.Homework_3.entities.Course;
import Day3_Homeworks.Homework_3.entities.Instructor;

public class JdbcDao implements BasicDao {

    @Override
    public void addCategory(Category category) {
        System.out.println(("Added with JDBC = " + "category name = " + category.getCategoryName()));
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Added with JDBC = " + "course name = " + course.getCourseName() + "\n" +
                                                  "course price = " + course.getCoursePrice());
    }

    @Override
    public void addIntructor(Instructor instructor) {
        System.out.println("Added with JDBC = " + "instructor name = " + instructor.getInstructorName());
    }
}

