from queue import PriorityQueue

# 우선순위 큐 선언
pq = PriorityQueue()

# 원소 삽입 [우선순위, 값]
pq.put([-40, 40])
pq.put([-30, 30])
pq.put([-20, 20])
pq.put([-10, 10])

# 우선순위 큐 출력
# 최대 힙을 쓰고 싶고 val이라는 값을 넣을 때는
# [-val, val] 형태로 넣고, 빼서 쓸 때는 두 번째 인자를 사용하면 된다
print("우선순위 큐:", pq.queue)
print(pq.queue)
print()

# 최상위 원소 삭제 (우선순위가 가장 높은 원소를 삭제)
removed_element = pq.get() # .get() : 최상위 원소가 빠져나옴
print("삭제된 원소:", removed_element)
print("실제 쓸 값:", removed_element[1])
print("삭제 후 우선순위 큐:", pq.queue)
print()

# (삭제하지 않고) 최상위 원소 확인
top_element = pq.queue[0]
print("최상위 원소:", top_element)
print("현재 우선순위 큐:", pq.queue)
print()

# 우선순위 큐의 크기 확인
print("우선순위 큐의 크기:", len(pq.queue))
print()

# 우선순위 큐가 비어 있는지 확인
print("우선순위 큐가 비어 있는지 확인:", pq.empty())
print()

# 우선순위 큐 그냥 순회
for u in pq.queue:
    print(u[1], end=' ') # 실젝 값 출력
print()
print()

# 우선순위 큐 순회 (우선순위 대로 순회)
while pq.queue:  # not pq.empty()
    print(pq.get()[1], end=' ')