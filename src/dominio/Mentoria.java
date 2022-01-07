package dominio;

import java.time.LocalDate;

/**
*@author Jonatas
*/ 
public class Mentoria extends Conteudo{
   
    private LocalDate dataDeCriacao;
    
    public Mentoria(){

    }

    public LocalDate getDataDeCriancao(){
        return dataDeCriacao;
    }
    public void setDataDeCriancao(LocalDate data){
        this.dataDeCriacao = data;
    }  
    
    @Override
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
