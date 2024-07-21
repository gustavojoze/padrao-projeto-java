package one.digital.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia ;

    public SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instancia == null ){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
