res=[]

while (1):
    a,b = map(int, input().split())
    if (a!=0 and b!=0):
      res.append(a+b)
    else: break

for i in range(len(res)):
    print(res[i])
