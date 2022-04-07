n=int(input())
cnt=0
fn=n
while(1):
    if (n<10):
        a = 0
        b = n
        if(a+b >= 10):
            n = b*10 + (a+b-10)
        else:
            n = b*10 + (a+b)
        cnt+=1
        if (fn == n):
            print(cnt)
            break

    else:
        a = int(n/10)
        b = n%10
        if(a+b >= 10):
            n = b*10 + (a+b-10)
        else:
            n = b*10 + (a+b)
        cnt+=1
        if (fn == n):
            print(cnt)
            break

