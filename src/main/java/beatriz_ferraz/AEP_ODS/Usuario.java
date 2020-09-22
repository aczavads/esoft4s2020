package beatriz_ferraz.AEP_ODS;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        setNome(nome);
        setSenha(senha);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() == 0 || nome.trim().split(" ").length < 2) {
            throw new RuntimeException("O nome deve conter duas palavras.");
        }
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.trim().length() < 6 ) {
            throw new RuntimeException("Senha deve ter ao menos 6 caracteres.");
        }
        this.senha = senha;
    }
}
