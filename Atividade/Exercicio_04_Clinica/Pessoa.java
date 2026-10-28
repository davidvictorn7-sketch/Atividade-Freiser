public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String ficha() {
        return "Pessoa: " + nome;
    }

    public String agendar(String data) {
        return "Consulta em " + data;
    }

    public String agendar(String data, String hora) {
        return "Consulta em " + data + " as " + hora;
    }
}