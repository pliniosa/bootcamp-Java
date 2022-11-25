package dominio;

public class Curso extends Conteudo {

    // Atributos da classe
    private int cargaHoraria;

    // Construtor da classe
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    // Implementado os dados herdados
    @Override
    public double calcularExp() {
        return EXP_PADRAO * cargaHoraria;
    }

    // Get e Set dos atributos da classe
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Override da mensagem que sera impressa ao chamar o objeto criado
    @Override
    public String toString() {
        return " Curso: " + getTitulo() + '\n' + " Descrição: " + getDescricao() + '\n' + " Carga Horaria: " + cargaHoraria;
    }

}
