public class StringImmutable {
    public static void main(String[] args) {
        String name = "ZELIM";
        System.out.println(name.charAt(1));
        StringBuffer name2 = new StringBuffer("Zelem");
        name2.setCharAt(3,'i');
        System.out.println(name2);

        StringBuilder name3 = new StringBuilder("Ilyas");
        System.out.println(name3);
        name3.deleteCharAt(name3.length() - 1);
        System.out.println(name3);
    }
}
