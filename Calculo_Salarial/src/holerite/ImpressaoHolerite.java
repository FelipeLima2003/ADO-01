package holerite;

import calculo.Calculo;
import funcionario.Funcionario;
import java.util.Scanner;

public class ImpressaoHolerite {

    public static void main(String[] args) {
        int tam;

        Calculo calculo = new Calculo();
        Scanner sc = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);

        System.out.print("-------------------------------------------------------\n");
        System.out.print("\tBem vindo ao programa: Calcudo do Holerite\t");
        System.out.print("\n-------------------------------------------------------\n");

        System.out.print("\tDigite o número de pessoas que você gostaria de cadastrar: ");
        tam = sc.nextInt();
        System.out.print("-------------------------------------------------------\n");
        Funcionario[] funcionario = new Funcionario[tam];

        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i] = new Funcionario();

            System.out.print("Informe o nome do funcionario: \n");
            funcionario[i].nome = lerTexto.nextLine();

            System.out.print("Informe o cargo do funcionario: \n ");
            funcionario[i].cargo = lerTexto.nextLine();

            System.out.print("Informe as horas trabalhadas do funcionario: \n ");
            funcionario[i].horasTrabalhadas = sc.nextFloat();

            System.out.print("Informe o salario do funcionario: \n ");
            funcionario[i].salario = sc.nextFloat();

        }

        for (int i = 0; i < funcionario.length; i++) {
            System.out.printf("O Programa irá mostrar os beneficios e desconto do salario bruto do %dº funcionario/n", i + 1);

            System.out.print("-------------------------------------------------------\n");
            System.out.print("Digite a operação que você gostaria no Holerite: ");
            System.out.print("/t 1: Verificar o salario Bruto do funcionario: //t");
            System.out.print("/t 2: Verificar as horas extra do funcionario: /t");
            System.out.print("/t 3: Verificar o desconto retido na folha (IRPF) /t");
            System.out.print("/t 4: Verificar o desconto do INSS: /t");
            System.out.print("-------------------------------------------------------\n");
            int resp = sc.nextInt();

            switch (resp) {

                case 1:
                    System.out.print("O nome do funcionario é:  " + funcionario[i].nome + "\n");
                    System.out.print("O salario bruto é : " + funcionario[i].salario + "\n");
                    System.out.printf("As horas trabalhas são: %.3f e o salario com as horas extras é %.3f + \n", funcionario[i].horasTrabalhadas, calculo.horaExtra(funcionario[i].horasTrabalhadas, funcionario[i].salario));
                    System.out.print("Conforme o salario do funcionaro o desconto do IRPF é : " + calculo.irpf(funcionario[i].salario) + "\n");
                    System.out.print("Conforme o salario do funcionaro o desconto do INSS é : " + calculo.inss(funcionario[i].salario) + "\n");
                    break;

                case 2:
                    System.out.print("Conforme o salario do funcionaro o desconto do IRPF é : " + calculo.irpf(funcionario[i].salario) + "\n");
                    System.out.print("Conforme o salario do funcionaro o desconto do INSS é : " + calculo.inss(funcionario[i].salario) + "\n");
                    break;

                case 3:

                    System.out.print("O Funcionario escolheu o vale transporte:/n Digite Sim ou Não");
                    String simNao = lerTexto.nextLine();
                    
                    if ((simNao.equalsIgnoreCase("Sim"))){  
       
                      
                        System.out.print("Conforme o salario do funcionaro o desconto do Vale transporte é : " + calculo.valeTransporte(funcionario[i].salario) + "\n");
                        System.out.print("Conforme o salario do funcionaro o desconto do Vale Refeição é : " + calculo.valeRefeicao(funcionario[i].salario) + "\n");
                        System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico é : " + calculo.convenioMedico(funcionario[i].salario) + "\n");
                        System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimentação é : " + calculo.valeAlimentacao(funcionario[i].salario) + "\n");
                    }
                    
                    else{
                       System.out.print("Conforme o salario do funcionaro o desconto do Vale Refeição é : " + calculo.valeRefeicao(funcionario[i].salario ) + "\n");
                       System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico é : " + calculo.convenioMedico(funcionario[i].salario ) +"\n"); 
                       System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimentação é : " + calculo.valeAlimentacao(funcionario[i].salario ) + "\n");
                     }
                default:
                    System.out.print("Por favor informe os dados corretamente: ");
                    break;

            }
        }
    }
}
