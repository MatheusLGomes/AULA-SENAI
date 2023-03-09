/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Aluno
 */
public class ProfessordeDireito extends Funcionario {
    private String OAB;

    public ProfessordeDireito() {
    }

    public ProfessordeDireito(int id, String nome, int idade, Setores setor, Genero genero) {
        super(id, nome, idade, setor.ACADEMICO, genero);
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }

    @Override
    public String toString() {
        return "\nID: " + super.id + "\n nome: " + super.nome +
                "\nIdade: " + super.idade +"\nGenero: " + super.genero;
    }
    
    
}
