import sys

n=int(sys.stdin.readline())
res=[]
for i in range(n):
    a,b = map(int, sys.stdin.readline().split())
    res.append(a+b)

for i in range(n):
    print(res[i])
