package Day3_Homeworks.Homework_3;

import Day3_Homeworks.Homework_3.business.CategoryManager;
import Day3_Homeworks.Homework_3.business.CourseManager;
import Day3_Homeworks.Homework_3.business.InstructorManager;
import Day3_Homeworks.Homework_3.dataAccess.HibernateDao;
import Day3_Homeworks.Homework_3.dataAccess.JdbcDao;
import Day3_Homeworks.Homework_3.entities.Category;
import Day3_Homeworks.Homework_3.entities.Course;
import Day3_Homeworks.Homework_3.entities.Instructor;
import Day3_Homeworks.Homework_3.logging.DatabaseLogger;
import Day3_Homeworks.Homework_3.logging.FileLogger;
import Day3_Homeworks.Homework_3.logging.Logger;
import Day3_Homeworks.Homework_3.logging.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());

        Category category = new Category("Programming");
        //Category category2 = new Category("Programming");
        Course course = new Course("Java101",0);
        //Course course2 = new Course("Java101",1000);
        //Course course3 = new Course("C#101",-1000);
        Instructor instructor = new Instructor("Engin","Demirog");

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(),loggers);

        categoryManager.add(category);
        //categoryManager.add(category2);
        System.out.println("----------------------------------");
        courseManager.add(course);
        //courseManager.add(course2);
        //courseManager.add(course3);
        System.out.println("----------------------------------");
        instructorManager.add(instructor);






    }
}
