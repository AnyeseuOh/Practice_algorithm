a= int(input())
b= int(input())
c= int(input())
num=[0 for i in range(10)]
result = str(a*b*c)

for i in range(len(result)):
    n = int(result[i:i+1])
    num[n]+=1

for i in range(10):
    print(num[i])
