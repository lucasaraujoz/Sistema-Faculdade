package Entidade;

public abstract class Pessoa {
    private String nome;
    private String codigo;
    private String email;
    private String cpf;

    public Pessoa(String nome, String codigo, String email, String cpf) {
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
