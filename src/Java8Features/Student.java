package Java8Features;

public class Student {
    private int Id;
    private String name;
    private String email;
    private String college;
    private long contact;

    public Student(int id, String name, String email, String college, long contact) {
        Id = id;
        this.name = name;
        this.email = email;
        this.college = college;
        this.contact = contact;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCollege() {
        return college;
    }

    public long getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", college='" + college + '\'' +
                ", contact=" + contact +
                '}';
    }
}

interface SortById extends Comparable<SortById>{
    public void compare(int a,int b);
}
