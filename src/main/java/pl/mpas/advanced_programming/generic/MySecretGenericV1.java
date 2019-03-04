package pl.mpas.advanced_programming.generic;

public class MySecretGenericV1 {

    private Object object;

    public MySecretGenericV1(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MySecretGenericV1{" +
                "object=" + object +
                '}';
    }
}
