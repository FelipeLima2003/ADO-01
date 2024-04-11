package pacote01;

public class Calculo {

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
            System.out.printf("O sal�rio � : R$ %.3f", salario);
        } else if (salario >= 1412.01 && salario <= 2666.68) {

            float aliquota = 9.00f *100;
            salario -= aliquota;

            System.out.printf("O sal�rio � : R$ %.3f", salario);
            
        } else if (salario >= 2666.69 && salario <= 4000.03) {

            float aliquota = 12.00f;
            salario -= aliquota;

            System.out.printf("O sal�rio � : R$ %.3f", salario);

        } else {
            float aliquota = 14.00f;
            salario -= aliquota;

            System.out.printf("O sal�rio � : R$ %.3f", salario);
        }
        
        
    }


}
