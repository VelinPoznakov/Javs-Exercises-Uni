import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
//        int[] nums = new int[10];
//        for (int i = 0; i < 10; i++) {
//            nums[i] = i + 1;
//        }

        // 2
//        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[5];
//        for (int i = 0; i < 5; i++) {
//            nums[i] = sc.nextInt();
//        }

        // 4
//        Scanner sc = new Scanner(System.in);
//
//        int[] nums = new int[5];
//        int sum = 0;
//
//        for (int i = 0; i < 5; i++) {
//            nums[i] = sc.nextInt();
//        }
//        for(int n: nums){
//            sum += n;
//        }
//        System.out.println(sum);

        // 5
//        String[] words = new String[3];
//
//        Arrays.sort(words, Comparator.comparingInt(String::length));

        // 7
//        int[] nums = new int[10];
//        int otrCounter = 0;
//        int polCounter = 0;
//
//        for(int i: nums){
//            if(i > 0){
//                polCounter++;
//            }
//            else if(i < 0){
//                otrCounter++;
//            }
//            else{
//                continue;
//            }
//        }

        // 8
//        int[] nums1 = new int[10];
//        int[] nums2 = new int[10];
//
//        for(int n: nums1){
//            for(int j: nums2){
//                if(n==j){
//                    System.out.println(n);
//                }
//            }
//        }

        // 9
//        int[] nums1 = new int[10];
//        int[] nums2 = new int[10];
//         for(int i = nums1.length - 1; i >= 0; i--){
//             nums2[nums1.length - 1 - i] = nums1[i];
//         }

        // 10
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int[] nums = new int[10];
//        int[] newNUms = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != num){
//                newNUms[i] = nums[i];
//            }
//        }

        // 11
//        int[] nums = new int[10];
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] < nums[i+1]){
//                int temp = nums[i];
//                nums[i] = nums[i+1];
//                nums[i+1] = temp;
//            }
//        }

        // 12

//        String[] names = new String[10];
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int counter = 0;
//
//        for(String a: names) {
//            if(a.equals(name)) {
//                counter++;
//            }
//        }
//        System.out.println(counter);

        // 13

//        int[] nums = new int[10];
//        boolean flag = true;
//        for(int i = 0; i < nums.length / 2; i++){
//            if(nums[i] != nums[nums.length - i - 1]){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("ok");
//        }
//        else{
//            System.out.println("no");
//        }






    }
    // 3
    public static int n(int[] nums){
        int maxNum = nums[0];

        for(int i=0; i<nums.length; i++){
            if(maxNum < nums[i]){
                maxNum = nums[i];
            }
        }
        return maxNum;

    }

    // 6
    public static int num(int[] nums, int number){
        for(int n: nums){
            if(n == number){
                return n;
            }
        }
        return -1;
    }
}