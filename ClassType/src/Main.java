public class Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Person p1 = new Person("Bartek", "Kołakowski");
        Class c1 = p1.getClass();

        Person p2 = new Person("Jan", "Kowalski");
        Class givenClass = p1.getClass();
        String name = c1.getName();
        Class c2 = Class.forName(name);

        Class c3 = Person.class;


    }
}