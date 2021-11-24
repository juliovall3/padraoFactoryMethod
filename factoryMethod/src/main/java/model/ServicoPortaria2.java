package model;

public class ServicoPortaria2 implements Servico{

    public String liberar(){
        return "liberado";
    }

    public String naoLiberar(){
        return "não liberar";
    }
}
