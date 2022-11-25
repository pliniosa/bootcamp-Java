package dominio;

public abstract class Conteudo {

    public static final double EXP_PADRAO = 10;

    // Atributos da classe
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Metodo a ser implementados nas classes filhas
    public abstract double calcularExp();

    // Get e Set dos atributos da classe
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
