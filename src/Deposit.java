// Абстрактный базовый класс для всех видов вкладов
public abstract class Deposit {
    protected String owner; // владелец вклада
    protected double amount; // сумма вклада
    protected double interestRate; // процентная ставка

    // Конструктор принимающий параметры для инициализации
    public Deposit(String owner, double amount, double interestRate) {
        this.owner = owner;// Инициализация владельца
        this.amount = amount;// Инициализация суммы вклада
        this.interestRate = interestRate;// Инициализация процентной ставки
    }

    // Метод для расчета процентов
    public abstract double calculateInterest();

    // Метод для вывода информации о вкладе
    public void showInfo() {
        System.out.println("Владелец: " + owner);// Вывод владельца вклада
        System.out.println("Сумма вклада: " + amount);// Вывод суммы вклада
        System.out.println("Процентная ставка: " + interestRate + "%");// Вывод процентной ставки
    }
}
