public class Principal {
    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[2];
        atletas[0] = new Corredor("Lia", 10);
        atletas[1] = new Nadador("Paulo", "crawl");

        for (Atleta a : atletas) {
            System.out.println(a.apresentar());
        }

        System.out.println(atletas[0].registrarTempo(55.2));
        System.out.println(atletas[0].registrarTempo(58, "100m"));
    }
}