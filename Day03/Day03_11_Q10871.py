n,x= map(int, input().split())
anw=[]
arr = list(map(int, input().split()))
for i in range(n):
    if (arr[i]< x):
        anw.append(arr[i])

for i in range(len(anw)):
    print(f"{anw[i]}",end=" ")
