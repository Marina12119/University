// Входные значения вводятся в формате [1, 0, 1, 0, 0, 1, 1] (со скобками, через запятую и пробел)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Work {

      // Чтение входных данных, их обработка и вывод результата
      private void reader(Work test, BufferedReader br) {
            ArrayList<Boolean> result = new ArrayList<>(); 
            int numberOfWorkers = 0; 

            try {
                  String inputString = br.readLine();
                  // Удаление квадратных скобок и пробелов
                  inputString = inputString.replaceAll("[\\[\\]\\s]", "");

                  // Преобразование строки в список булевых значений
                  test.converter(inputString, result);
            } catch (IOException e) {
                  e.printStackTrace(); 
            }

            // Подсчёт количества значений true (т.е. работников)
            numberOfWorkers = test.numberOfPeople(result, numberOfWorkers);

            // Вывод результатов
            System.out.println(result);           
            System.out.println(numberOfWorkers);  
      }

      // Преобразование строки чисел в список булевых значений
      private ArrayList<Boolean> converter(String inputString, ArrayList<Boolean> result) {
            String[] OneRowInPython10InJava = inputString.split(",");

            for (int i = 0; i < OneRowInPython10InJava.length; i++) {
                  if (Integer.parseInt(OneRowInPython10InJava[i]) == 1) {
                        result.add(true);  // 1 → true
                  } else if (Integer.parseInt(OneRowInPython10InJava[i]) == 0) {
                        result.add(false); // 0 → false
                  }
            }
            return result;
      }

      // Подсчет количества работников в списке
      private int numberOfPeople(ArrayList<Boolean> inputData, int numberOfWorkers) {
            for (boolean i : inputData) {
                  if (i == true) {
                        numberOfWorkers += 1; 
                  }
            }
            return numberOfWorkers;
      }

      // Точка входа в программу
      public static void main(String[] args) {
            Work test = new Work(); // Создание экземпляра класса
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr); // Обёртка для удобного чтения строк
            test.reader(test, br); // Запуск основного метода обработки
      }
}
