
public class Apples {

    public static void main (String [] args) {

        String s1 = new String("cow");
        String s2 = new String("cow");
        String s3 = s2;
        s1 = s3;
        if (s1 == s2)
            System.out.println("They are the same.");
        else
            System.out.println("Not same");

    }
}
