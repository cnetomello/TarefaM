import java.util.ArrayList;

public class Tarefa1 {
    private String nome;
    private int anoLancamento;
    private ArrayList<String> musicas;

    // Construtor
    public Tarefa1(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = new ArrayList<String>();
    }

    public void adicionarMusica(String musica) {
        this.musicas.add(musica);
    }

    public void removerMusica(String musica) {
        this.musicas.remove(musica);
    }

    public void listarMusicas() {
        System.out.println("Músicas do álbum '" + this.nome + "' (" + this.anoLancamento + "):");
        for (String musica : this.musicas) {
            System.out.println(musica);
        }
    }

    public static void main(String[] args) {
        Tarefa1 album = new Tarefa1("The Dark Side of the Moon", 1973);

        album.adicionarMusica("Speak to Me");
        album.adicionarMusica("Breathe");
        album.adicionarMusica("On the Run");
        album.adicionarMusica("Time");
        album.adicionarMusica("The Great Gig in the Sky");

        album.listarMusicas();

        album.adicionarMusica("Money");
        album.removerMusica("On the Run");

        album.listarMusicas();
    }
}
