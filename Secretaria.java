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
public class Secretaria extends Funcionario {

    /**
     *
     */
    public Secretaria() {
    }

    public Secretaria(int id, String nome, int idade, Genero genero) {
        super(id, nome, idade, Setores.SECRETARIA, genero);
    }

    @Override
    public String toString() {
        return "\nId: " + super.id + "\nNome: " + super.nome +
                "\n Idade: " + super.idade + "\nGenero: " + super.genero;
    }
     
    
    
 
}
