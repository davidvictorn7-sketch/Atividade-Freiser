public class Principal {
    public static void main(String[] args) {
        Ingresso[] ingressos = new Ingresso[2];
        ingressos[0] = new MeiaEntrada("Divertida Mente", 40, "carteira 123");
        ingressos[1] = new Vip("Duna", 40, "A");

        for (Ingresso i : ingressos) {
            System.out.println(i.valorFinal());
        }

        System.out.println(ingressos[0].resumo());
        System.out.println(ingressos[0].resumo(true));
    }
}