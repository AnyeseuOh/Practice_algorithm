n1=int(input())
n2=str(input())
sum_n=0
for i in range(n1):
    sum_n += int(n2[i:i+1])
print(sum_n)
