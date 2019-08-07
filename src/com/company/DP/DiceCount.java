package com.company.DP;

public class DiceCount {
    public static void main(String[] args) {
        System.out.println(Dice("", 5));
        int arr[] = new int[100];
        System.out.println(DiceDp(0, 5, arr));
    }

    public static int Dice(String processed, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += Dice(processed + i, target - i);
        }
        return count;
    }

    public static int DiceDp(int processed, int target, int mem[]) {
        if (target == 0) {
            return 1;
        }
        if (mem[target] != -0) {
            return mem[target];
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += DiceDp(processed + i, target - i, mem);
        }
        mem[target] = count;
        return mem[target];
    }

//    public static int Diceiter(int target)
//    {
//        int mem[] = new int[100];
//        mem[0]=1;
//        int count=0;
//        int processed=0;
//        for (int i = 1; i <=6 && i<=target; i++) {
//            processed+=i;
//            for (int j = 1; j <=target-i; j++) {
//
//            }
//
//        }
//    }
}
