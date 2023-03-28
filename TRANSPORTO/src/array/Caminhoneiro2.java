
package array;

import model.*;

public class Caminhoneiro2 {
    private String nome;
    private String cnpj;
    private String CPf;
    private double salario; 
    
    public Caminhoneiro2(String nome, String cnpj, String CPF, double salario){
        this.nome= nome;
        this.cnpj= cnpj;
        this.CPf= CPf;
        this.salario= salario;
    }

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
