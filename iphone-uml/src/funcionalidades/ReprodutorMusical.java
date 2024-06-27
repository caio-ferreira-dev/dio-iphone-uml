package funcionalidades;

public class ReprodutorMusical {
    public void selecionarMusica(String musica) {
        System.out.printf("Música %d selecionada!", musica);
    }

    public void tocar() {
        System.out.println("Tocando música...");
    } 

    public void pausar() {
        System.out.println("Música pausada...");
    } 
}
