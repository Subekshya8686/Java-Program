public class Main{
    public static void main(String[] args) {
        GetterSetter person = new GetterSetter();
        person.setName("John Doe");
        person.setAge(25);

        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());
    }
}