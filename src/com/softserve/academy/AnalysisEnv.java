/*
2. Анализ конвертов
Есть два конверта со сторонами (a,b) и (c,d) определить, можно ли один конверт вложить в другой.
Программа должна обрабатывать ввод чисел с плавающей точкой.
Программа спрашивает у пользователя размеры конвертов по одному параметру за раз.
После каждого подсчёта программа спрашивает у пользователя хочет ли он продолжить.
Если пользователь ответит “y” или “yes” (без учёта регистра),
программа продолжает работу сначала, в противном случае – завершает выполнение.
 */

package com.softserve.academy;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AnalysisEnv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answerU = "(y|yes)";
        do {
            try {
                // create a new object
                InputSide list = new InputSide();
                //  write the array into the object with the "getInputSide" method
                double[] one = list.getInputSide();

                if (one[0] <= 0 || one[1] <= 0 || one[2] <= 0 || one[3] <= 0) {
                    System.out.println("You entered a negative number or zero, try again: ");
                    break;
                } else {
                    // create two envelopes with sides from the "one" array
                    Envelope env1 = new Envelope(one[0], one[1]);
                    Envelope env2 = new Envelope(one[2], one[3]);
                    // compare first envelope with the second one using the "compareTo" method
                    switch (env1.compareTo(env2)) {
                        case 1:
                            System.out.println("Envelope 2 can be put into envelope 1");
                            break;
                        case -1:
                            System.out.println("Envelope 1 can be put into envelope 2");
                            break;
                        case 0:
                            System.out.println("Envelopes cannot be put into each other");
                            break;
                    }

                    System.out.println("Do you want to continue? (y/n or yes/no): ");
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("You entered wrong arguments, try again: " +
                        "enter only positive numbers");
                break;
            }
        } while (scanner.next().matches(answerU));
        scanner.close();
    }

}
