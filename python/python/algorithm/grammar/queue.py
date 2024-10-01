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