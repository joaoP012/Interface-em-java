public class midiaEletronica extends itemBiblioteca implements imprimivel{
 public midiaEletronica(String titulo, int anoPublicacao, int numCopias){
super(titulo, anoPublicacao, numCopias);
 } 

 @Override
    public void imprimirDetalhes(){
        System.out.println(
            "Titulo: "+getTitulo()+"\n"+
            "Ano Publicação: "+getAnoPublicacao()+"\n"+
            "Número de cópias dispomíveis: "+getNumCopias()+"\n"
        );
    }

 @Override
 public double calcularPrecoAluguel(){
    return 12.5;
 }

}