public class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String descrever() {
        return "Item: " + nome;
    }

    public double total() {
        return preco;
    }

    public double total(int unidades) {
        return preco * unidades;
    }
}