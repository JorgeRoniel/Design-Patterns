package migracao;

import Api.CepApi;
import Crm.CrmService;

public class Migracao {
    
    public void migrarDados(String nome, String cep){
        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
