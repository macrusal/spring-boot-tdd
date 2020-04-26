package br.com.udemy.springboot.bdd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author macrusal on 25/04/20
 * @project spring-boot-tdd
 */
@RestController
@RequestMapping("/api/clientes/")
public class MeuResource {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente) {
//        return new ResponseEntity(cliente, HttpStatus.CREATED);
        return cliente;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        //cliente = service.buscarPorId
        //service.delete(cliente)
    }

    @PutMapping("{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        //cliente = service.buscarPorId
        //service.update(cliente)
        return cliente;
    }

    @GetMapping("{id}")
    public Cliente obterDadosCliente(@PathVariable Long id) {
        Cliente cliente = new Cliente("Nome de Alguem", "000.000.000-00");
        return cliente;
    }
}
