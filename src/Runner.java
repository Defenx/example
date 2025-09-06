import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        printNames();
        printNames("Valera");
        printNames("Valera", "Olya", "Danik");
    }

    static void printNames(String... names) {
        if (names.length == 0) {
            System.out.println("Нечего выводить");
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " " + names[i]);
        }
    }
}