import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
//declare suas variaveis corretamente
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int i;

//continue a solução
        for (i = 0; i < 5; i++) {
          st = new StringTokenizer(br.readLine());
          Double num = Double.parseDouble(st.nextToken());
        	if (num % 2 == 0) {
            pares++;
          } else {
            impares++;
          }

          if (num > 0) {
            positivos++;
          } else if (num < 0) {
            negativos++;
          }
        }
//insira suas variaveis corretamente
        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }
	
}