
package funcionario;


public class Funcionario {
   
    //Classe com os dados do funcionario utiliazdo como um Array Tipado
    //Também possuindo metodos Getters and Setters
    
    private String nome;
    private String cargo;
    private float salario;
    private float horasTrabalhadas;
    
    public Funcionario(){
        
    }
     
    public Funcionario(float horasTrabalhadas){
        this.horasTrabalhadas = 40f;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
