public class livro extends itemBiblioteca implements imprimivel{

    private int numPaginas;

    public livro(String titulo, int anoPublicacao, int numCopias, int numPaginas){
        super(titulo, anoPublicacao, numCopias);
        this.numPaginas = numPaginas;
    }
    @Override
    public void imprimirDetalhes(){
        System.out.println(
            "Titulo: "+getTitulo()+"\n"+
            "Ano Publicação: "+getAnoPublicacao()+"\n"+
            "Número de cópias dispomíveis: "+getNumCopias()+"\n"+
            "Número de paginas: "+getNumPaginas()+"\n"
        );
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public double calcularPrecoAluguel(){
        double preco = 0.25 * getNumPaginas();
        return preco;
    }
}

    