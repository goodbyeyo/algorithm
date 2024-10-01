# 문자열 길이
value1 = "Hello"
value2 = "Hi"
print("문자열 길이 :", len(value1))

# 특정 위치의 문자 확인
print("인덱스 0의 문자", value1[0])
print("인덱스 1의 문자", value1[1])
print("인덱스 2의 문자", value1[2])
print("인덱스 3의 문자", value1[3])
print("인덱스 4의 문자", value1[4])
# print("인덱스 5의 문자", value1[5]) # string index out of range 발생

# 문자열 자르기
print("자른 문자열 :", value1[0:4]) # 0번인덱스부터 4번인덱스까지

# 특정 문자 의 포함(존재) 확인
print("llo" in "Hello")
print("hello" in "HellO") # 대소문자 구별함