package br.com.pessoa.batch;

import br.com.pessoa.model.Pessoa;
import br.com.pessoa.repository.PessoaRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Pessoa> {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public void write(List<? extends Pessoa> pessoas) throws Exception {
        pessoaRepository.saveAll(pessoas);
    }


}
