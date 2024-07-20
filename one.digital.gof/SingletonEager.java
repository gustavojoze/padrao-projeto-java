package one.digital.gof;

public class SingletonEager {
    private static SingletonEager instancia ;

    public SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
