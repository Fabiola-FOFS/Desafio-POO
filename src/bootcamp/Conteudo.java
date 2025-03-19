package bootcamp;

public abstract class Conteudo { // Declarada como abstrata
    public static final double XP_PADRAO = 10; // Constante para cálculo de XP
// static para poder acessar fora da classe, final indicar que é uma constante

    private String titulo;
    private String descricao;

    public abstract double calcularXp(); // classe conteudo criada para implementar os atributos repetidos na classes filhas, isso é herança

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
