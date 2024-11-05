import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent(12345, "Иванов", "Иван", "Иванович", "Москва, ул. Ленина, 1", 120, "5555 6453 1198 2715", 0));
        abonents.add(new Abonent(67890, "Петров", "Петр", "Петрович", "Санкт-Петербург, ул. Пушкина, 2", 60, "8945 3719 9801 3641", 100));
        abonents.add(new Abonent(54321, "Сидоров", "Сидор", "Сидорович", "Новосибирск, ул. Чехова, 3", 150, "0897 4212 7492 0274", 50));
        abonents.add(new Abonent(11111, "Кузнецов", "Алексей", "Алексеевич", "Екатеринбург, ул. Горького, 4", 30, "7255 4566 8794 2791", 200));

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