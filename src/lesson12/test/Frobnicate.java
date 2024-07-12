package lesson12.test;

public abstract interface Frobnicate { public void twiddle(String s); }


abstract class Frob implements Frobnicate {
    @Override
    abstract public void twiddle(String s);
}

