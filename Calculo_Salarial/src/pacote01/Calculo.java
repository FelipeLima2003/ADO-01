package pacote01;

import java.util.Scanner;

public class Calculo {

    Scanner sc = new Scanner(System.in);
    public void irpf(float salario) {
        if (salario <= 2112) {
            System.out.printf("O salário é : R$ %.3f", salario);
        } else if (salario >= 2112.01 && salario <= 2826.65) {

            float reducao = 158.40f;
            salario -= reducao;

            System.out.printf("O salário é : R$ %.3f", salario);
        } else if (salario >= 2826.66 && salario <= 3751.05) {

            float reducao = 370.40f;
            salario -= reducao;

            System.out.printf("O salário é : R$ %.3f", salario);

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            float reducao = 651.73f;
            salario -= reducao;

            System.out.printf("O salário é : R$ %.3f", salario);
       
        } else {
            float reducao = 884.96f;
            salario -= reducao;

            System.out.printf("O salário é : R$ %.3f", salario);
        }
        
        
    }
    
    public void inss(float salario) {
        if (salario <= 1412) {
            
            float aliquota = 7.50f *100;
            
            salario -= aliquota;         
            System.out.printf("O salário é: R$ %.3f", salario);
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            float aliquota = 9.00f *100;
            salario -= aliquota;

            System.out.printf("O salário é : R$ %.3f", salario);
            
        } else if (salario >= 2666.69 && salario <= 4000.03) {

            float aliquota = 12.00f *100;
            salario -= aliquota;

            System.out.printf("O salario é: R$ %.3f", salario);

        } else {
            float aliquota = 14.00f * 100;
            salario -= aliquota;

            System.out.printf("O salário é : R$ %.3f", salario);
        }
        
        
    }

    public void valeTransporte (float salario){
        
        String confirmacao;
        
        System.out.println("Você gostaria de ter o vale transporte? ");
        confirmacao = sc.nextLine();
        
        if (confirmacao.equals("Sim")){
            float valeTransporte = salario *0.06f;
            salario = salario - valeTransporte;
            System.out.printf("O Salario com vale transporte é %.3f",salario);
       }else{
            System.out.printf("O salario continua o mesmo %.3f",salario);
        }
    }
    
    public void valeRefeicao (float salario){
        if (salario >= 1412){
            System.out.println("O Salario não muda");
            
       }else{
           float valeRefeicao = salario * 0.03f;
           salario = salario - valeRefeicao;
           System.out.println("");
        
    }
     
    
}
