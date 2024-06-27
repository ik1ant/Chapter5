public class ForEachTest {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        int sumOfNumbers = 0;

        for(int number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println(sumOfNumbers);

        String[][] chuvakiArrays = {
            {"Biba", "Boba"},
                {"Voba", "Joga"}
        };
        for(String[] fellas : chuvakiArrays) {
            for(String name : fellas) {
                System.out.println(name);
            }
        }
    }
}
