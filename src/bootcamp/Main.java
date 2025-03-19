package bootcamp;

public class Main {
   public static void main(String[] args) {
       // Criação do curso1
       Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("descrição curso java");
       curso1.setCargaHoraria(8);

       // Criação do curso2
       Curso curso2 = new Curso();
       curso2.setTitulo("curso logica");
       curso2.setDescricao("descrição curso de logica");
       curso2.setCargaHoraria(5);

       // Exibição dos cursos
       System.out.println(curso1);
       System.out.println(curso2);
   }
}

