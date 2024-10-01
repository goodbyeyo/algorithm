arr = [100,200]

arr.append(10)
arr.append(20)
arr.append(30)

print("List : ", arr)
print()

# 배열 값 삭제
deleted_value = arr.pop(1)  # 200 이 삭제됨(2번째 배열값)
print("deleted value : ", deleted_value)
print("delete after value", arr)
print()

# 가장 마지막 원소 삭제
deleted_value = arr.pop() # 30 삭제됨(마지막 index)
print("deleted value : ", deleted_value)
print("delete after value", arr)
print()

# 특정 인덱스 접근
print("index 0 value :", arr[0])
print()

# 리스트 크기 확인
print("list size", len(arr))
print()

# 특정 값 포함 여부 확인
print(10 in arr) # 10 이 배열에 포함되어 있는지
print()
value = 500
print(value in arr)
