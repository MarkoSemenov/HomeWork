
public class Lesson5 {

    public static void main(String[] args) {
        Employees [] array = new Employees[5];

        Employees person1 = new Employees("Билл", "Денбро","CEO", "bill@corp.ru", 951_11_22_33, 250_000, 45);
        Employees person2 = new Employees("Дарья", "Жданова","Accountant", "anna@corp.ru", 952_22_33_44, 150_000, 39);
        Employees person3 = new Employees("Владислав", "Андреев", "Head of legal", "vlad@corp.ru", 968_01_01_02, 120_000, 48);
        Employees person4 = new Employees("София", "Монро","Marketing specialist", "sofia@corp.ru", 999_45_12_12, 78_000, 26);
        Employees person5 = new Employees("Виктория", "Артемьева","Secretary", "vika@corp.ru", 913_62_00_00, 58_000, 23);

        array [0] = person1;
        array [1] = person2;
        array [2] = person3;
        array [3] = person4;
        array [4] = person5;

        for (int i = 0; i < array.length; i++) {

            if (array[i].getSalary() > 100_000) {
                array[i].setConferenceBudget(true);
            }
        }

        person1.setBudgetSize(120_000);

        person1.setAge(-899);
        System.out.println("Возраст " + person1.getAge());

        System.out.println();
        System.out.println("Все сотрудники компании");

        for (Employees i : array) {
            i.showInfo();
        }

        System.out.println();
        System.out.println("Все сотрудники старше 40 лет");

        for (Employees employees : array) {
            if (employees.getAge() > 40) {
                employees.showInfo();
            }
        }
    }
}


