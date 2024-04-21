package holerite;

import calculo.Calculo;
import funcionario.Funcionario;
import java.util.Scanner;

public class ImpressaoHolerite {

   
    public static void main(String[] args) {
        /*Metodo main responsavel por popular o array tipado e tamb�m 
       contem o menu do programa Holerite
        */
        
        
        int tam;
        String pergunta = null;

        Calculo calculo = new Calculo();
        Scanner sc = new Scanner(System.in); //Scanner para numeros
        Scanner lerTexto = new Scanner(System.in); //Scanner para texto
        
        
        System.out.println("\t MENU - Holerite \t");
        System.out.print("-------------------------------------------------------\n");
        System.out.print("\tSeja bem vindo ao programa: Calcudo do Holerite\t");
        System.out.print("\n-------------------------------------------------------\n");

        System.out.print("Digite o n�mero de pessoas que voc� gostaria de cadastrar:");
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
            
           System.out.println("");
        }
        do {

            for (int i = 0; i < funcionario.length; i++) {
                System.out.printf("O Programa ir� mostrar os beneficios e desconto do salario bruto do %d� funcionario/n", i + 1);
                
                System.out.println("\t MENU - Holerite \t");
                System.out.println("\n-------------------------------------------------------\n");
                System.out.println("");
                System.out.println("Digite a opera��o que voc� gostaria no Holerite: ");
                System.out.println("");
                System.out.println("1: Verificar o salario e beneficios do funcionario");
                System.out.println("");
                System.out.println("2: Verificar o desconto retido na folha (IRPF) e INSS");
                System.out.println("");
                System.out.println("3: Verificar os debitos e o salario liquido do funcionario");
                System.out.println("");
                System.out.println("-------------------------------------------------------\n");
                int resp = sc.nextInt();

                switch (resp) {

                    case 1:

                        System.out.print("O Funcionario bateu a meta necessaria para o bonus Digite Sim ou N�o: ");
                        String simNao = lerTexto.nextLine();

                        float salarioBrutoComBonus = (float) (funcionario[i].salario + calculo.bonus(funcionario[i].salario) + calculo.horaExtra(funcionario[i].salario, funcionario[i].horasTrabalhadas));
                        float salarioBrutoSemBonus = funcionario[i].salario + calculo.horaExtra(funcionario[i].salario, funcionario[i].horasTrabalhadas);

                        if ((simNao.equalsIgnoreCase("Sim"))) {

                            System.out.print("O nome do funcionario �:  " + funcionario[i].nome + "\n");
                            System.out.print("O salario � : " + funcionario[i].salario + "\n");
                            System.out.printf("As horas trabalhas s�o: %.3f horas e o salario com as horas extras � %.3f + \n", funcionario[i].horasTrabalhadas, calculo.horaExtra(funcionario[i].horasTrabalhadas, funcionario[i].salario));
                            System.out.print("O Bonus � : " + calculo.bonus(funcionario[i].salario) + "\n");

                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");

                            System.out.printf("O salario bruto do funcionario com acrescimos �: %.3f", salarioBrutoComBonus);

                        } else {
                            System.out.print("O nome do funcionario �:  " + funcionario[i].nome + "\n");
                            System.out.print("O salario � : " + funcionario[i].salario + "\n");
                            System.out.printf("As horas trabalhas s�o: %.3f horas e o salario com as horas extras � %.3f + \n", funcionario[i].horasTrabalhadas, calculo.horaExtra(funcionario[i].horasTrabalhadas, funcionario[i].salario));
                            System.out.print("O Bonus � : " + calculo.bonus(funcionario[i].salario) + "\n");

                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");

                            System.out.printf("O salario bruto do funcionario com acrescimos �: %.3f", salarioBrutoSemBonus);

                        }

                        break;
                    case 2:
                        System.out.print("Conforme o salario do funcionaro o desconto do IRPF � : " + calculo.irpf(funcionario[i].salario) + "\n");
                        System.out.print("Conforme o salario do funcionaro o desconto do INSS � : " + calculo.inss(-funcionario[i].salario) + "\n");
                        break;

                    case 3:

                        System.out.print("O Funcionario escolheu o vale transporte Digite Sim ou N�o: ");
                        simNao = lerTexto.nextLine();

                      
                        
                        float desconto = (float) (calculo.irpf(funcionario[i].salario) + calculo.inss(funcionario[i].salario) + calculo.valeRefeicao(funcionario[i].salario) + calculo.convenioMedico(funcionario[i].salario) + calculo.valeTransporte(funcionario[i].salario));    
                        float descontoSemVt = calculo.irpf(funcionario[i].salario) + calculo.inss(funcionario[i].salario) + calculo.valeRefeicao(funcionario[i].salario) + calculo.convenioMedico(funcionario[i].salario);

                     
                        float salarioLiquidoComVt = funcionario[i].salario - desconto;
                        float salarioLiquidoSemVt = funcionario[i].salario - descontoSemVt;
                        
                        if ((simNao.equalsIgnoreCase("Sim"))) {

                            System.out.print("Conforme o salario do funcionaro o desconto do Vale transporte � : " + calculo.valeTransporte(funcionario[i].salario) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Refei��o � : " + calculo.valeRefeicao(funcionario[i].salario) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico � : " + calculo.convenioMedico(funcionario[i].salario) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimenta��o � : " + calculo.valeAlimentacao(funcionario[i].salario) + "\n");

                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");

                            System.out.print("O salario liquido do funcionario �: " + salarioLiquidoComVt + "\n");

                        } else {
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Refei��o � : " + calculo.valeRefeicao(funcionario[i].salario) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico � : " + calculo.convenioMedico(funcionario[i].salario) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimenta��o � : " + calculo.valeAlimentacao(funcionario[i].salario) + "\n");
                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");
                            System.out.print("O salario liquido do funcionario �: " + salarioLiquidoSemVt + "\n");
                        }

                        break;

                    default:
                        System.out.println("Op��o invalida, por favor tente novamente.");

                }

               
            }
            
            
        System.out.println("\nDeseja continuar? (Sim/N�o): ");
        pergunta = lerTexto.nextLine();
        }while (pergunta.equalsIgnoreCase("Sim"));
       
    sc.close();
    lerTexto.close();
    
        System.out.println("\t------- Fim do programa...---------\t");
        System.exit(0);
    }

}
