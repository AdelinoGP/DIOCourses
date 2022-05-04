import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int dist = leitor.nextInt();
        double combs = leitor.nextDouble();

        double media = dist/combs ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l",media      ));   
    }
	
}