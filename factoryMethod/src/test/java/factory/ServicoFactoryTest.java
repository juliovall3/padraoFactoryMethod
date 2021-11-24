package factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import model.Servico;


public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente(){
        try {
            Servico servico = ServicoFactory.obterServico("inexistente");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Servico não existe", e.getMessage());
        }
    }

    @Test
    void deveRetornarServicoInvalido(){
        try {
            Servico servico = ServicoFactory.obterServico("invalido");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Servico invalido", e.getMessage());
        }
    }
}
