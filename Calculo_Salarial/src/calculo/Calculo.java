
package calculo;





public class Calculo {
    
    public float bonus (float salario){
        float bonus = salario*0.05f;
        return salario + bonus;
    }

    public float horaExtra (float salario, float horasTrabalhadas){
        float valorHora = salario/160;
        float valorHoraExtra = 0f;
        
        if (horasTrabalhadas > 40) {
            float horaExtra = (horasTrabalhadas - 40); 
            valorHoraExtra = horaExtra* (valorHora * 1.5f);
        }
        
        return salario + valorHoraExtra;
    }
    
    public float irpf(float salario) {
       
        float reducao;
        if (salario <= 2112) {
           
        return salario;
        } else if (salario >= 2112.01 && salario <= 2826.65) {

            reducao = 158.40f;
            salario -= reducao;

            return salario;
        } else if (salario >= 2826.66 && salario <= 3751.05) {

            reducao = 370.40f;
            salario -= reducao;

            return salario;

        } else if (salario >= 3751.06 && salario <= 4664.68) {

            reducao = 651.73f;
            salario -= reducao;

            return salario;

        } else {
            reducao = 884.96f;
            salario -= reducao;

             
            return salario;
        }

    }

    public float inss(float salario) {
        
        float aliquota;
        if (salario <= 1412) {

            aliquota = 7.50f * 100;

            salario -= aliquota;
            return salario;
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            aliquota = 9.00f * 100;
            salario -= aliquota;

            return salario;

        } else if (salario >= 2666.69 && salario <= 4000.03) {

            aliquota = 12.00f * 100;
            salario -= aliquota;

             return salario;

        } else {
             aliquota = 14.00f * 100;
            salario -= aliquota;

             return salario;
        }

    }

    public float valeTransporte(float salario){

       float vt = salario * 0.06f;
       salario = salario - vt;
       return salario;
    
    }

    public float valeRefeicao(float salario) {
        float vr = salario * 0.03f;
        if (salario <= 1412){
            return salario;
        }else {
            salario -= vr;
            return salario;
        }
    }

    public float convenioMedico(float salario) {

        float convenio = salario * 0.04f;
        if (salario <= 1412) {
            return salario;
        } else {
            salario = salario - convenio;
            return salario;

        }

    }

    public float valeAlimentacao(float salario) {

        float va  = salario * 0.04f;
        if (salario <= (1412 * 3)) {
          return salario;
                  
        } else {
            
           salario -= va;
           return salario;

        }
        
      
    }
    

}
