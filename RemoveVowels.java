import java.util.Scanner; //Класс для считывания пользовательского ввода

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для чтения с консоли

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Удаление всех гласных (как русских, так и английских, включая букву 'y')
        // (?i) — флаг для игнорирования регистра
        // [аеёиоуыэюяaeiouy] — класс символов, содержащий гласные буквы на русском и английском
        String result = input.replaceAll("(?i)[аеёиоуыэюяaeiouy]", "");

        System.out.println("Строка без гласных: " + result); // Вывод результата
    }
}

