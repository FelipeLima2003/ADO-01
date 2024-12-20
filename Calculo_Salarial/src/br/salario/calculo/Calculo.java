
package br.salario.calculo;





public class Calculo implements CalculoSalarioBonificacao, CalculoSalarioDescontos {
    
    // Classe Utilizada para cria��o dos metodos utilizados para relizar os calculos
    
    /*
    A classe possui os metodos de adi��o ao salario do funcionario como o metodo bonus e horaExta.
    E tamb�m possui metodos de desconto do salario que s�o o IRPF, INSS, Vt,Va,Vr,conveinio medico.
    */
    
    
    @Override
    public double bonus (float salario){
        
       
        float bonus = (float) (salario*0.05f);
        return bonus;
        
    }
    
     public float salarioComBonus(float salario){
        double salarioComBonus = salario + bonus(salario);
      
        return (float) salarioComBonus;
        
    }

    @Override
    public float horaExtra (float salario, float horasTrabalhadas){
        float valorHora = salario/200;
        float valorHoraExtra = 0f;
        
        if (horasTrabalhadas > 40) {
            float horaExtra = (horasTrabalhadas - 40); 
            valorHoraExtra = horaExtra* (valorHora * 1.5f);
        }
        
        return valorHoraExtra;
    }
    
    
  
    @Override
    public float irpf(float salario) {
   
        float reducao;
        if (salario <= 2112) {
           
            return 0;
        } else if (salario >= 2112.01 && salario <= 2826.65) {

            reducao = 158.40f;
            

            return reducao;
        } else if (salario >= 2826.66 && salario <= 3751.05) {

            reducao = 370.40f;
           
            return reducao;

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            reducao = 651.73f;
     

            return reducao;

        } else {
            reducao = 884.96f;

             
            return reducao;
        }

    }

    @Override
    public float inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

             
            return aliquota;
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            return aliquota;

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            

             return aliquota;

        } else {
            aliquota = 14.00f * 100;
            
             return aliquota;
        }

    }
    
   

    @Override
    public double valeTransporte(float salario){

       float vt = (float) (salario * 0.06f);
  
       return vt;
    
    }

    @Override
    public float valeRefeicao(float salario) {
        float vr = salario * 0.03f;
        if (salario <= 1412){
            return 0;
        }else {
            return vr;
        }
    }

    @Override
    public float convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            return 0;
        } else {
            return convenio;

        }

    }

    @Override
    public float valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
       
        if (salario <= (1412 * 3)) {
          return 0;
                  
        } else {
            
         return va;

        }
        
      
    }

  
    
}
