package java_foundation.object_deep_copy;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Use apache common lang SerializationUtils to serialize class for deep copy
 */
public class DeepCloneBySerializable implements Serializable{

    public void deepCopy() throws CloneNotSupportedException {
        List<Person> list1 = new ArrayList<>();

        Person p1 = new Person("aaa", "10");
        Person p2 = new Person("bbb", "15");

        list1.add(p1);
        list1.add(p2);

        List<Person> list2 = new ArrayList<>();
        for(Person person : list1) {
            list2.add(SerializationUtils.clone(person));
        }

        for(Person person : list2) {
            person.setAge("100");
        }

        readFromList(list1);
        readFromList(list2);
    }

    private void readFromList(List<Person> listToRead) {
        for(Person person : listToRead) {
            System.out.println(person.toString());
        }
    }

    public class Person implements Serializable {
        String name;
        String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "My name is " + name + " and age " + age;
        }
    }
}