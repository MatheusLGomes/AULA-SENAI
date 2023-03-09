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
public abstract class Funcionario {

    protected int id;
    protected String nome;
    protected int idade;
    protected Setores setor;
    protected Genero genero;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, int idade, Setores setor, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Setores getSetor() {
        return setor;
    }

    public void setSetor(Setores setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}