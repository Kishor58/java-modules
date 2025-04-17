package Classes_In_Java;

public class NestedClass {
    private String name;

    NestedClass(String name) {
        this.name = name;
    }

    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void showDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    public static void main(String[] args) {
        NestedClass.Department dept = new NestedClass.Department("IT");
        dept.showDepartment();
    }
}
