public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 7.");
        int Age2 = 3;
        if (Age2 >= 2 && Age2 <= 6) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в детский сад.");
        } else if (Age2 > 6 && Age2 <= 18) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в школу.");
        } else if (Age2 > 18 && Age2 <= 24) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в университет.");
        } else if (Age2 > 24) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить на работу.");
        }
    }
}