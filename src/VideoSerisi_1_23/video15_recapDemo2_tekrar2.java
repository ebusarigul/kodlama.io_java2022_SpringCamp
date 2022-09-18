package VideoSerisi_1_23;

public class video15_recapDemo2_tekrar2 {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.3, 5.3};

        double total = 0;
        double max = myList[0];
        for (Double number : myList) {
            if (max < number) {
                max = number;
            }
            System.out.println(number);
            total += number;
        }
        System.out.println("total myList = " + total);
        System.out.println("Max my list = " + max);

    }
}
