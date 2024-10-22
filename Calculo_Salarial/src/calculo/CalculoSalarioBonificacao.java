/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculo;

/**
 *
 * @author Felipe Lima
 */
public interface CalculoSalarioBonificacao {
     abstract public double bonus (float salario);
     abstract public float horaExtra (float salario, float horasTrabalhadas);
}
