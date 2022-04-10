arr=[]

for i in range(10):
    arr.append((int(input())%42))

result=list(set(arr))
print(len(result))
