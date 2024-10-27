package br.salario.holerite;

import br.salario.calculo.Calculo;
import br.salario.funcionario.Funcionario;
import java.util.Scanner;

public class ImpressaoHolerite {

    public static void main(String[] args) {

        int tam;
        String pergunta;

        Calculo calculo = new Calculo();
        Scanner sc = new Scanner(System.in); 
        Scanner lerTexto = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\tHolerite\t\t\t");
        System.out.println("-------------------------------------------------------");
        System.out.println("\tSeja bem-vindo ao programa: Cálculo do Holerite");
        System.out.println("-------------------------------------------------------");

        System.out.print("Digite o número de funcionários que você gostaria de cadastrar: ");
        tam = sc.nextInt();
        System.out.println("-------------------------------------------------------");
        Funcionario[] funcionarios = new Funcionario[tam];

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();

            System.out.print("Informe o nome do funcionário: ");
            funcionarios[i].setNome(lerTexto.nextLine());

            System.out.print("Informe o cargo do funcionário: ");
            funcionarios[i].setCargo(lerTexto.nextLine());

            System.out.print("Informe as horas trabalhadas do funcionário: ");
            funcionarios[i].setHorasTrabalhadas(sc.nextFloat());

            System.out.print("Informe o salário do funcionário: ");
            funcionarios[i].setSalario(sc.nextFloat());
            sc.nextLine(); 

            System.out.println("-------------------------------------------------------");
        }

        do {
            System.out.println("\n\tMENU - Holerite");
            System.out.println("-------------------------------------------------------");
            System.out.println("1: Verificar o salário e benefícios do funcionário");
            System.out.println("2: Verificar o desconto retido na folha (IRPF e INSS)");
            System.out.println("3: Verificar os débitos e o salário líquido do funcionário");
            System.out.println("-------------------------------------------------------");
            System.out.print("Escolha uma operação: ");
            int resp = sc.nextInt();

            for (Funcionario func : funcionarios) {
                switch (resp) {
                    case 1:
                        System.out.println("-------------------------------------------------------");
                        System.out.print("O funcionário bateu a meta necessária para o bônus? (Sim/Não): ");
                        String simNao = lerTexto.nextLine();
                        float salarioBrutoComBonus = calculo.salarioComBonus(func.getSalario()) + calculo.horaExtra(func.getSalario(), func.getHorasTrabalhadas());
                        float salarioBrutoSemBonus = func.getSalario() + calculo.horaExtra(func.getSalario(), func.getHorasTrabalhadas());

                        System.out.println("-------------------------------------------------------");
                        System.out.println("| Nome: " + func.getNome() + "                                         |");
                        System.out.printf("| Salário normal: %.2f                               |\n", func.getSalario());
                        System.out.printf("| Horas trabalhadas: %.2f, Salário com horas extras: %.2f |\n", func.getHorasTrabalhadas(), calculo.horaExtra(func.getHorasTrabalhadas(), func.getSalario()));
                        if (simNao.equalsIgnoreCase("Sim")) {
                            System.out.printf("| Bônus: %.2f                                           |\n", calculo.bonus(func.getSalario()));
                            System.out.printf("| Salário bruto com bônus: %.2f                         |\n", salarioBrutoComBonus);
                        } else {
                            System.out.println("| O funcionário não possui bônus.                     |");
                            System.out.printf("| Salário bruto: %.2f                                  |\n", salarioBrutoSemBonus);
                        }
                        System.out.println("-------------------------------------------------------");
                        break;

                    case 2:
                        System.out.println("-------------------------------------------------------");
                        System.out.printf("Funcionario: %s |\n",func.getNome());
                        System.out.printf("| Desconto IRPF: %.2f                                  |\n", calculo.irpf(func.getSalario()));
                        System.out.printf("| Desconto INSS: %.2f                                  |\n", calculo.inss(func.getSalario()));
                        System.out.println("-------------------------------------------------------");
                        break;

                    case 3:
              
                        System.out.println("-------------------------------------------------------");
                        System.out.printf("Funcionario: %s |\n",func.getNome());
                        System.out.print("O funcionário escolheu vale transporte? (Sim/Não): ");
                        simNao = lerTexto.nextLine();
                        
                        float descontosComVt = (float) (calculo.irpf(func.getSalario()) + calculo.inss(func.getSalario()) + calculo.valeRefeicao(func.getSalario()) + calculo.convenioMedico(func.getSalario()) + (simNao.equalsIgnoreCase("Sim") ? calculo.valeTransporte(func.getSalario()) : 0));
                        float salarioLiquido = func.getSalario() - descontosComVt;
                        
                        System.out.printf("Funcionario: %s |\n",func.getNome());
                        System.out.printf("| Desconto vale transporte: %.2f                      |\n", simNao.equalsIgnoreCase("Sim") ? calculo.valeTransporte(func.getSalario()) : 0);
                        System.out.printf("| Desconto vale refeição: %.2f                        |\n", calculo.valeRefeicao(func.getSalario()));
                        System.out.printf("| Desconto convênio médico: %.2f                      |\n", calculo.convenioMedico(func.getSalario()));
                        System.out.printf("| Salário líquido: %.2f                               |\n", salarioLiquido);
                        System.out.println("-------------------------------------------------------");
                        break;

                    default:
                        System.out.println("-------------------------------------------------------");
                        System.out.println("| Opção inválida, por favor tente novamente.           |");
                        System.out.println("-------------------------------------------------------");
                        break;
                }

                System.out.print("Pressione 'Enter' para ver o próximo funcionário...");
                lerTexto.nextLine();
            }

            System.out.print("\nDeseja continuar? (Sim/Não): ");
            pergunta = lerTexto.nextLine();

        } while (pergunta.equalsIgnoreCase("Sim"));

        sc.close();
        lerTexto.close();
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t------- Fim do programa...---------");
        System.out.println("-------------------------------------------------------");
    }
}
