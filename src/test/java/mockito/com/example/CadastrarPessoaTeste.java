package mockito.com.example;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarCadastro(){

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("GO", "Ocidental", "Quadra", "Lote7", "EstrelaDalva");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("7037")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Heitor", "029878", LocalDate.now(), "7037");

        assertEquals("Heitor", pessoa.getNome());
        assertEquals("029878", pessoa.getDocumento());
        assertEquals("7037", pessoa.getEndereco());


    }
    
}
