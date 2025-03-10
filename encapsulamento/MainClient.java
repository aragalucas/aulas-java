public class MainClient {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();

        cliente1.setNome(nome:"Marta");
        cliente1.setEmail(email: "Marta@gmail.com");
        cliente1.setSenha(senha:"123");

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getEmail());
        System.out.println(liente1.getSenha());

        Cliente cliente2 = new Cliente(nome:"jose", email:"jose@gmail.com", senha:"321");
        System.out.println(cliente2.toString());
    }
}