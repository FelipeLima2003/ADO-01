package calculo;


import java.util.Scanner;

public class Calculo {

    Scanner sc = new Scanner(System.in);

    public float irpf(float salario) {
       
        float reducao;
        if (salario <= 2112) {
           
        return salario;
        } else if (salario >= 2112.01 && salario <= 2826.65) {

            reducao = 158.40f;
            salario -= reducao;

            return salario;
        } else if (salario >= 2826.66 && salario <= 3751.05) {

            reducao = 370.40f;
            salario -= reducao;

             return salario;

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            reducao = 651.73f;
            salario -= reducao;

             return salario;

        } else {
            reducao = 884.96f;
            salario -= reducao;

             return salario;
        }

    }

    public float inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

            salario -= aliquota;
            return salario;
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            salario -= aliquota;

            return salario;

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            salario -= aliquota;

             return salario;

        } else {
             aliquota = 14.00f * 100;
            salario -= aliquota;

             return salario;
        }

    }

    public float valeTransporte(float salario) {

        String confirmacao;
        float vt = salario * 0.06f;
        System.out.println("VocÃª gostaria de ter o vale transporte? ");
        confirmacao = sc.nextLine();

        if (confirmacao.equals("Sim")) {

            salario = salario - vt;
            return salario;
        } else {
            return salario;
        }
    }

    public float valeRefeicao(float salario) {
        float vr = salario * 0.03f;
         return salario;

        } else {

            salario = salario - vr;
            System.out.printf("O desconto � [%.3f] e o salario [%.3f]", vr, salario);

        }

    public float convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            return salario;
        } else {
            salario = salario - convenio;
            return salario;

        }

    }

    public float valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
        if (salario <= (1412 * 3)) {
          
        } else {

             return salario;

        }
        
        
     sc.close();

    }

 }
