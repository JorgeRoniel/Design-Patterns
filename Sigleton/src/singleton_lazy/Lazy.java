package singleton_lazy;

public class Lazy {
    private static Lazy instance;

    private Lazy(){};

    public static Lazy getInstance(){
        if(instance == null){ //Verificamos se a variavel instance ainda é nula, caso seja, fazemos o new dela
                              // e depois retornamos.
            instance = new Lazy();
        }

        return instance;
    }
}
