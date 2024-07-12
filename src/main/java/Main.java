import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Введите размер списка:");
        int N = scanner.nextInt();
        logger.log("Введите верхнюю границу значений элементов в списке:");
        int M = scanner.nextInt();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            randomList.add((int) (Math.random() * M));
        }
        logger.log("Введите число для фильтрации списка:");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        List<Integer> filteredList = filter.filterOut(randomList);
        logger.log("Итоговый список после фильтрации:");
        logger.log(filteredList.toString());
        logger.log("Программа завершила свою работу");
    }
}