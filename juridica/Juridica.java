public class Juridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Getter para cnpj
    public String getCnpj() {
        return cnpj;
    }

    // Setter para cnpj
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Getter para inscricaoEstadual
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    // Setter para inscricaoEstadual
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Método toString
    @Override
    public String toString() {
        return "Juridica{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                '}';
    }
}
