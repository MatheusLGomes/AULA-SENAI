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
public class POOjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario funcionario1 = new Funcionario("06770699524","1604094893", "1955443", 1200, 1452, "Matheus", 22, Genero.MASCULINO, 
               new Endereco("Travessa", "10", "Casa", "40352020", "Salvador", UnidadeFederativa.BAHIA));
       
        System.out.println(funcionario1.toString());
    }
    
}
