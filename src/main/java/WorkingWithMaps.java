import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {

        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(map.get(new Person("Jamila")));


    }

    private static void maps(){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2,new Person("Alexxa"));
        map.put(3, new Person("Mario"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.remove(3);
        System.out.println(map.entrySet());
    }

    static class Person {
        String name;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Person(String name){
            this.name =name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
    record Diamond(String name){}
}
