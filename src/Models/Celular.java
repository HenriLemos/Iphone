package Models;

public class Celular implements Reprodutor, Iphone, Internet {

// Reprodutor
    private boolean tocando = false;
    private int musicaAtual = 0;

    @Override
    public void tocar() {
        tocando = true;
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        tocando = false;
        System.out.println("Música Pausada");
    }

    @Override
    public void parar() {
        tocando = false;
        System.out.println("Música parada");
    }

    @Override
    public void proxima() {
        musicaAtual++;
        System.out.println("Tocando proxima faixa");
    }

    @Override
    public void voltar() {
        if(musicaAtual > 0) {
            musicaAtual--;
            System.out.println("Tocando faixa anterior");
        } else {
            System.out.println("Voce esta na primeira faixa");
        }
    }

// Ligacao

    @Override
    public void Realizarligacao(String numero) {
        System.out.println("Ligando para o numero" + numero);
    }

    @Override
    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligacao do numero" + numero);
    }

    @Override
    public void terminarLigacao() {
        System.out.println("Ligacao encerrada");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para o numero" + numero + ":" + mensagem);
    }

    @Override
    public void receberMensagem(String numero, String mensagem) {
        System.out.println("Mensagem recebida do numero" + numero + ":" + mensagem);
    }

    // Navegador de Internet

    @Override
    public void buscarPagina(String busca) {
        System.out.println("Abrindo página: " + busca);
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Fechando a página." + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Realizando busca por: ");
    }
}