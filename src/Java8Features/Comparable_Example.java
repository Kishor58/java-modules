package Java8Features;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Example implements Comparable<Comparable_Example>{
    private final int EmpId;
    private final String EmpName;
    private final long contact;
    private final String email;
    private final String address;

    public Comparable_Example(int empId, String empName, long contact, String email, String address) {
        EmpId = empId;
        EmpName = empName;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public long getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int compareTo(Comparable_Example c){
        if(this.EmpId>c.EmpId){
            return 1;
        }
        if(this.EmpId <c.EmpId){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Comparable_Example{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Comparable_Example> list=new ArrayList<>();

        list.add(new Comparable_Example(103,"Dholu",8765473829l,"Hyderabad","dhoulu12@gmail.com"));
        list.add(new Comparable_Example(102,"Eholu",9867473829l,"Pune","ehoulu12@gmail.com"));
        list.add(new Comparable_Example(104,"Fholu",8967473829l,"Surat","fhoulu12@gmail.com"));
        list.add(new Comparable_Example(101,"Gholu",7667473829l,"Burhanpur","ghoulu12@gmail.com"));
        list.add(new Comparable_Example(105,"Hholu",7867473829l,"Vizag","hhoulu12@gmail.com"));
        list.add(new Comparable_Example(106,"Iholu",8067473829l,"Ameerpet","jhoulu12@gmail.com"));
        list.add(new Comparable_Example(109,"Jholu",6067473829l,"Indore","khoulu12@gmail.com"));
        list.add(new Comparable_Example(108,"Kholu",667473829l,"Ujjain","lhoulu12@gmail.com"));
        list.add(new Comparable_Example(107,"Kholu",9876747382l,"Omkareshwar","houlu12@gmail.com"));
        list.add(new Comparable_Example(112,"Lholu",876543829l,"Riwa","ihoulu12@gmail.com"));
        list.add(new Comparable_Example(111,"Mholu",9087673829l,"Satna","jhoulu12@gmail.com"));
        list.add(new Comparable_Example(115,"Mholu",9807673829l,"Nagpur","khoulu12@gmail.com"));

        System.out.println("Before the sorting :");
        for(Comparable_Example c:list){
            System.out.println(c);
        }
        System.out.println("*********************************************");
        Collections.sort(list);
        System.out.println("After Sorting : ");
        for (Comparable_Example c:list){
            System.out.println(c);
        }

    }
}
