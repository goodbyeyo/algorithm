# queue : 데이터를 선입선출 FIFO First in First Out 원칙 관리하는 선형 자료 구조
# python 에서는 큐는 deque 를 이용하면 된다

from collections import deque

# 큐 선언
q = deque()

# 맨 뒤에 원소 삽입
q.append(10)
q.append(20)
q.append(30)
q.append(40)
q.append(50)

# 큐 출력
print("큐 : ", q)

# 맨 잎의 원소 삭제
removed_element = q.popleft()
print("삭제된 원소 : ",removed_element)
print("삭제 후 큐 :", q)

# 맨 앞의 원소 확인
front_element = q[0]
print("맨 앞의 원소 : ", front_element)
print("현재 큐 :", q)
removed_element2 = q.pop()
print("맨 뒤의 원소 삭제 :", removed_element2)
print("현재 큐 :", q)

# 큐 크기 확인
print("큐의 크기 :", len(q))
print()

# 특정 값 존재 여부 확인
print(10 in q)
print(20 in q)

# 큐 순회
while q:
    print(q.popleft(), end=' ') # 가장 첫번째 원소부터 출력