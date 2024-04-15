/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;
import funcionario.Funcionario;

/**
 *
 * @author berg
 */
public class CalculaSalararioComDesconto {

    private static Calculo c = new Calculo();
      
    public static float SalarioComDesconto(String nome, float salario){
        Funcionario f = new Funcionario();

        f.setNome(nome);
        f.setSalario(null);
        
        return c.irpf(f);

    }

}
