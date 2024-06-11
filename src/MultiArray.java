public class MultiArray {
    public static void main(String[] args) {
        String[][] multiArray = {
                {"Zelim", "Ilyas", "Ruslan"},
                {"Женя", "Илья", "Русланд"}
        };
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
