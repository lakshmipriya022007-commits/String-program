import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }

        System.out.println(result);
    }
}
