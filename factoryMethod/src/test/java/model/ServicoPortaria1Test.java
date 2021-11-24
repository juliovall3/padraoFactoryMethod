package model;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import factory.ServicoFactory;

class ServicoPortaria1Test {

    @Test
    void develiberarPortaria1(){
        Servico servico = ServicoFactory.obterServico("liberar");
        assertEquals("liberado",servico.liberar());
    }

    @Test
    void devenaoLiberarPortaria1(){
        Servico servico = ServicoFactory.obterServico("naoLiberar");
        assertEquals("não liberar",servico.liberar());
    }
}
