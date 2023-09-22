package com.company;


import java.util.LinkedHashMap; //for O(1)


public class Main {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }
    public static int minSplit(int amount){
        int[] arr = {50, 20, 10, 5, 1};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            while(amount>=arr[i]){
                amount -= arr[i];
                count+= 1;
            }
        }
        return count;
    }

    public static int notContains(int[] arr){
        int m = 1;
        for(int i = 0; i < arr.length; i++){
            while(arr[i] <= 0){
                i++;
            }
            while(arr[i] == m){
                m++;
            }
        }
        return m;
    }

    public static String binsSum (String a, String b){
        int av = 0;
        int bv= 0;
        if (a != null &&!a.isEmpty())
            av = Integer.parseInt(a, 2);
        if (b != null && !b.isEmpty())
            bv = Integer.parseInt(b, 2);
        return Integer.toBinaryString(av + bv);
    }

    public int stairs(int n) {
        int ft=1;
        int st=1;
        int sum=0;
        if(n == 1)
            return 1;
        for(int i=2;i<=n;i++){
            sum=ft+st;
            ft=st;
            st=sum;
        }
        return sum;
    }
}

class MyDataStructure {
    private LinkedHashMap<Integer, String> map;

    public MyDataStructure() {
        map = new LinkedHashMap<Integer, String>();
    }

    public void add(int key, String value) {
        map.put(key, value);
    }

    public void remove(int key) {
        map.remove(key);
    }

    public String get(int key) {
        return map.get(key);
    }
}

