package bootcamp;

public class Curso extends Conteudo{

    private int cargaHoraria;

   
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; //Ao concluir o curso o xp padrão vai ser multiplicado = regra de negocio
    }

   public Curso() {

   }
   
    // Getters e Setters
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
