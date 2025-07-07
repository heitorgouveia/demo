package mockito.com.example;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String documento;
    private LocalDate nascimento;
    private String endereco;

    public Pessoa (final String nome, final String documento, final LocalDate nascimento){
        this.nome= nome;
        this.documento = documento;
        this.nascimento = nascimento;

    }
    
}
