package Day3_Homeworks.Homework_3.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı = " + data);
    }
}
