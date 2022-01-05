import dominio.Curso;
import dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
            curso1.setTitulo("java Orientada a Objetos");
            curso1.setDescricao("neste curso, ensinaremos todos os conceitos de POO");
            curso1.setCargaHoraria(40);
        Mentoria mentoria1 = new Mentoria();
            mentoria1.setTitulo("boas praticas de programação");
            mentoria1.setDescricao(
                "nesta mentoria, os experts irão bater um papo sobre as boas praticas " 
                +"na programação, e os beneficios de um codigo limpo.");

        System.out.println(curso1);
        System.out.println(mentoria1);

    }
}