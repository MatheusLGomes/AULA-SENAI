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
public class ProfessosDeEngenharia extends Funcionario {
    private String CREA;

    public ProfessosDeEngenharia() {
    }

    public ProfessosDeEngenharia(int id, String nome, int idade, Setores setor, Genero genero) {
        super(id, nome, idade, setor.ACADEMICO, genero);
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "\n Id: " + super.id + "\nNome: " + super.nome + 
                "\nIdade: " + super.idade + "\nGênero: " + super.genero;
    }
    
    
}
