package one.digital.gof;

public class SingletonLazyHolder {
    private static  class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    public SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
