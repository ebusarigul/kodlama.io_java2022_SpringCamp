package Day3_Homeworks.Homework_3.dataAccess;

import Day3_Homeworks.Homework_3.entities.Category;
import Day3_Homeworks.Homework_3.entities.Course;
import Day3_Homeworks.Homework_3.entities.Instructor;
import Day3_OOP2.entities.Product;

public class HibernateDao implements BasicDao {

    @Override
    public void addCategory(Category category) {
        System.out.println(("Added with Hibernate = " + "category name = " + category.getCategoryName()));
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Added with Hibernate = " + "course name = " + course.getCourseName() + "\n" +
                                                       "course price = " + course.getCoursePrice());
    }

    @Override
    public void addIntructor(Instructor instructor) {
        System.out.println("Added with Hibernate = " + "instructor name = " + instructor.getInstructorName());
    }
}
