public class Principal {
    public static void main(String[] args) {
        Publicacao[] pub = new Publicacao[2];
        pub[0] = new Livro("Dom Casmurro", 1899, 256);
        pub[1] = new Revista("Ciencia Hoje", 2024, 301);

        for (Publicacao p : pub) {
            System.out.println(p.citar());
        }

        System.out.println(pub[0].emprestar(7));
        System.out.println(pub[0].emprestar(7, "Ana"));
    }
}