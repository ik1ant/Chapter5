public class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Zelim", "88005553535"},
                {"Ilyas", "89998147544"},
                {"Ruslan", "89992281488"}
        };
        if (args.length < 1) {
            System.out.println("Введите имя в качестве аргумента в качестве программы!");
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
            if(numbers[i][0].equals(args[0])) {
                System.out.println("Номер телефона " + numbers[i][1]);
                return;
            }
        }
        System.out.println("Абонент не найден");
    }
}
