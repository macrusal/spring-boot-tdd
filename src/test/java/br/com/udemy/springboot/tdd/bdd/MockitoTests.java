package br.com.udemy.springboot.tdd.bdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

/**
 * @author macrusal on 25/04/20
 * @project spring-boot-tdd
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

    @Mock
    List<String> lista;

    @Test
    public void verificaSeOsMetodosForamExecutadosEmOrdem() throws Exception {
        lista.size();
        lista.add("");

        InOrder inOrder = Mockito.inOrder(lista);
        inOrder.verify(lista).size();
        inOrder.verify(lista).add("");
    }

    @Test
    public void verificaSeAListaFoiChamadaUmaVez() throws Exception {

        int size = 0;

        if (1 == 2) {
            size = lista.size();
        }

        Mockito.verify(lista, Mockito.times(1)).size();

    }

    @Test
    public void verificaSeAListaFoiChamadaTresVezes() throws Exception {

        int size = 0;

        if (1 == 1) {
            size = lista.size();
            size = lista.size();
            size = lista.size();
        }

        Mockito.verify(lista, Mockito.times(3)).size();

    }

    @Test
    public void verificaSeAListaTem20Elementos() throws Exception {

        int size = 0;

        if (1 == 1) {
            size = lista.size();
        }

        Mockito.verify(lista).size();

    }

    @Test
    public void verificaSeAListaFoiMocadaCom20Elementos() throws Exception {

        Mockito.when(lista.size()).thenReturn(20);

        int size = lista.size();

        Assertions.assertThat(size).isEqualTo(20);

    }
}
