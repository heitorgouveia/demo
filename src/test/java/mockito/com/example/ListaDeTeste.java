package mockito.com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListaDeTeste {

    @Mock
    private List<String> letras;

    @Test
    public void adicionarItemNaLista(){

        Mockito.when(letras.get(0)).thenReturn("B");

        assertEquals("B", letras.get(0));

    }
    
}
