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
public class ProfessorDeNutriĆ§ao extends Funcionario {
    private String CRN;

    public ProfessorDeNutriĆ§ao() {
    }

    public ProfessorDeNutriĆ§ao(int id, String nome, int idade, Setores setor, Genero genero) {
        super(id, nome, idade, setor.ACADEMICO, genero);
    }

    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }
    
    @Override
    public String toString() {
        return "\nID: " + super.id + "\n nome: " + super.nome +
                "\nIdade: " + super.idade +"\nGenero: " + super.genero;
    }
}
