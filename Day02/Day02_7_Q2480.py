a,b,c=map(int, input().split())
if(a==b and b==c):
    money=10000+a*1000
elif((a==b or a==c or b==c)):
    if(a==b or a==c):
        money=1000+a*100
    else:
        money=1000+b*100
else:
    money=max(a,b,c)*100
print(money)
