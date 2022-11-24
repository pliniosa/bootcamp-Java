package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    //Atributos da classe
    private LocalDate data;

    //Implementado os dados herdados
    @Override
    public double calcularExp(){
        return EXP_PADRAO + 20;
    }

    //Construtor da classe
    public Mentoria(){
        
    }

    //Get e Set dos atributos da classe
    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    //Override da mensagem que sera impressa ao chamar o objeto criado
    @Override
    public String toString(){
        return "Curso{" + "Titulo='" + getTitulo() + '\'' + ", Descricao='" + getDescricao() + '\'' + ", Data=" + data + '}';
    }

}
