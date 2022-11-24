import java.time.LocalDate;

import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Objetos
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        
        //Polimorfismo
        Conteudo conteudo = new Curso();

        //Atribuindo Valor
        curso.setTitulo("Java");
        curso.setDescricao("Descricao do curso");
        curso.setCargaHoraria(21);

        //Atibuindo Valor
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Descricao do curso");
        mentoria.setData(LocalDate.now());

        //Monstrando o toString de cada objeto
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(conteudo);


    }
}
