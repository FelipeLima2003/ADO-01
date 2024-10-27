/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.salario.calculo;

/**
 *
 * @author Felipe Lima
 */
public interface CalculoSalarioDescontos {
    abstract public float irpf(float salario);
    abstract public float inss(float salario);
    abstract public double valeTransporte(float salario);
    abstract public float valeRefeicao(float salario);
    abstract public float convenioMedico(float salario);
    abstract public float valeAlimentacao(float salario);



}
