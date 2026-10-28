public class Principal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro("Rex", 3, "Labrador");
        animais[1] = new Gato("Mia", 2, "curta");

        for (Animal a : animais) {
            System.out.println(a.descrever());
        }

        System.out.println(animais[0].idadeEmMeses());
        System.out.println(animais[0].idadeEmMeses(6));
    }
}