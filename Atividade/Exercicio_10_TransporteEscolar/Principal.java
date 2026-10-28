public class Principal {
    public static void main(String[] args) {
        Transporte[] transportes = new Transporte[2];
        transportes[0] = new Van("Centro", 15);
        transportes[1] = new OnibusEscolar("Bairro", 2);

        for (Transporte t : transportes) {
            System.out.println(t.anunciar());
        }

        System.out.println(transportes[0].lotacao(12));
        System.out.println(transportes[0].lotacao(12, 15));
    }
}