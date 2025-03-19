package bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ // extendex para tornar ela filha da classe conteudo
// Atributos da classe

    private int cargaHoraria;
    private LocalDate data;


     // Método para calcular XP
     @Override
     public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    // Construtor vazio
    public Mentoria() {
    }

   
    // Getters e Setters
    
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

    // Método toString para representação em string do objeto
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }
}