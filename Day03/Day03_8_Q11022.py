n=int(input())
ar=[]
br=[]
res=[]

for i in range(n):
    a,b=map(int, input().split())
    ar.append(a)
    br.append(b)
    res.append(a+b)
for i in range(n):
    print(f"Case #{i+1}: {ar[i]} + {br[i]} = {res[i]}")
