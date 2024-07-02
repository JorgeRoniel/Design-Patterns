package Api;

public class CepApi {
    private static CepApi instace = new CepApi();

    private CepApi(){};

    public static CepApi getInstance(){
        return instace;
    }

    public String  getCidade(String cep){
        return "Barra do Sotero";
    }

    public String getEstado(String cep){
        return "CE";
    }

}
