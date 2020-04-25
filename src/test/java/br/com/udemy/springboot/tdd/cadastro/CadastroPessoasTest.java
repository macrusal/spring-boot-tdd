package br.com.udemy.springboot.tdd.cadastro;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * @author macrusal on 24/04/20
 * @project spring-boot-tdd
 */
public class CadastroPessoasTest {

    @Test
    @DisplayName("Deve criar o cadastro de pessoas")
    public void deveCriarCadastroDePessoas() {
        //cenario e execucao
        CadastroPessoas cadastro = new CadastroPessoas();

        //verificacao
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    @DisplayName("Deve adicionar uma pessoas")
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

    @Test
    @DisplayName("Nao deve adicionar uma pessoa com nome vazio")
    public void naoDeveAdicionarPessoaComNomeVazio() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execucao
        org.junit.jupiter.api.Assertions
                .assertThrows(PessoaSemNomeException.class, ()-> cadastroPessoas.adicionar(pessoa));

    }

    @Test
    @DisplayName("Deve remover uma pessoas")
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

    @Test
    @DisplayName("Deve lancar erro ao remover pessoa que nao existe")
    public void deveLancarErroRemoverUmaPessoaQueNaoExiste() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execucao
        org.junit.jupiter.api.Assertions
                .assertThrows(CadastroVazioException.class, ()-> cadastroPessoas.adicionar(pessoa));
    }
}
