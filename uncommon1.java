

/*
input1:{'A','B','C}
input2:{'B','C'}
Output:2


*/


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(findUncommon(str1, str2));
        sc.close();
    }

    static int findUncommon(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        int sum1 = 0;
        for (char c : set1) {
            if (!set2.contains(c)) {
                sum1 += c;
            }
        }
        for (char c : set2) {
            if (!set1.contains(c)) {
                sum1 += c;
            }
        }

        return finalSum(sum1);
    }

    static int finalSum(int n) {
        while (n >= 10) {
            n = midSum(n);
        }
        return n;
    }

    static int midSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
