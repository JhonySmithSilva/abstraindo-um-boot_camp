package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    final private LocalDate DATA_DE_INICIO = LocalDate.now();
    final private LocalDate DATA_FINAL = LocalDate.now().plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  

    public Set<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj) return false;
        BootCamp bootcamp = (BootCamp) obj;
        return 
            Objects.equals(nome, bootcamp.nome) && 
            Objects.equals(descricao, bootcamp.descricao) && 
            Objects.equals(DATA_DE_INICIO, bootcamp.DATA_DE_INICIO) &&
            Objects.equals(DATA_FINAL, bootcamp.DATA_FINAL) &&
            Objects.equals(devsInscritos, bootcamp.getDevsInscritos()) &&
            Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, DATA_DE_INICIO, DATA_FINAL, devsInscritos, conteudos);
    }

}
