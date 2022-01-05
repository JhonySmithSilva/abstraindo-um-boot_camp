package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev extends BootCamp {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(){
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(BootCamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}

    public Set<Conteudo> getConteudosInscritos(){
        return this.conteudosInscritos();
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos(){
        return this.conteudosConcluidos();
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj) return false;
        Dev dev = (Dev) obj;
        return 
            Objects.equals(nome, dev.nome) && 
            Objects.equals(conteudosInscritos, dev.conteudosInscritos) && 
            Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
