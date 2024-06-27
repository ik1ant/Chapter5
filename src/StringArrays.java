public class StringArrays {
    public static void main(String[] args) {
        String[] strings = {"Это содержимое", "просто", "тест"};
        System.out.println("Исходный массив: ");

        for(String string : strings) {
            System.out.print(string + " ");
        }
        strings[1] = "стало ";
        strings[2] = "еще одним тестом!";
        System.out.println("Модифицированный массив: ");
        for(String string : strings) {
            System.out.print(string);
        }
    }
}
