# set : 중복되지 않는 요소들의 모임을 나타내는 자료구조
# 해시테이블 기반 : 해시를 통해서 값을 접근하는 형태의 구조
# 원소의 순서를 보장하지 않는다 (python) <-> c++ 의 set 은 이진 트리 탐색기반이므로 원소의 순서를 보장함
# 변수명 = set()

# 원소 추가 : 시간복잡도 : O(c) // 상수값 접근
s1=set()
s2=set()

s1.add(10)
s1.add(20)
s1.add(30)
s1.add(40)
s1.add(50)

s2.add(10)
s2.add(11)
s2.add(22)
s2.add(33)
s2.add(44)


# 출력
print("s1:", s1) # 정렬되어 있지 않다
print("s2:", s2) # 정렬되어 있지 않다

# 삭제 : 시간복잡도 : O(c) // 상수값 접근
s1.remove(20)
s1.add(50) # 중복되는 값 들어가지 않음
print("remove 20 after s1:", s1)

# 원소 존재 여부 확인 : 시간복잡도 : O(c) // 상수값 접근
print(33 in s1)
print(33 in s2)

# 집합 크기 확인 : 시간복잡도 : O(1) 
print(len(s1), len(s2))

# 합집합 연산
s3 = s1 | s2
print("s1 과 s2 합집합 : ", s3)

# 교집합 연산
s4 = s1 & s2
print("s1 과 s2 교집합", s4)

# 차집합
s5 = s1 - s2
print("s1 과 s2 차집합", s5)