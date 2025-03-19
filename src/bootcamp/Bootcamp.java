package bootcamp;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}