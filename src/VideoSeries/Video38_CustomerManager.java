package VideoSeries;

public class Video38_CustomerManager {

    private Video38_BaseLogger baseLogger;

    public Video38_CustomerManager(Video38_BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){

        System.out.println("Müşteri Eklendi");
        baseLogger.log("log mesajı");
    }


}
