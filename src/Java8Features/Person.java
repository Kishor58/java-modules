package Java8Features;

public class Person implements Comparable<Person>{
    int personId;
    String name ;
    int age;

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person p){
        if(this.personId>p.personId){
            return 1;
        }
        if(this.personId<p.personId){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
