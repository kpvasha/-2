import java.util.Scanner;

public class PrimitiveInfo {

    public static void main(String[] args) {
        System.out.println("Примітивні типи даних у Java:");

        System.out.println("byte: ");
        System.out.println("  Розмір: " + Byte.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Byte.MAX_VALUE);

        System.out.println("short: ");
        System.out.println("  Розмір: " + Short.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Short.MAX_VALUE);

        System.out.println("int: ");
        System.out.println("  Розмір: " + Integer.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Integer.MAX_VALUE);

        System.out.println("long: ");
        System.out.println("  Розмір: " + Long.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Long.MAX_VALUE);

        System.out.println("float: ");
        System.out.println("  Розмір: " + Float.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Float.MAX_VALUE);

        System.out.println("double: ");
        System.out.println("  Розмір: " + Double.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("  Максимальне значення: " + Double.MAX_VALUE);

        System.out.println("char: ");
        System.out.println("  Розмір: " + Character.SIZE + " біт");
        System.out.println("  Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("  Максимальне значення: " + (int) Character.MAX_VALUE);

        System.out.println("boolean: ");
        System.out.println("  Може мати значення: " + Boolean.TRUE + " або " + Boolean.FALSE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведіть ціле число (int):");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Введене ціле число: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Невірний формат для int");
        }

        System.out.println("\nВведіть дробове число (float):");
        String floatInput = scanner.nextLine();
        try {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("Введене дробове число: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Невірний формат для float");
        }

        System.out.println("\nВведіть логічне значення (boolean):");
        String booleanInput = scanner.nextLine();
        try {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Введене логічне значення: " + booleanValue);
        } catch (Exception e) {
            System.out.println("Невірний формат для boolean");
        }

        scanner.close();
    }
}