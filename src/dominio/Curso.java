package dominio;

/**
 * esta classe extende conteudo, e nela criamos os cursos 
 * que serão ministrados no bootCamp
*@author Jonatas
*/ 
public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){

    }

    /**
     * retorna um valor inteiro que representa a carga horaria 
     * do curso em horas.
     * @return int
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    /**
     * atribui uma quantidade de horas que o curso tem de duração
     * @param cargaHoraria
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * este metodo calcula o xp total que o aluno ganhou. 
     * este calculo é feito sempre que o aluno termina um curso
     * @return double
     */
    @Override
    public double calcularXp(){
        return XP_PADRAO * getCargaHoraria();
    }
    /**
     * monta uma estrutura de strings com as informações referente 
     * ao curso.
     * @return String
     */
    @Override
    public String toString() {
        return  "Curso {" +
                    " titulo = " + getTitulo()  +
                    " descrição = " + getDescricao() +  
                    " carga horaria = " + getCargaHoraria() + 
                    " }";
    }
   
}
