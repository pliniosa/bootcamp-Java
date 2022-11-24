import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Java");
        curso.setDescricao("Descricao do curso");
        curso.setCargaHoraria(21);

        mentoria.setTitulo("Java");
        mentoria.setDescricao("Descricao do curso");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);


    }
}
