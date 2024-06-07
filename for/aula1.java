import java.util.Scanner;

public class aula1 {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("informe o valor de N");
    int n = entrada.nextInt();
    int soma = 0; // inicia com 0

    for (int i = 0; i<n; i++){ // for (inicio; condição; incremento); 
        System.out.println("digite as somas:");
        int x = entrada.nextInt(); // entrada dos valores para somar

        soma = soma + x; // valor soma + 0 da variavel x

    }
    System.out.println("resultado" + soma); // resultado

    entrada.close();
    
 }
    
}