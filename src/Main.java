import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent(12345, "Иванов", "Иван", "Иванович", "Москва, ул. Ленина, 1", 120, "+7-953-071-27-20", 0));
        abonents.add(new Abonent(67890, "Петров", "Петр", "Петрович", "Санкт-Петербург, ул. Пушкина, 2", 60, "+8-800-555-35-35", 100));
        abonents.add(new Abonent(54321, "Сидоров", "Сидор", "Сидорович", "Новосибирск, ул. Чехова, 3", 150, "+7-724-210-12-12", 50));
        abonents.add(new Abonent(11111, "Кузнецов", "Алексей", "Алексеевич", "Екатеринбург, ул. Горького, 4", 30, "+8-653-911-11-17", 200));

        System.out.println("Сколько минимум абонент должен был наговорить?");
        int minCallTime = scanner.nextInt();


        System.out.println("Абоненты с разговорами более " + minCallTime + " минут:");
        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > minCallTime) {
                System.out.println(abonent);

            }
        }
    }
}