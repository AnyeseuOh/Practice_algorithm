h,m=map(int, input().split())
if(m<45):
    if(h==0):
        h=23
    else: h=h-1
    m=m+60-45
else: m=m-45
print(h, m)
