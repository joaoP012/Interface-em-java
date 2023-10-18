public class App {
    public static void main(String[] args) throws Exception {
        biblioteca bb = new biblioteca();

        bb.getItens()[0] = new livro("HARRY POTTER", 1983, 5,  600);
        bb.getItens()[1] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[2] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[3] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[4] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[5] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[6] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[7] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[8] = new midiaEletronica("HARRY POTTER", 1983, 600);
        bb.getItens()[9] = new midiaEletronica("HARRY POTTER", 1983, 600);
        System.out.println(bb.calcularPrecoAluguel());
        bb.imprimirDetalhes();

    }
}
