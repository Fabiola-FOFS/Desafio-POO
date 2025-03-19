package bootcamp;
import java.time.LocalDate;

public class Mentoria {
    private String titulo; // Adicione o tipo String
    private String descricao;
    private int cargaHoraria;
    private LocalDate data;

    private static final double XP_PADRAO = 10.0;

    // Construtor vazio
    public Mentoria() {
    }

    // Método para calcular XP
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    // Getters e Setters
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }
}