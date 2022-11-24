package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    // Atributos
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataInicial(){
        return dataInicial;
    }

    public LocalDate getDataFinal(){
        return dataFinal;
    }

    public Set<Dev> getDevInscritos(){
        return devsIncritos;
    }

    public void setDevInscritos(Set<Dev> dev){
        this.devsIncritos = dev;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

/*
    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if( o == null || getClass() != o.getClass()){
            return false;
        }
        Dev bootcamp = (Dev) o;
        return Object.equals(nome, bootcamp.nome) && Object.equals(descricao, bootcamp.descricao) && Object.equals(dataInicial, bootcamp.dataInicial) && Object.equals(dataFinal, bootcamp.dataFinal) && Object.equals(devsIncritos, bootcamp.devsIncritos) && Object.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode(){
        return Object.hash(nome, descricao, dataInicial, dataFinal, devsIncritos, conteudos);
    }
*/

}
