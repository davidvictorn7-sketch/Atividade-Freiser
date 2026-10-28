public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new Professor("Ana", 3000, "POO");
        funcionarios[1] = new Coordenador("Bruno", 4500, "Pedagogico");

        for (Funcionario f : funcionarios) {
            System.out.println(f.descrever());
        }

        System.out.println(funcionarios[0].bonificacao());
        System.out.println(funcionarios[0].bonificacao(20));
    }
}