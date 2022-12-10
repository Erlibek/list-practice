import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> listBook = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Выберите действие: 
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
            String message = scan.nextLine();
            if (Integer.parseInt(message) == 0) {
                System.out.println("Выход");
                break;
            }
            switch (Integer.parseInt(message)) {
                case 1 -> {
                    System.out.println("Вывести задачу для планирования: ");
                    Scanner scanner = new Scanner(System.in);
                    String text = scanner.nextLine();
                    listBook.add(text);
                }
                case 2 -> {
                    System.out.println("Список задач: ");
                    int counter = 0;
                    for (String task : listBook) {
                        counter++;
                        System.out.println(counter + ". " + task);
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Введите какую задачу удалить или введите finish");
                        String index = scan.nextLine();
                        if (index.equalsIgnoreCase("finish")) {
                            break;
                        }
                        listBook.remove(Integer.parseInt(index) - 1);
                    }
                }
            }
        }
    }
}
