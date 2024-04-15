package calculo;


//import java.util.Scanner;
import funcionario.Funcionario;

public class Calculo {

    public float irpf(Funcionario funcionario) {

        float salario = funcionario.getSalario();
        float reducao;

        if (salario <= 2112) {

            return salario;

        } else if (salario >= 2112.01 && salario <= 2826.65) {

            reducao = 158.40f;

        } else if (salario >= 2826.66 && salario <= 3751.05) {

            reducao = 370.40f;

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            reducao = 651.73f;

        } else {

            reducao = 884.96f;

        }
        
        salario -= reducao;
        funcionario.setSalario(salario);
        return salario;

    }
/* 
    public void inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

            salario -= aliquota;
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota � [%.3f] e o salario [%.3f]", aliquota,salario);

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota � [%.3f] e o salario [%.3f]", aliquota,salario);

        } else {
             aliquota = 14.00f * 100;
            salario -= aliquota;

            System.out.printf("A aliquota � [%.3f] e o salario [%.3f]", aliquota,salario);
        }

    }

    public void valeTransporte(float salario) {

        String confirmacao;
        float vt = salario * 0.06f;
        System.out.println("VocÃª gostaria de ter o vale transporte? ");
        confirmacao = sc.nextLine();

        if (confirmacao.equals("Sim")) {

            salario = salario - vt;
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {
            System.out.printf("O desconto � [%.3f] e o salario [%.3f]", vt, salario);
        }
    }

    public void valeRefeicao(float salario) {
        float vr = salario * 0.03f;
        if (salario <= 1412) {
            System.out.println("O Salario nÃ£o muda");

        } else {

            salario = salario - vr;
            System.out.printf("O desconto � [%.3f] e o salario [%.3f]", vr, salario);

        }

    }

    public void convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {

            salario = salario - convenio;
            System.out.printf("O desconto � [%.3f] e o salario [%.3f]", convenio, salario);

        }

    }

    public void valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
        if (salario <= (1412 * 3)) {
            System.out.printf("O Salario continua o mesmo ele [%.3f]", salario);
        } else {

            salario = salario - va;
            System.out.printf("O desconto � [%.3f] e o salario [%.3f]", va,salario );

        }
        
        
     sc.close();

    }

*/
}
