import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Objetos
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        
        //Polimorfismo
        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        Dev devPlinio = new Dev();

        //Atribuindo Valor
        curso.setTitulo("Java");
        curso.setDescricao("Descricao do curso");
        curso.setCargaHoraria(21);

        //Atibuindo Valor
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Descricao do curso");
        mentoria.setData(LocalDate.now());

        //Atribuindo Valor
        bootcamp.setNome("Nome do BootCamp");
        bootcamp.setDescricao("Descrição do BootCamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        //Atribuindo Valor
        devPlinio.setNome("Plinio");
        devPlinio.inscreverBootcamp(bootcamp);
        devPlinio.progredir();

        //Monstrando o toString de cada objeto
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(conteudo);
        System.out.println(devPlinio.getConteudosInscritos());
        System.out.println(devPlinio.getConteudosConcluidos());
        devPlinio.progredir();
        System.out.println(devPlinio.getConteudosInscritos());
        System.out.println(devPlinio.getConteudosConcluidos());

    }
}
