import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        // Objetos
        Curso curso = new Curso("Java", "Descricao do curso", 10);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descricao da Mentoria");

        Bootcamp bootcamp = new Bootcamp("Nome do BootCamp", "Descrição do BootCamp", curso, mentoria);
        Dev devPlinio = new Dev("Plinio", bootcamp);

        // Polimorfismo
        // Conteudo conteudo = new Curso();

        // Monstrando o toString de cada objeto
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(devPlinio.getConteudosInscritos());
        System.out.println(devPlinio.getConteudosConcluidos());
        System.out.println("Experiencia total: " + devPlinio.calcularExp());

        devPlinio.progredir();

        // Monstrando o toString de cada objeto
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(devPlinio.getConteudosInscritos());
        System.out.println(devPlinio.getConteudosConcluidos());
        System.out.println("Experiencia total: " + devPlinio.calcularExp());
        devPlinio.progredir();
        System.out.println(devPlinio.getConteudosInscritos());
        System.out.println(devPlinio.getConteudosConcluidos());
        System.out.println("Experiencia total: " + devPlinio.calcularExp());

    }
}
