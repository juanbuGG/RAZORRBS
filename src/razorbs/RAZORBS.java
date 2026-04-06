public class RAZORBS {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "99999-9999");
        Servico servico = new Servico("Corte", 30.0);
        Profissional profissional = new Profissional("Carlos", "Barbeiro");

        Agendamento agendamento = new Agendamento(
                "10/04/2026",
                "14:00",
                cliente,
                servico,
                profissional
        );

        System.out.println("=== AGENDAMENTO ===");
        agendamento.mostrarAgendamento();
    }
}
