package com.study.bigO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * [설명] numbers라는 int형 배열에서 모두 두번씩 들어가있는 숫자가 아닌 오직 한번만 등장하는 숫자를 찾는 코드 작성
 */
public class FindUniqueNumber {
    public static void main(String[] args) {
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        int result = findUniqueNumber.solution1(new int[]{1,2,2,3,3,4,4});
        int result2 = findUniqueNumber.solution2(new int[]{1,2,2,3,3,4,4});
        int result3 = findUniqueNumber.solution3(new int[]{1,2,2,3,3,4,4});
    }

    /**
     * List를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인
     * List에 들어있으면 List에서 빼내고 없으면 넣는다
     * 결과적으로 List에는 유일한 숫자만 들어있게 되므로 해당 숫자를 꺼내서 리턴한다
     * 시간 복잡도 : O(n) * O(n) -> O(n²)
     * 공간 복잡도 : o(n)
     */
    private int solution1(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            if (list.contains(num)) {
                list.remove((Integer)num);
            }else{
                list.add(num);
            }
        }
        return list.get(0);
    }

    /**
     * HashMap을 사용해서 배열에 들어있는 숫자를 키, 숫자의 등장횟수를 값으로 저장한다.
     * HashMap의 getOrDefault() 메서드 이용
     * 숫자의 등장 횟수가 1인 키값을 찾아서 리턴
     * 시간 복잡도 : O(n) + O(n) -> O(2n) -> O(n)
     * 공간 복잡도 : O(n)
     */
    private int solution2(int[] numbers) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int num : numbers) {
            numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (numberMap.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }

    /**
     * XOR 비트 연산자 (^)를 사용하는 방법
     * XOR 비트 연산자 : 두 비트가 서로 다를때 1(해당값을 리턴), 같으면 0을 리턴
     * [예시] 5 ^ 0 = 5 // 해당값을 리턴
     */
    private int solution3(int[] numbers) {
        int uniqueNum = 0;
        for (int num : numbers) {
            uniqueNum ^= num;
        }
        return uniqueNum;
    }



}
