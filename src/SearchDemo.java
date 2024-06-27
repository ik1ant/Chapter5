public class SearchDemo {
    public static void main(String[] args) {
        int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;
        for(int x : nums) {
            if(x == value) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Found it!");
        } else {
            System.out.println("Not found!");
        }
    }
}
