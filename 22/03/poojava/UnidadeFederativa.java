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
public enum UnidadeFederativa {
ACRE("AC", "Acre"),
ALAGOAS("AL", "Alagoas"),
AMAPA("AP", "Amapá"),
AMAZONAS("AM", "Amazonas"),
BAHIA("BA", "Bahia"),
CEARA("CE", "Ceará"),
DISTRITO_FEDERAL ("DF", "Distrito Federal"),
ESPIRITO_SANTO ("ES", "Espirito Santo"),
GOIAS("GO", "Goiás"),
MARANHAO("MA", "Maranhão"),
MATO_GROSSO("MT", "Mato Grosso"),
MATO_GROSSO_DO_SUL ("MS", "Mato Grosso do Sul"),
MINAS_GERAIS("MG", "Minas Gerais"),
PARA("PA", "Para"),
PARAIBA ("PB", "Paraíba"),
PARANÁ ("PR", "Paraná"),
PERNAMBUCO ("PE", "Pernambuco"),
PIAUI("PI", "Piauí"),
RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
RIO_GRANDE_DO_NORTE ("RN", "Rio Grande do Norte"),
RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul"),
RONDONIA ("RO", "Rondônia"),
RORAIMA("RR", "Roraíma"),
SANTA_CATARINA ("SC", "Santa Catarina"),
SAO_AULO ("SP", "São Paulo"),
SERGIPE("SE", "SERGÍPE"),
TOCANTINS("TO", "Tocantis");


protected String nome;
protected String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

  
}
