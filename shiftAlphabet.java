/*
ip1:Hi Hell
op:Jk Lipp


*/
import java.util.*;

class Main {
    public static String Modified(String s1) {
        String s[] = s1.trim().split("\\s+");
        StringBuilder modified = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            int n = s[i].length();
            for (int j = 0; j < n; j++) {
                char k = s[i].charAt(j);
                if (Character.isLowerCase(k)) {
                    if ((k + n) > 'z') {
                        modified.append('z');
                    } else {
                        modified.append((char) (k + n));
                    }
                } else if (Character.isUpperCase(k)) {
                    if ((k + n) > 'Z') {
                        modified.append('Z');
                    } else {
                        modified.append((char) (k + n));
                    }
                }
            }
            modified.append(" ");
        }
        return modified.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(Modified(s1));
    }
}
