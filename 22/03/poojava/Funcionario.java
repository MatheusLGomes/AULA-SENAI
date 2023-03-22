/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojava;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Pessoa {
    private String cpf;
    private String rg;
    private String matricula;
    private double salario;

    
     public Funcionario() {
         
    }
    
    public Funcionario(String cpf, String rg, String matricula, double salario, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dados do funcionario: " + "\nNome: " + super.nome + "\nCPF: " + this.cpf + 
                "\nRG: " + this.rg + 
                "\nMatricula: " + this.matricula +
                "\nSalário: " + this.salario + "\nID: " + 
                super.id +  "\nIdade: " + super.idade + 
                "\nGênero: " + super.genero + "\nEndeeço: " 
                + super.endereco;
                
    }

   
    
    
}
