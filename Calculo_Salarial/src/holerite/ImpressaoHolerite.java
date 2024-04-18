
package holerite;


import funcionario.Funcionario;
import java.util.Scanner;


public class ImpressaoHolerite {
    public static void main(String[] args) {
        int tam;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o número de pessoas que você gostaria de cadastrar: ");
        tam = sc.nextInt();
        
        Funcionario[] funcionario = new Funcionario[tam];
        
        for (int i = 0; i < funcionario.length;i++){
            funcionario[i] = new Funcionario();
            
            System.out.print("Informe o nome do funcionario\n");
            funcionario[i].nome = sc.nextLine();
            
            System.out.print("Informe o cargo do funcionario\n ");
            funcionario[i].cargo = sc.nextLine();
            
            System.out.print("Informe o cargo do funcionario\n ");
            funcionario[i].idade = sc.nextInt();
            
            System.out.print("Informe o cargo do funcionario\n ");
            funcionario[i].salario = sc.nextFloat();
            
        }
        
        switch()
    }
}
