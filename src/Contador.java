import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = entrada.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois)
            throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int numero = 1; numero <= contagem; numero++){
            System.out.println("Imprimindo o número " + numero);
        }
    }
}
