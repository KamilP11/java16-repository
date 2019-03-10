package pl.mpas.advanced_programming.threading.first.atomic;

class Person implements Cloneable{
    private String name;
    private String surname;

    private Person partner;

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
    public Person peformCloning(){
        Person newYou = null;
        try {
            newYou = (Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner.name +
                '}';
    }
}

public class Exercise4 {

    public static void main(String[] args) {
        Person me = new Person("Kamil", "Paradziński", null);
        Person wife = new Person("A", "J", me);
        me.setPartner(wife);

        System.out.println("Me" + me);
        System.out.println("Wife" + wife);

        Person clonedWife = wife.peformCloning();
        System.out.println(clonedWife);
    }


}
