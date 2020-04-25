package br.com.udemy.springboot.tdd.cadastro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author macrusal on 24/04/20
 * @project spring-boot-tdd
 */
public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void adicionar(Pessoa pessoa) {
        if(pessoa.getNome() == null) {
            throw new PessoaSemNomeException();
        }
        this.pessoas.add(pessoa);
    }

    public void remover(Pessoa pessoa) {
        if(pessoas.isEmpty()) {
            throw new CadastroVazioException();
        }
        this.pessoas.remove(pessoa);
    }
}
