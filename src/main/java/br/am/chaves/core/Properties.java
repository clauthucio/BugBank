package br.am.chaves.core;

public class Properties {

    public static boolean CLOSE_BROWSER = false;

    public static Browsers BROWSER = Browsers.CHROME;

    public enum Browsers{
        CHROME,
        FIREFOX,
        EDGE;
    }

}