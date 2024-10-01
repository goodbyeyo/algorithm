# 해시테이블 : key,value 자료구조
# pythob 에서의 해시테이블은 dict 사용

# 해시테이블 선언
dt = {}
dt2 = dict() # 딕셔너리

dt["apple"] = 50
dt["grape"] = 70
dt["orange"] = 20

# 딕셔너리 출력
print("dictionary :", dt)
print()

# 특정 키 값 조회
print("orange 값 :", dt["orange"])
print()

# 특정 키 값 삭제
del dt["grape"]
print("del grape after dictionary :", dt)

# 딕셔너리 크기 확인
print("dictionary size:", len(dt))
print()

# 특정 키 존재 여부 확인
print("apple" in dt)
print("banana" in dt)