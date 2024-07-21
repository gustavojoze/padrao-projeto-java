package one.digital.gof;

import one.digital.gof.singleton.SingletonEager;
import one.digital.gof.singleton.SingletonLazy;
import one.digital.gof.singleton.SingletonLazyHolder;
import one.digital.gof.strategy.*;


public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);


        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo= new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}