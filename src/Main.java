import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4561, "89998887766", "Павел", 4f);
        Employee emp2 = new Employee(4524, "79998821235", "Юрий", 5f);
        Employee emp3 = new Employee(5232, "89090001122", "Елена", 2f);
        Employee emp4 = new Employee(1123, "83339994422", "Павел", 1f);
        Employee emp5 = new Employee(7777, "89124231122", "Валерия", 4f);

        ListEmployee listEmployee = new ListEmployee();

        listEmployee.addInListEmployee(emp1);
        listEmployee.addInListEmployee(emp2);
        listEmployee.addInListEmployee(emp3);
        listEmployee.addInListEmployee(emp4);
        listEmployee.addInListEmployee(emp5);

        ArrayList<Employee> list = listEmployee.getListEmployee();


        for (Employee emp : listEmployee.searchOfExperience(4f)) {
            System.out.println(emp);
        }

        System.out.println("___________________________________________");

        for (String emp : listEmployee.searchPhoneNumber("Павел")) {
            System.out.println(emp);
        }

        System.out.println("___________________________________________");

        System.out.println(listEmployee.searchOfPersonnelNumber(5232));



    }
}