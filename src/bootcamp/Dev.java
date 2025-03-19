package bootcamp;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}