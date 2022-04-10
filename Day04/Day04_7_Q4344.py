n=int(input())
sc_list=[]
for i in range(n):
    cnt=0
    sc_list= list(map(int, input().split()))
    avg = (sum(sc_list)-sc_list[0])/sc_list[0]
    for i in sc_list:
        if (i == sc_list[0]):
            continue
        elif (i > avg) :
            cnt+=1
    res = cnt/sc_list[0]*100
    print(f"{format(res, '.3f')}%")
