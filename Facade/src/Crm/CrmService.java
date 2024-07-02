package Crm;

public class CrmService {
    private CrmService(){};

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo!");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}
