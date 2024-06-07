import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("informe a quantidade:");
        int n = entrada.nextInt();
        int in = 0;
		int out = 0;
		
        for(int i = 0; i < n; i++){
            System.out.println("Infome as entradas");
            int x = entrada.nextInt();

            if(x >=10 && x <=20){
                in = in + 1;    // pega os valores e acrescenta mais 1
                
            } else {
                out = out + 1; // pega os valores e acrescenta mais 1
            }
        }
        System.out.println(in + " in");
		System.out.println(out + " out");

        entrada.close();
    }
}
