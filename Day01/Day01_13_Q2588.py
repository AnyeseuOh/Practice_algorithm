a=int(input())
b=int(input())
print(a*(b%10))
print(a*int(((b%100)-(b%10))/10))
print(a*int(b/100))
print(int(a*int(b/100)*100+ a*(((b%100)-(b%10))/10)*10 + a*(b%10)))