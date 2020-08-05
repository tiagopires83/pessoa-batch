package br.com.pessoa.batch;

import br.com.pessoa.model.Pessoa;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Pessoa, Pessoa> {


    @Override
    public Pessoa process(Pessoa pessoa) throws Exception {
        System.out.println("Processor runned...");
        return pessoa;
    }
}
