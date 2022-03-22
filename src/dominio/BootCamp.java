package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * esta classe cria uma abstração de um bootCamp
*@author Jonatas
*/ 
public class BootCamp {
    private String nome;
    private String descricao;
    final private LocalDate DATA_DE_INICIO = LocalDate.now();
    final private LocalDate DATA_FINAL = LocalDate.now().plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
     * retorna o nome do bootCamp
     * @return String
     */
    public String getNome() {
        return this.nome;
    }
    
    /**
     * atribui um nome ao bootCamp
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * retorna uma descrição sobre o bootCamp
     * @return String
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * atribui uma descrição sobre o bootCamp
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  

    /**
     * retorna uma lista de alunos inscritos no bootCamp
     * @return List
     */
    public Set<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    /**
     * atribui uma lista de alunos inscrito no bootCamp
     * @param List
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * retorna uma lista de cursos que formam a trilha de conhecimento do bootCamp
     * @return List
     */
    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    /**
     * atribui cursos ao bootCamp
     * @param conteudos
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    

    /**
     * @param Object
     * @return Boolean
     */
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
    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, DATA_DE_INICIO, DATA_FINAL, devsInscritos, conteudos);
    }

}
