package singleton_eager;

public class Eager {
    private static Eager instance = new Eager(); // Já fazemos o new logo na criação da variavel

    private Eager(){};

    public static Eager getInstance(){
        return instance; // Aqui só retornamos ela.
    }
}
