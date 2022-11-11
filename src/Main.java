import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder frase = new StringBuilder();


        String palabra;
        while (!(palabra = scanner.nextLine()).equalsIgnoreCase("FIN")){
            frase.append(palabra).append(" ");
        }
        System.out.println(frase.toString().trim());
    }
}