package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
        /**
         * Создать класс четырехугольник, члены класса – координаты 4-х точек.
         * Предусмотреть в классе методы вычисления и вывода сведений о фигуре
         * – длины сторон, диагоналей, периметр, площадь.
         * Создать производный класс – квадрат, предусмотреть в классе проверку, является ли фигура квадратом.
         * Написать программу, демонстрирующую работу с классом: дано N четырехугольников и M квадратов,
         * найти четырехугольники с минимальной и максимальной площадью.
         */
        public static void Task5() {
            System.out.println("Семенов Егор АТ-212, Вариант №12");
        }

        public static void main(String[] args) {
            Task5();

            Square square = new Square();
            Squares squares;
            Rectangle rectangle = new Rectangle();
            Rectangles rectangles;
//-------------------------------------------------------------------
            System.out.println("Введите количество четырёхугольников: ");
            int M = new Scanner(System.in).nextInt();
            rectangles = new Rectangles(M);

            for (int i = 0; i < M; i++) {
                Rectangle.A = Math.ceil(Math.random() * 10);
                Rectangle.B = Math.ceil(Math.random() * 10);
                Rectangle.C = Math.ceil(Math.random() * 10);
                Rectangle.D = Math.ceil(Math.random() * 10);

                rectangle = new Rectangle(rectangle);
                rectangles.setRectangleAt(i, rectangle);
                rectangle = new Rectangle(rectangle);
                System.out.println(rectangle);

            }

//-------------------------------------------------------------------
            System.out.println("Введите количество квадратов: ");
            int N = new Scanner(System.in).nextInt();
            squares = new Squares(N);

            for (int i = 0; i < N; i++) {
                square.A = Math.ceil(Math.random() * 10);
                square.B = Math.ceil(Math.random() * 10);
                square.C = Math.ceil(Math.random() * 10);
                square.D = Math.ceil(Math.random() * 10);

                square = new Square(square);
                squares.setSquareAt(i, square);
                square = new Square(square);
                System.out.println(square);
            }
            //четырёхугольник с максимальной и минимальной площадью;
            System.out.println("\nЧетырёхугольник с максимальной площадью: \n\n" + rectangles.getRectangles()[rectangles.maxSquare()]);
            System.out.println("\nЧетырёхугольник с минимальной площадью: \n\n" + rectangles.getRectangles()[rectangles.minSquare()]);

        }
    }