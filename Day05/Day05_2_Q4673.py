a=[]
for i in range(10000):
    end=0
    if (i < 10):
        a.append(i+i)
    else :
        end = i # 11
        for j in range(len(str(i))): #1 2
            end = end + int(str(i)[j:j+1]) #11+1 #12+1
        a.append(end)

list(set(a)) #중복 제거
     
for i in range(10000):
    if (i not in a): #1~10000까지 리스트에 없는 숫자 출력
        print(i)
