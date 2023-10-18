public class biblioteca {
    private itemBiblioteca itens[];

    public biblioteca() {
        this.itens = new itemBiblioteca[10];
    }

    public itemBiblioteca[] getItens() {
        return itens;
    }


    public void imprimirDetalhes(){
        for (itemBiblioteca item : itens) {
            item.imprimirDetalhes();
        }
    }

    public double calcularPrecoAluguel(){
        double preco = 0;
         for (itemBiblioteca item : itens) {
            preco += item.calcularPrecoAluguel();
        }
        return preco;
    }
       
}

