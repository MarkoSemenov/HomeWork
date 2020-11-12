class Employees {

    private String name;
    private String surname;
    private String title;
    private String email;
    private int number;
    private double salary;
    private int age;


    private boolean conferenceBudget;
    private int budgetSize = 90_000;

    protected Employees(String name, String surname, String title, String email, int number, double salary, int age){
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
        this.conferenceBudget = false;

    }

    void showInfo(){
        System.out.println("Имя сотрудника: " + name + "; " + "Фамилия: " + surname + "Должность: " + title + "; " + "Email: " + email + "; " +
                "Телефон: " + number + "; " + "Зарплата: " + salary + "; " + "Возраст " + age + "; "
                + "Размер бюджета на конференции: " + getBudgetSize());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else System.out.println("Число не может быть отрицательным. Введите корректный возраст");
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void setConferenceBudget(boolean conferenceBudget) {
        this.conferenceBudget = conferenceBudget;
    }

    public void setBudgetSize(int budgetSize) {
        this.budgetSize = budgetSize;
    }

    public int getBudgetSize() {
        if (conferenceBudget){
            return budgetSize;
        }
        else return 0;
    }



}
