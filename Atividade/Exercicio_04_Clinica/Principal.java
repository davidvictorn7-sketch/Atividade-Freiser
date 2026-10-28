public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Paciente("Carla", "Unimed");
        pessoas[1] = new Medico("Diego", "Clinica");

        for (Pessoa p : pessoas) {
            System.out.println(p.ficha());
        }

        System.out.println(pessoas[0].agendar("12/10/2026"));
        System.out.println(pessoas[0].agendar("12/10/2026", "14:00"));
    }
}