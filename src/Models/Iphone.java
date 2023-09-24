package Models;

public interface Iphone {
    void Realizarligacao(String numero);
    void receberLigacao(String numero);
    void terminarLigacao();

    void enviarMensagem(String numero, String mensagem);
    void receberMensagem(String numero, String mensagem);
}
