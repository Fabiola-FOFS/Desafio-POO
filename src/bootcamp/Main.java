package bootcamp;

import java.time.LocalDate;

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

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria UX");
       mentoria.setDescricao("descrição mentoria de UX");
       mentoria.setCargaHoraria(7);
       mentoria.setData(LocalDate.now()); // vai atribuir a data da criação do objeto

       //Conteudo conteudo = new Curso(); // polimorfismo tudo o que tem em Conteudo terá em curso



       // Exibição dos cursos
       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);
   }
}

