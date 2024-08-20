public abstract class pessoa
{
    protected string nome;
    protected string telefone;
    protected string email;
    protected endereco endereco;
    public pessoa(string nome, string telefone, string email, endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public string getNome() {
        return nome;
    }
    public void setNome(string nome) {
        this.nome = nome;
    }
    public string getTelefone() {
        return telefone;
    }
    public void setTelefone(string telefone) {
        this.telefone = telefone;
    }
    public string getEmail() {
        return email;
    }
    public void setEmail(string email) {
        this.email = email;
    }
    public endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + "]";
    }

    
}