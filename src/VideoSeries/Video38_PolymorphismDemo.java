package VideoSeries;

public class Video38_PolymorphismDemo {
    public static void main(String[] args) {

//        Video38_BaseLogger[] loggers = new Video38_BaseLogger[]{new Video38_FileLogger(),new Video38_DatabaseLogger(),new Video38_EmailLogger()};
//
//        for (Video38_BaseLogger logger : loggers){
//            logger.Log("Log mesajı");
//        }

        Video38_CustomerManager customerManager = new Video38_CustomerManager(new Video38_DatabaseLogger());
        customerManager.add();

    }


}
