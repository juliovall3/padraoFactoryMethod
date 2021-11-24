package factory;

import model.Servico;

public class ServicoFactory {

    //essa factory usa o conceito de reflexao computacional

    public static Servico obterServico(String servico){
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("model.servico"+servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Servico não existe");
        }
        if (!(objeto instanceof Servico)){
            throw new IllegalArgumentException("Servico invalido");
        }
        return (Servico)objeto;
    }

}
