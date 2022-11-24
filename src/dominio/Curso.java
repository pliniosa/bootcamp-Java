package dominio;

public class Curso extends Conteudo {

    // Atributos da classe
    private int cargaHoraria;

    // Construtor da classe
    public Curso() {

    }

    // Implementado os dados herdados
    @Override
    public double calcularExp() {
        return EXP_PADRAO * cargaHoraria;
    }

    //Get e Set dos atributos da classe
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Override da mensagem que sera impressa ao chamar o objeto criado
    @Override
    public String toString() {
        return "Curso{" + "Titulo='" + getTitulo() + '\'' + ", Descricao='" + getDescricao() + '\'' + ", Carga Horaria="
                + cargaHoraria + '}';
    }

}
