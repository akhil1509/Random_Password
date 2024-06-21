import java.security.SecureRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Random_Password {
    private static final String pass_length = "ASDFGHJKLZXCVBNMQWERTYU" + "IOPasdfghjklzxcvbnmqwertyuiop1"
            + "23456789!@#$%^&*()_-++*";

    public static String randomPassword(int n) {
        SecureRandom secure = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int randomIndex = secure.nextInt(pass_length.length());
            char randomchar = pass_length.charAt(randomIndex);
            sb.append(randomchar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int password_length = 8;
        String randomPassword = randomPassword(password_length);
        System.out.println("Random Password: " + randomPassword);

    }
}