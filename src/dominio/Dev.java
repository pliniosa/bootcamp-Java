package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    //Atributos do desenvolvedor
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>() ;
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>() ;

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Aluno não matriculado");
        }
    }

    public double calcularExp() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularExp()).sum();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos(){
        return this.conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos(){
        return this.conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
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
        Dev dev = (Dev) o;
        return Object.equals(nome, dev.nome) && Object.equals(conteudosInscritos, dev.conteudosInscritos) && Object.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode(){
        return Object.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
*/
}
