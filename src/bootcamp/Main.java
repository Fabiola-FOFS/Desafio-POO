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

        // Criação da mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria UX");
        mentoria.setDescricao("descrição mentoria de UX");
        mentoria.setData(LocalDate.now()); // vai atribuir a data da criação do objeto

        // Conteudo conteudo = new Curso(); // polimorfismo: tudo o que tem em Conteudo terá em Curso

        // Exibição dos cursos (comentado)
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        // Criação do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp UX Developer");
        bootcamp.setDescricao("Descrição Bootcamp UX Enginier");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Inscrição e progresso do Dev "Fofs"
        Dev devFofs = new Dev();
        devFofs.setNome("Fofs");
        devFofs.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fofs: " + devFofs.getConteudosInscritos());
        devFofs.progredir();
        devFofs.progredir();
        devFofs.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fofs: " + devFofs.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fofs: " + devFofs.getConteudosConcluidos());
        System.out.println("XP total de Fofs: " + devFofs.calcularTotalXp());

        System.out.println("-------");

        // Inscrição e progresso do Dev "João"
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP total de João: " + devJoao.calcularTotalXp());
    }
}