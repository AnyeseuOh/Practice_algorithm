cnt=0
n = int(input()) #입력

if (n==1) : cnt=1
else :
    for i in range(1, n+1): #1보다 크거나 같고 N보다 작거나 같은
        if (i < 100):
            cnt += 1

        else :
            num=[]
            for j in range(len(str(i))):
                num.append(int(str(i)[j:j+1]))

            diff=[]
            for j in range(len(num)-1):
                diff.append(num[j+1] - num[j])
    
            if (len(list(set(diff))) != 1):
                continue
            else:
                cnt += 1

print(cnt)
