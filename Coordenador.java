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
public class Coordenador extends Funcionario {

    public Coordenador() {
    }

    public Coordenador(int id, String nome, int idade, Setores setor, Genero genero) {
        super(id, nome, idade, setor.ACADEMICO, genero.Feminino);
    }

    @Override
    public String toString() {
        return "\n Id: " + super.id + "\n Nome: " + super.nome +
                "\nIdade: " + super.idade + "\nGenêro: " + super.genero;
    }
    
    
}
