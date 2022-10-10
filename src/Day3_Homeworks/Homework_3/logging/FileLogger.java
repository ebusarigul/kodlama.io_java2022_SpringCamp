package Day3_Homeworks.Homework_3.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {

        System.out.println("Dosyaya loglandı = " + data);

    }
}
