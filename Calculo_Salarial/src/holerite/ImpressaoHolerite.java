/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite;

import calculo.CalculaSalararioComDesconto;

public class ImpressaoHolerite {
    public static void main(String[] args) {

        float salarioComDesconto = CalculaSalararioComDesconto.SalarioComDesconto("daniel", 1900);
        System.out.println("Salário com desconto: " + salarioComDesconto);
        
    }
}
