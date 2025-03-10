public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Getter para cpf
    public String getCpf() {
        return cpf;
    }

    // Setter para cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para rg
    public String getRg() {
        return rg;
    }

    // Setter para rg
    public void setRg(String rg) {
        this.rg = rg;
    }

    // Getter para dataNascimento
    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setter para dataNascimento
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Fisica{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
