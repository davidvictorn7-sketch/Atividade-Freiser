public class Principal {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];
        produtos[0] = new Caderno("Universitario", 20, 96);
        produtos[1] = new Caneta("Bic", 5, "azul");

        for (Produto p : produtos) {
            System.out.println(p.descrever());
        }

        System.out.println(produtos[0].precoComDesconto(10));
        System.out.println(produtos[0].precoComDesconto(90, 8));
    }
}