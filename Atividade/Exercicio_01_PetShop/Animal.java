public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String descrever() {
        return "Animal: " + nome + ", " + idade + " anos";
    }

    public int idadeEmMeses() {
        return idade * 12;
    }

    public int idadeEmMeses(int mesesJaVividos) {
        return (idade * 12) + mesesJaVividos;
    }
}