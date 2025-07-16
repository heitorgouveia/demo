package mockito.com.example;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class EnviarMensagem {
    

    private List<String> mensagens = new ArrayList<>();

    public void adicionarMensagem(String mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<String> getMensagens() {
        return Collections.unmodifiableList(this.mensagens);
    }

}
