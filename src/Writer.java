import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writer {

    public static void writeFile(String filename) {

        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);

            Scanner input = new Scanner(System.in);
            int counter = 10;

            while (counter >= 0) {
                System.out.println("ENter input: ");
                String text = input.nextLine();
                pw.println(text);
                counter--;

            }
            pw.close();

        }catch (IOException e) {
            System.out.println("Errrooorrrr");
        }
    }

    public static void main (String[] args) {

        writeFile("writing.txt");


    }
}
