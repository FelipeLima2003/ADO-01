package holerite;

import calculo.Calculo;
import funcionario.Funcionario;
import java.util.Scanner;

public class ImpressaoHolerite {

    public static void main(String[] args) {

        int tam;
        String pergunta = null;

        Calculo calculo = new Calculo();
        Scanner sc = new Scanner(System.in); //Scanner para numeros
        Scanner lerTexto = new Scanner(System.in); //Scanner para texto

        System.out.print("-------------------------------------------------------\n");
        System.out.println("\tHolerite\t");
        System.out.print("-------------------------------------------------------\n");
        System.out.print("\tSeja bem vindo ao programa: Calcudo do Holerite\t");
        System.out.print("\n-------------------------------------------------------\n");

        System.out.print("Digite o número de pessoas que você gostaria de cadastrar:");
        tam = sc.nextInt();
        System.out.print("-------------------------------------------------------\n");
        Funcionario[] funcionario = new Funcionario[tam];

        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i] = new Funcionario();

            System.out.print("Informe o nome do funcionario: ");
            funcionario[i].setNome(lerTexto.nextLine());

            System.out.print("\nInforme o cargo do funcionario: ");
            funcionario[i].setCargo(lerTexto.nextLine());

            System.out.print("\nInforme as horas trabalhadas do funcionario: ");
            funcionario[i].setHorasTrabalhadas(sc.nextFloat());

            System.out.print("\nInforme o salario do funcionario: ");
            funcionario[i].setSalario(sc.nextFloat());

            System.out.println("");
        }

        do {

            System.out.printf("O Programa irá mostrar os beneficios e desconto do salario bruto dos funcionarios\n");

            System.out.println("\t MENU - Holerite \t");
            System.out.println("\n-------------------------------------------------------\n");
            System.out.println("");
            System.out.println("Digite a operação que você gostaria no Holerite: ");
            System.out.println("");
            System.out.println("1: Verificar o salario e beneficios do funcionario");
            System.out.println("");
            System.out.println("2: Verificar o desconto retido na folha IRPF e INSS");
            System.out.println("");
            System.out.println("3: Verificar os debitos e o salario liquido do funcionario");
            System.out.println("");
            System.out.println("-------------------------------------------------------\n");
            int resp = sc.nextInt();

            for (Funcionario funcionario1 : funcionario) {
                switch (resp) {
                    case 1:
                        System.out.print("O Funcionario bateu a meta necessaria para o bonus Digite Sim ou Não: ");
                        String simNao = lerTexto.nextLine();
                        float salarioBrutoComBonus = (float) (calculo.salarioComBonus(funcionario1.getSalario()) + calculo.horaExtra(funcionario1.getSalario(), funcionario1.getHorasTrabalhadas()));
                        float salarioBrutoSemBonus = funcionario1.getSalario() + calculo.horaExtra(funcionario1.getSalario(), funcionario1.getHorasTrabalhadas());
                        if (simNao.equalsIgnoreCase("Sim")) {
                            System.out.print("O nome do funcionario é:  " + funcionario1.getNome() + "\n");
                            System.out.print("O salario normal : " + funcionario1.getSalario() + "\n");
                            System.out.printf("As horas trabalhas são: %.3f horas e o salario com as horas extras é %.3f + \n", funcionario1.getSalario(), calculo.horaExtra(funcionario1.getHorasTrabalhadas(), funcionario1.getSalario()));
                            System.out.print("O Bonus é : " + calculo.bonus(funcionario1.getSalario()) + "\n");
                            System.out.print("-------------------------------------------------------\n");
                            System.out.printf("O salario bruto do funcionario com acrescimos é: %.3f", salarioBrutoComBonus);
                        } else {
                            System.out.print("O nome do funcionario é:  " + funcionario1.getNome() + "\n");
                            System.out.print("O salario é : " + funcionario1.getSalario() + "\n");
                            System.out.printf("As horas trabalhas são: %.3f horas e o salario com as horas extras é %.3f + \n", funcionario1.getHorasTrabalhadas(), calculo.horaExtra(funcionario1.getHorasTrabalhadas(), funcionario1.getSalario()));
                            System.out.print("O Funcionario não possui bonus");
                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");
                            System.out.printf("O salario bruto do funcionario com acrescimos é: %.3f", salarioBrutoSemBonus);
                        }
                        break;
                    case 2:
                        System.out.print("Conforme o salario do funcionaro o desconto do IRPF é : " + calculo.irpf(funcionario1.getSalario()) + "\n");
                        System.out.print("Conforme o salario do funcionaro o desconto do INSS é : " + calculo.inss(funcionario1.getSalario()) + "\n");
                        break;
                    case 3:
                        System.out.print("O Funcionario escolheu o vale transporte Digite Sim ou Não: ");
                        simNao = lerTexto.nextLine();
                        float desconto = (float) (calculo.irpf(funcionario1.getSalario()) + calculo.inss(funcionario1.getSalario()) + calculo.valeRefeicao(funcionario1.getSalario()) + calculo.convenioMedico(funcionario1.getSalario()) + calculo.valeTransporte(funcionario1.getSalario()));
                        float descontoSemVt = calculo.irpf(funcionario1.getSalario()) + calculo.inss(funcionario1.getSalario()) + calculo.valeRefeicao(funcionario1.getSalario()) + calculo.convenioMedico(funcionario1.getSalario());
                        float salarioLiquidoComVt = funcionario1.getSalario() - desconto;
                        float salarioLiquidoSemVt = funcionario1.getSalario() - descontoSemVt;
                        if (simNao.equalsIgnoreCase("Sim")) {
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale transporte é : " + calculo.valeTransporte(funcionario1.getSalario()) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Refeição é : " + calculo.valeRefeicao(funcionario1.getSalario()) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico é : " + calculo.convenioMedico(funcionario1.getSalario()) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimentação é : " + calculo.valeAlimentacao(funcionario1.getSalario()) + "\n");
                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");
                            System.out.print("O salario liquido do funcionario é: " + salarioLiquidoComVt + "\n");
                        } else {
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Refeição é : " + calculo.valeRefeicao(funcionario1.getSalario()) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Convenio Medico é : " + calculo.convenioMedico(funcionario1.getSalario()) + "\n");
                            System.out.print("Conforme o salario do funcionaro o desconto do Vale Alimentação é : " + calculo.valeAlimentacao(funcionario1.getSalario()) + "\n");
                            System.out.println("");
                            System.out.println("-------------------------------------------------------\n");
                            System.out.print("O salario liquido do funcionario é: " + salarioLiquidoSemVt + "\n");
                        }
                        break;
                    default:
                        System.out.println("Opção invalida, por favor tente novamente.");
                }
            }

            System.out.println("\nDeseja continuar? (Sim/Não): ");
            pergunta = lerTexto.nextLine();

        } while (pergunta.equalsIgnoreCase("Sim"));

        sc.close();
        lerTexto.close();

        System.out.println("\t------- Fim do programa...---------\t");
        System.exit(0);
    }

}
