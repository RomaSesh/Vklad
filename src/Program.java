// Главный класс для запуска программы
public class Program {
    public static void main(String[] args) {
        // Создание объектов вкладов
        Deposit savingsDeposit = new SavingsDeposit("Жопероков И.И.", 100000, 5.0, 12);// Сберегательный вклад
        Deposit fixedDeposit = new FixedDeposit("Пищевой П.П.", 200000, 6.0, 3);// Фиксированный вклад

        // Вывод информации о вкладах
        savingsDeposit.showInfo();// Вывод информации о сберегательном вкладе
        System.out.println();// Пустая строка для разделения выводов
        fixedDeposit.showInfo();// Вывод информации о фиксированном вкладе
    }
}
