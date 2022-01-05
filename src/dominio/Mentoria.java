package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
   
    LocalDate dataDeCriacao;
    
    public Mentoria(){

    }

    public LocalDate getDataDeCriancao(){
        return dataDeCriacao;
    }
    public void setDataDeCriancao(LocalDate data){
        this.dataDeCriacao = data;
    }  
    
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return  "Mentoria {" +
                    " titulo = " + getTitulo() + 
                    " descrição = " + getDescricao() + 
                    " data = " + getDataDeCriancao() + 
                    " }";
    }
}
