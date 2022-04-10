n = int(input()) # 테스트케이스 개수

for i in range(n): # 테스트케이스 개수만큼
    quiz=list(input()) # 리스트를 입력받는다

    cnt=0 # 값 초기화
    res=0
    
    for j in range(len(quiz)): # 입력받은 내용의 길이만큼 O와 X를 체크
        if (quiz[j] == "O"): # 만약 O라면
            cnt+=1 # 카운트값을 1더하고
            res=res+cnt # 결과에 더한 카운트값을 합한다
        else: # X라면
            cnt=0 # 카운트를 0으로 초기화한다
    print(res)
