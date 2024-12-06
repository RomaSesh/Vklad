// Класс для сберегательного вклада, наследующий от Deposit
public class SavingsDeposit extends Deposit {
    private int period; // срок вклада в месяцах

    // Конструктор, принимающий параметры для инициализации
    public SavingsDeposit(String owner, double amount, double interestRate, int period) {
        super(owner, amount, interestRate);// Вызов конструктора базового класса
        this.period = period;// Инициализация срока вклада
    }

    // Метод для расчета процентов
    @Override
    public double calculateInterest() {
        // Расчет процентов за период
        return amount * interestRate / 100 * period / 12; // расчет процентов за период
    }

    // Метод для вывода информации о сберегательном вкладе
    @Override
    public void showInfo() {
        super.showInfo();// Вызов метода базового класса для вывода общей информации
        System.out.println("Срок вклада: " + period + " месяцев");// Вывод срока вклада
        System.out.println("Накопленные проценты: " + calculateInterest());// Вывод накопленных процентов
    }
}