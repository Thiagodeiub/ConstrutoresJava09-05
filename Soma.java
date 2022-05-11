public class Soma {

    public int numero1, numero2, numero3, numero4;


    public int somador(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        return (numero1 + numero2);
    }

    public int somador(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;

        return (numero1 + numero2 + numero3);
    }


    public int somador(int numero1, int numero2, int numero3, int numero4) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;

        return (numero1 + numero2 + numero3 + numero4);
    }


}

//Crie um programa que pode receber no mínimo dois números (parâmetros)
// para efetuar uma soma e no máximo 4 números, utilize os construtores para fazer esse exercício;