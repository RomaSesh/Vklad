// Класс для фиксированного вклада, наследующий от Deposit
public class FixedDeposit extends Deposit {
    private int term; // срок вклада в годах

    // Конструктор, принимающий параметры для инициализации
    public FixedDeposit(String owner, double amount, double interestRate, int term) {
        super(owner, amount, interestRate);// Вызов конструктора базового класса
        this.term = term;// Инициализация срока вклада
    }

    // Метод для расчета процентов
    @Override
    public double calculateInterest() {
        // Расчет процентов за весь срок
        return amount * interestRate / 100 * term; // расчет процентов за весь срок
    }
    // Метод для вывода информации о фиксированном вкладе
    @Override
    public void showInfo() {
        super.showInfo();// Вызов метода базового класса для вывода общей информации
        System.out.println("Срок вклада: " + term + " лет");// Вывод срока вклада
        System.out.println("Накопленные проценты: " + calculateInterest());// Вывод накопленных процентов
    }
}
