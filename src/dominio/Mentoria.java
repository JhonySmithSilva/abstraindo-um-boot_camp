package dominio;

import java.time.LocalDate;

/**
 * esta classe extende conteudo, e nela criamos as mentorias 
 * que serão ministradas no bootCamp
*@author Jonatas
*/ 
public class Mentoria extends Conteudo{
   
    private LocalDate dataDeCriacao;
    
    public Mentoria(){

    }
    /**
     * retorna a data em que a mentoria foi criada/ministrada
     * @return LocalDate
     */
    public LocalDate getDataDeCriancao(){
        return dataDeCriacao;
    }
    /**
     * atribui uma data de criação/ministração da mentoria
     * apartir da data local do usuário
     * @param data
     */
    public void setDataDeCriancao(LocalDate data){
        this.dataDeCriacao = data;
    }  
    /**
     * este metodo calcula o xp total que o aluno ganhou. 
     * este calculo é feito sempre que o aluno termina ua mentoria
     * @return double
     */
    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }
    /**
     * monta uma estrutura de strings com as informações referente 
     * a mentoria.
     * @return String
     */
    @Override
    public String toString() {
        return  "Mentoria {" +
                    " titulo = " + getTitulo() + 
                    " descrição = " + getDescricao() + 
                    " data = " + getDataDeCriancao() + 
                    " }";
    }
}
