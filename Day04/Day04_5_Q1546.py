n=int(input())
arr=list(map(int, input().split()))
sum_n=0
max_n=max(arr)
for i in range(n):
    arr[i] = arr[i] / max_n * 100
    sum_n+=arr[i]

print(sum_n/n)
