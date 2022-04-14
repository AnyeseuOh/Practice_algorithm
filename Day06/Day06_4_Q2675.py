n = int(input())
b=[]
for i in range(n):
    a,b = input().split()
    
    for k in range(len(b)):
        for j in range(int(a)):
            print(b[k:k+1], end="")
    print()
