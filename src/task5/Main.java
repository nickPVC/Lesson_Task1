package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Создать класс User, содержащий поле – userName и статическое поле userCount.
// Создать статический инициализатор класса, конструктор класса, инициализирующий поле класса и изменяющий значение userCount.
// В текстовом файле построчно записать имена пользователей.
// Создать массив пользователей и проинициализировать их значениями из текстового файла.
// Создать метод в классе User, выводящий количество созданных пользователей.



    public class User{

    // переменные
        private String userName; // Имя пользователя
        static int userCount; // номер пользователя

    // конструкторы

    // методы
    public void outuserCount(){ // Метод, выводящий количество созданных пользователей.
        System.out.print(userCount);
    }
    }
 /*
 for (int i = 0; i < cols - 1; i++) // Сортировка массива пузырьком - большие числа в конец строки
	     for (int j = 0; j < cols - i - 1; j++)
		    if (array[k][j] > array[k][j + 1])
			    {// меняем элементы местами
                temp = array[k][j];
                array[k][j] = array[k][j + 1];
                array[k][j + 1] = temp;
                }
  */



public class Main {
     public static void main(String[] args) {
        Scanner scanner = null;
        int maxLenght=0;
        int i;
        User myUser = new User();

        try {
            scanner = new Scanner(new File("src/in.txt"));
            maxLenght=scanner.nextInt(); // первым числом в файле - кол-во элементов массива
            for (i=0;i<maxLenght;i++){
                System.out.print(scanner.next()+ " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
