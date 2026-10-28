public class Transporte {
    protected String linha;

    public Transporte(String linha) {
        this.linha = linha;
    }

    public String anunciar() {
        return "Linha " + linha;
    }

    public String lotacao(int ocupantes) {
        return "Ocupantes: " + ocupantes;
    }

    public String lotacao(int ocupantes, int capacidade) {
        if (ocupantes <= capacidade) {
            return "Viagem liberada";
        } else {
            return "Lotacao excedida";
        }
    }
}