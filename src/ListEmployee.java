//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник

import java.util.ArrayList;

public class ListEmployee {
    ArrayList<Employee> listEmployee = new ArrayList<>();


    public void addInListEmployee(Employee employee) {
        listEmployee.add(employee);
    }

    public ArrayList<Employee> searchOfExperience(float targetExperience) {
        ArrayList<Employee> targetEmp = new ArrayList<>();

        for (Employee employee : listEmployee) {
            if (employee.getExperience() == targetExperience) {
                targetEmp.add(employee);
            }
        }
        return targetEmp;
    }

    public ArrayList<String> searchPhoneNumber(String name) {
        ArrayList<String> targetEmp = new ArrayList<>();

        for (Employee employee : listEmployee) {
            if (employee.getName().equals(name)) {
                String namePhone = name + ", номер телефона: " + employee.getNumberPhone();
                targetEmp.add(namePhone);
            }
        }

        return targetEmp;
    }

    public Employee searchOfPersonnelNumber(int personnelNumber) {

        for (Employee employee : listEmployee) {
            if (employee.getPersonnelNumber() == personnelNumber) {
                return employee;
            }
        }

        return null;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }
}
