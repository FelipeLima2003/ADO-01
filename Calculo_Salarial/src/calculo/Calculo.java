package calculo;


import java.util.Scanner;

public class Calculo {

    Scanner sc = new Scanner(System.in);

    public void irpf(float salario) {
       
        float reducao;
        if (salario <= 2112) {
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else if (salario >= 2112.01 && salario <= 2826.65) {

            reducao = 158.40f;
            salario -= reducao;

            System.out.printf("O desconto é [%.3f] e o salario [%.3f]", reducao,salario);
        } else if (salario >= 2826.66 && salario <= 3751.05) {

            reducao = 370.40f;
            salario -= reducao;

            System.out.printf("A redução do IRPF é [%.3f] e o salario [%.3f]", reducao,salario);

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            reducao = 651.73f;
            salario -= reducao;

            System.out.printf("A redução do IRPF é [%.3f] e o salario [%.3f]" ,reducao,salario);

        } else {
            reducao = 884.96f;
            salario -= reducao;

            System.out.printf("A redução do IRPF é [%.3f] e o salario [%.3f]" ,reducao,salario);
        }

    }

    public void inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

            salario -= aliquota;
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota é [%.3f] e o salario [%.3f]", aliquota,salario);

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota é [%.3f] e o salario [%.3f]", aliquota,salario);

        } else {
             aliquota = 14.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota é [%.3f] e o salario [%.3f]", aliquota,salario);
        }

    }

    public void valeTransporte(float salario) {

        String confirmacao;
        float vt = salario * 0.06f;
        System.out.println("VocÃƒÂª gostaria de ter o vale transporte? ");
        confirmacao = sc.nextLine();

        if (confirmacao.equals("Sim")) {

            salario = salario - vt;
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {
            System.out.printf("O desconto é [%.3f] e o salario [%.3f]", vt, salario);
        }
    }

    public void valeRefeicao(float salario) {
        float vr = salario * 0.03f;
        if (salario <= 1412) {
            System.out.println("O Salario nÃƒÂ£o muda");

        } else {

            salario = salario - vr;
            System.out.printf("O desconto é [%.3f] e o salario [%.3f]", vr, salario);

        }

    }

    public void convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {

            salario = salario - convenio;
            System.out.printf("O desconto é [%.3f] e o salario [%.3f]", convenio, salario);

        }

    }

    public void valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
        if (salario <= (1412 * 3)) {
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {

            salario = salario - va;
            System.out.printf("O desconto é [%.3f] e o salario [%.3f]", va,salario );

        }

    }

    

}
