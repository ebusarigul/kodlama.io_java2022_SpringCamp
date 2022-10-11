package VideoSeries;

public class Video40_Main {
    public static void main(String[] args) {


        Video40_WomanGameCalculator womanGameCalculator = new Video40_WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        Video40_GameCalculator gameCalculators = new Video40_ManGameCalculator();
        gameCalculators.hesapla();
        gameCalculators.gameOver();




    }
}
