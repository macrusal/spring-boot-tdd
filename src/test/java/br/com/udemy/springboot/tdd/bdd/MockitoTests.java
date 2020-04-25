package br.com.udemy.springboot.tdd.bdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
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
    public void primeiroTesteMockito() throws Exception {

        Mockito.when(lista.size()).thenReturn(20);

        int size = lista.size();

        Assertions.assertThat(size).isEqualTo(20);

    }
}
