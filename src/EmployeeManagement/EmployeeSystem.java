package EmployeeManagement;

import java.util.*;

public class EmployeeSystem {
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++){
            employees.add(new Employee(i, "Employee" + i, "emp" + i + "@company.com", 15000.0,
                    i % 2 == 0 ? "Developer" : "Sales Development"));
        }

        while (true) search(sc);
    }

    static void search(Scanner sc) {
        System.out.print("Search keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.print("Page size: ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.print("Page number: ");
        int page = Integer.parseInt(sc.nextLine());

        int start = (page - 1) * size;
        int end = Math.min(start + size, employees.size());

        if (page < 1 || start >= employees.size()) {
            System.out.println("Invalid page number.");
            return;
        }

        List<Employee> currentPage = employees.subList(start, end);
        List<Employee> match = currentPage.stream().filter(e -> match(e, keyword)).toList();

        if (!match.isEmpty()) {
            match.forEach(System.out::println);
        } else {
            int index = -1;
            for (int i = 0; i < employees.size(); i++) {
                if (match(employees.get(i), keyword)) {
                    index = i;
                    break;
                }
            }
            if (index != -1)
                System.out.println("Data not on this page. It is on page: " + ((index / size) + 1));
            else
                System.out.println("No matching data found.");
        }
    }

    static boolean match(Employee e, String k) {
        return (e.getEmpID() + "").equals(k)
                || e.getEmpName().toLowerCase().contains(k)
                || e.getEmail().toLowerCase().contains(k)
                || e.getRole().toLowerCase().contains(k)
                || (e.getSalary() + "").contains(k);
    }
}
