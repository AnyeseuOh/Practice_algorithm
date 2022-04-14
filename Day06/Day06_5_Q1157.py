n = str(input())
cnt=[]
n_c=n.upper() #소문자가 있다면 대문자로 통합
n_nd = list(set(n_c)) #중복제거 #정렬
q=[] #max값 중복확인용 (question mark 확인용)

for i in range(len(n_nd)):
    cnt.append(n_c.count(n_nd[i])) #글자 개수 cnt에 저장

for i in enumerate(cnt): #인덱스와 함께 뽑기 위해 enumerate 사용
    if i[1] == max(cnt): #최대값이라면 인덱스를 q에 추가
        q.append(i[0])
              
if (len(q) > 1): #q가 2개 이상이라면 최대값이 중복이므로
    print("?") # ?를 출력
else :
    print(n_nd[q[0]])
