package estruturas_controle.enquanto.incremento;

public class Incremento {
    public static void main(String[] args) {

        int c = 5;
        System.out.printf("c antes do pós incremento: %d\n", c);
        System.out.printf("c durante o pós incremento: %d\n", c++);
        System.out.printf("c após o pós incremento: %d\n", c);

        System.out.println();

        c = 5;

        System.out.printf("c antes do pré incremento: %d\n", c);
        System.out.printf("c durante o pré incremento: %d\n", ++c);
        System.out.printf("c após o pré incremento: %d\n", c);


    }
}
