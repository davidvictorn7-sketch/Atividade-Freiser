public class Principal {
    public static void main(String[] args) {
        Imovel[] imoveis = new Imovel[2];
        imoveis[0] = new Casa("Rua A, 10", 80, 3);
        imoveis[1] = new Apartamento("Rua B, 200", 60, 5);

        for (Imovel i : imoveis) {
            System.out.println(i.descrever());
        }

        System.out.println(imoveis[0].valorEstimado(3000));
        System.out.println(imoveis[0].valorEstimado(3000, 2000));
    }
}