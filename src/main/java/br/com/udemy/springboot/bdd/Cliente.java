package br.com.udemy.springboot.bdd;

/**
 * @author macrusal on 25/04/20
 * @project spring-boot-tdd
 */
public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Gets nome
     *
     * @return value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets cpf
     *
     * @return value of cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
