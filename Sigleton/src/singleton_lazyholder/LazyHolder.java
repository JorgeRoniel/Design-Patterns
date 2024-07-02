package singleton_lazyholder;

public class LazyHolder {

    /*
     * Encapsulamos a instancia dentro de uma InnerClass.
     */
    private static class InnerLazyHolder {
        
        public static LazyHolder instance = new LazyHolder();
    }

    private LazyHolder(){};

    public static LazyHolder getInstance(){
        return InnerLazyHolder.instance;
    }
}
