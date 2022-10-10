package Day3_Homeworks.Homework_3.business;

import Day3_Homeworks.Homework_3.dataAccess.BasicDao;
import Day3_Homeworks.Homework_3.dataAccess.JdbcDao;
import Day3_Homeworks.Homework_3.entities.Category;
import Day3_Homeworks.Homework_3.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private BasicDao basicDao;
    private List<Logger> loggers;

    public CategoryManager(BasicDao basicDao, List<Logger> loggers) {
        this.basicDao = basicDao;
        this.loggers = loggers;
    }

    List<Category> categories = new ArrayList<>();
    public void add(Category newCategory) throws Exception {

        for (Category category1 : categories){
            if (category1.getCategoryName().equals(newCategory.getCategoryName())){
                throw new Exception("cannot repeat the same category");
            }
        }
        categories.add(newCategory);
        basicDao.addCategory(newCategory);

        for (Logger logger : loggers){
            logger.log(newCategory.getCategoryName());
        }

    }

}
