package VideoSerisi_1_23;

public class video17_strings {
    public static void main(String[] args) {

        String message = "The weather is very nice today.";
        System.out.println(message);

        System.out.println("eleman sayısı = " + message.length());
        System.out.println("5. eleman = " + message.charAt(4));
        System.out.println(message.concat("Great!"));

        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("a"));

        char[] karakterler = new char[3];
        message.getChars(0,3,karakterler,0);
        System.out.println(karakterler);

        System.out.println(message.indexOf("is"));
        System.out.println(message.lastIndexOf("a"));

    }
}
