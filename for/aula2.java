import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int x = entrada.nextInt();
        for(int i = 1; i<=x; i++){
            if( i % 2 != 0){ // formula de numero impares
                System.out.println(i);
            }

        }
        entrada.close();
    }
}
