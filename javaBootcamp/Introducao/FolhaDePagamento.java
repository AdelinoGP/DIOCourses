import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numColab = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int horasTrabalhadas = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    double valorHora = Double.parseDouble(st.nextToken());

    System.out.println("NUMBER = " + numColab);
    System.out.println("SALARY = U$ " + String.format("%.02f", valorHora*horasTrabalhadas));
    
   //escreva o seu código  

  }
}