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
public enum Genero {
    MASCULINO ('M' , "Masculino"),
    FEMININO('F' , "Feminino");
    
    protected char sexo;
    protected String Genero;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    private Genero(char sexo, String Genero) {
        this.sexo = sexo;
        this.Genero = Genero;
    }
    
}
