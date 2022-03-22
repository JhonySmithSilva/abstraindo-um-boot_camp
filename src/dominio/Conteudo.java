package dominio;

/**
 * esta classe é responsavel por criar toda a parte de conteudo 
 * que será ministrado no bootCamp.
 * tal conteudo pode ser um curso ou uma mentoria.
*@author Jonatas
*/ 
public abstract class Conteudo {

   protected static final double XP_PADRAO = 10;

   private String titulo;
   private String descricao;

   public abstract double calcularXp();
   
    /**
     * retorna o titulo do conteudo
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * atribui um titulo ao conteudo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * retorna  uma descrição do conteudo
     * @return String
     */
   public String getDescricao() {
       return descricao;
   }

   /**
    * atribui uma descrição ao conteudo
    * @param descricao
    */
   public void setDescricao(String descricao) {
       this.descricao = descricao;
   }
    
}
