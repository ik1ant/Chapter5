public class VarDemo3 {
    public static void main(String[] args) {
        String[] names = {"Zelim", "Ilyas", "Ruslan", "Zurab"};

        for (var name : names) {
            System.out.println(name);
        }
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
