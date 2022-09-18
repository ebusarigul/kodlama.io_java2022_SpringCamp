package VideoSerisi_1_23;

public class video11_loop_donguler {
    public static void main(String[] args) {

        // for()
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("loop is finished");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("loop is finished");

    }
}
