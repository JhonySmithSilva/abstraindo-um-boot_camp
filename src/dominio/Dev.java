package dominio;

import java.io.Serial;

public class Dev {

    String nome;
    String sobrenome;
    Serial ID;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {        
        return super.toString();
    }
    
}
