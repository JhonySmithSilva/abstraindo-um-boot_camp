import dominio.BootCamp;
import dominio.Curso;
import dominio.Mentoria;

/**
 * esta classe é responsavel por montar toda a estrutura do bootCamp
 * de uma forma bem simples.
*@author Jonatas
*/ 
public class Main{
    public static void main(String[] args) {

        //criando os conteudos
        Curso java1 = new Curso();
        java1.setTitulo("preparandoo ambiente de desenvolvimento java");
        java1.setDescricao(
            "neste curso, ensinaremos todos os passos \n" + 
            "para configurar sua maquina para programar em java");
        java1.setCargaHoraria(2);

        Curso java2 = new Curso();
        java2.setTitulo("Helo World");
        java2.setDescricao(
            "neste curso, falaremos um pouco sobre os conceitos basicos \n" + 
            "para criar o seu primeiro programa em java");
        java2.setCargaHoraria(1);

        Curso java3 = new Curso();
        java3.setTitulo("Variaveis e Constantes");
        java3.setDescricao(
            "neste curso, falaremos um pouco sobre Variaveis e Constantes \n" + 
            "e quais as boas praticas para usar-las em java");
        java3.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
            mentoria1.setTitulo("boas praticas de programação");
            mentoria1.setDescricao(
                "nesta mentoria, os experts irão bater um papo sobre as boas praticas " 
              +"na programação, e os beneficios de um codigo limpo.");

        //criando um bootcamp      

        BootCamp bootcampJava1 = new BootCamp();
        bootcampJava1.setNome("Java Basico Para Não Iniciados");
        bootcampJava1.setDescricao(
            "\t Este bootcamp é destinado a \n" +
            "quem não tem nenhum conhecimento na area de programação \n" +
            "bem como a estudantes que estão no inicio de seus conhecimentos \n" +
            "na linguagem de programação Java."
            );
        bootcampJava1.getConteudos().add(java1);
        bootcampJava1.getConteudos().add(java2);
        bootcampJava1.getConteudos().add(java3);
        bootcampJava1.getConteudos().add(mentoria1);
    }
}