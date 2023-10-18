public abstract class itemBiblioteca {
    protected itemBiblioteca(String titulo, int anoPublicacao, int numCopias){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
    }
    private String titulo;
    private int anoPublicacao;
    private int numCopias;

    public abstract double calcularPrecoAluguel();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getNumCopias() {
        return numCopias;
    }
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
public void imprimirDetalhes(){
    
}
}