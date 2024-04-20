
package calculo;





public class Calculo {
    
    // Classe Utilizada para criação dos metodos utilizados para relizar os calculos
    public double bonus (double salario){
        
       
        float bonus = (float) (salario*0.05f);
        return bonus;
        
    }

    public float horaExtra (float salario, float horasTrabalhadas){
        float valorHora = salario/200;
        float valorHoraExtra = 0f;
        
        if (horasTrabalhadas > 40) {
            float horaExtra = (horasTrabalhadas - 40); 
            valorHoraExtra = horaExtra* (valorHora * 1.5f);
        }
        
        return valorHoraExtra;
    }
    
  
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

    public float inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

            //aliquota -= salario; 
            return aliquota;
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            return aliquota;

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            //aliquota -= salario; 

             return aliquota;

        } else {
            aliquota = 14.00f * 100;
            //aliquota -= salario; 
             return aliquota;
        }

    }

    public double valeTransporte(double salario){

       float vt = (float) (salario * 0.06f);
  
       return vt;
    
    }

    public float valeRefeicao(float salario) {
        float vr = salario * 0.03f;
        if (salario <= 1412){
            return 0;
        }else {
            return vr;
        }
    }

    public float convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            return 0;
        } else {
            return convenio;

        }

    }

    public float valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
        if (salario <= (1412 * 3)) {
          return 0;
                  
        } else {
            
           return va;

        }
        
      
    }
    
}
