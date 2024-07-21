package one.digital.gof.singleton;

public class SingletonEager {
    private static SingletonEager instancia ;

    public SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
