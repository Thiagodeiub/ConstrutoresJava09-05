import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Soma soma = new Soma();
        System.out.println("digite o primeiro número");
        soma.numero1 = scan.nextInt();
        System.out.println("digite o segundo número");
        soma.numero2 = scan.nextInt();
        System.out.println("dite o terceiro número");
        soma.numero3 = scan.nextInt();
        System.out.println("dite o quarto número");
        soma.numero4 = scan.nextInt();


        System.out.println(soma.somador(soma.numero1, soma.numero2));
    }

}
