//каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж



public class Employee {

    private int personnelNumber;
    private String numberPhone;
    private String name;
    private float experience;

    public Employee(int personnelNumber, String numberPhone, String name, float experience) {
        this.personnelNumber = personnelNumber;
        this.numberPhone = numberPhone;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public float getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "personnelNumber = " + personnelNumber +
                ", numberPhone ='" + numberPhone + '\'' +
                ", name = '" + name + '\'' +
                ", experience =" + experience +
                '}';
    }
}
