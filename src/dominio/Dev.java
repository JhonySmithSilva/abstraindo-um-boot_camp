package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * esta classe é responsavel por pegar as informações 
 * do aluno de uma forma estruturada
*@author Jonatas
*/ 
public class Dev extends BootCamp {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(){
        
    }
    /**
     * retorna o nome do aluno
     * @return String
     */
    public String getNome() {
        return nome;
    }
    /**
     * atribui um nome ao aluno
     * @param String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * este metodo é responsavel por atribuir um bootCamp ao aluno
     * @param bootcamp
     */
    public void inscreverBootcamp(BootCamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * este metodo gerencia a progreção do aluno no bootCamp,
     * sempre que um aluno termina um conteudo, este metodo 
     * comola este conteudo como conluido
     * obs.: caso o aluno não esteja matriculado em nenhum curso
     * retorna-se uma mensagem de erro informando que o mesmo
     * não se encontra matriculado em nenum curso.
     * 
     * @param
     * @return
     */
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println(" você não está matriculado em nenhum conteudo! ");
        }
    }
    /**
     * calcula o total do XP que o aluno tem no BootCamp
     * @return double
     */
    public double calcularTotalXp(){
        return this.conteudosConcluidos
            .stream()
            .mapToDouble(Conteudo::calcularXp)
            .sum();
    }
    /**
     * retorna uma lista de conteudos em que o aluno está inscrito
     * @return Set<Conteudo>
     */
    public Set<Conteudo> getConteudosInscritos(){
        return this.conteudosInscritos;
    }
    /**
     * atribui ao aluno uma lista de conteudos inscrito
     * @param conteudosInscritos
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;
    }
    /**
     * retorna uma lista de conteudos em que o aluno já concluiu
     * @return Set<Conteudo>
     */
    public Set<Conteudo> getConteudosConcluidos(){
        return this.conteudosConcluidos;
    }
    /**
     * atribui ao aluno uma lista de conteudos concluidos
     * @param conteudosInscritos
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }
    /**
     * @param Object
     * @return boolean
     */
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
    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
    /**
     * @return String
     */
    @Override
    public String toString() {
        return nome;
    }    
    
}
