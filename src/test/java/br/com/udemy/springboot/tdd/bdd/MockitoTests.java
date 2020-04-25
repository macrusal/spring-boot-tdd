package br.com.udemy.springboot.tdd.bdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * @author macrusal on 25/04/20
 * @project spring-boot-tdd
 */
public class MockitoTests {

    @Test
    public void primeiroTesteMockito() throws Exception {
        List<String> lista = Mockito.mock(ArrayList.class);

        Mockito.when(lista.size()).thenReturn(20);

        int size = lista.size();

        Assertions.assertThat(size).isEqualTo(20);

    }
}
