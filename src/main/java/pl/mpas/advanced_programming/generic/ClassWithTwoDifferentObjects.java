package pl.mpas.advanced_programming.generic;

public class ClassWithTwoDifferentObjects<T,V> {

    private T secret1;
    private V secret2;

    public ClassWithTwoDifferentObjects(T secret1, V secret2) {
        this.secret1 = secret1;
        this.secret2 = secret2;
    }

    public T getSecret1() {
        return secret1;
    }

    public V getSecret2() {
        return secret2;
    }

    @Override
    public String toString() {
        return "ClassWithTwoDifferentObjects{" +
                "secret1=" + secret1 +
                ", secret2=" + secret2 +
                '}';
    }
}
