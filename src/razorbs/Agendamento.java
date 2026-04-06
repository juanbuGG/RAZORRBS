public class Agendamento {
    private int id;
    private String data;
    private String hora;

    private Cliente cliente;
    private Servico servico;
    private Profissional profissional;

    public Agendamento(String data, String hora, Cliente cliente, Servico servico, Profissional profissional) {
        this.data = data;
        this.hora = hora;
        this.cliente = cliente;
        this.servico = servico;
        this.profissional = profissional;
    }

    public void mostrarAgendamento() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Profissional: " + profissional.getNome());
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }
}