n = int(input())
cnt=n
for i in range(n):
    word = input()
    for j in range(len(word)-1):
        if word[j] == word[j+1]: #앞뒤문자가 같다면 그룹문자
            pass #묶음처리 (그룹문자)
        elif word[j] in word[j+1:]: #앞뒤문자가 다르고 뒤에 앞과 같은 문자가 나온다면
            cnt -= 1 #그룹문자가 아님
            break #카운트에서 제외

print(cnt)
