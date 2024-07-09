import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligação...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void atualizarAba() {
        System.out.println("Atualizando aba do navegador...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador...");
    }

    // Método principal para testar a classe Iphone
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando métodos de ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Testando métodos de AparelhoTelefonico
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.ligar();

        // Testando métodos de NavegadorInternet
        iphone.atualizarAba();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
    }
}
