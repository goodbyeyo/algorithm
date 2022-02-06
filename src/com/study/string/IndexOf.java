package com.study.string;

public class IndexOf {
    public static void main(String[] args) {

        String str[] = {"test", "teacher"};
        System.out.println(new IndexOf().solve(str));

//        substying(BeginIndex, endIndex)
//        substring(Index)
//        indexOf(String str) 문자의 위치를 리턴, 없으면 -1
//        indexOf(String str, int formIdx) 문자의 위치를 리턴, fromidx 이후

//        String s= "12341234";
//        s.substring(0,8); // 12341234;
//        s.substring(1); // 2341234
//        int index = s.indexOf("23");    // 1
//        int index2 = s.indexOf("23", 2);    // 5
//        int index3 = s.indexOf("23", 24;    // 5
//        int indexx = s.indexOf("21");    // -1


    }


    public String solve(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        // 1
        String firstStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length()-1);  //
            }
        }
        return firstStr;
    }

}
