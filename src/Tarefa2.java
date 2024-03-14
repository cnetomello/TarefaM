public class Tarefa2 {
    private String titulo;
    private String artista;
    private int duracao; // duração em segundos

    public Tarefa2(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracao + " segundos)";
    }

    public static void main(String[] args) {
        Tarefa2[] listaMusicas = {
                new Tarefa2("Bohemian Rhapsody", "Queen", 354),
                new Tarefa2("Hotel California", "Eagles", 391),
                new Tarefa2("Stairway to Heaven", "Led Zeppelin", 482)
        };

        for (Tarefa2 musica : listaMusicas) {
            System.out.println(musica);
        }
    }
}
