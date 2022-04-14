n = str(input())
for i in range(26):
    print(n.find(chr(97+i)), end=" ") #str를 아스키코드 변환; chr()
