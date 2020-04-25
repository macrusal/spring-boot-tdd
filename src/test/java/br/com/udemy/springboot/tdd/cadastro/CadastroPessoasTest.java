package br.com.udemy.springboot.tdd.cadastro;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * @author macrusal on 24/04/20
 * @project spring-boot-tdd
 */
public class CadastroPessoasTest {

    @Test
    public void deveCriiarCadastroDePessoas() {
        //cenario e execucao
        CadastroPessoas cadastro = new CadastroPessoas();

        //verificacao
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    public void deveAdicionarUmaPessoa() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcelo");

        //execucao
        cadastroPessoas.adicionar(pessoa);

        //verificacao
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test(expected = PessoaSemNomeException.class)
    public void naoDeveAdicionarPessoaComNomeVazio() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execucao
        cadastroPessoas.adicionar(pessoa);
    }

    @Test
    public void deveRemoverUmaPessoa() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcelo");
        cadastroPessoas.adicionar(pessoa);

        //execucao
        cadastroPessoas.remover(pessoa);

        //verificacao
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();

    }

    @Test(expected = CadastroVazioException.class)
    public void deveLancarErroRemoverUmaPessoaQueNaoExiste() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execucao
        cadastroPessoas.remover(pessoa);
    }
}
