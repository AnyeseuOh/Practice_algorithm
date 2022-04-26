s_input = input()
list(s_input)
s_sum=0
for i in s_input:
    if (i in ['A', 'B', 'C']):
        s_sum += 3
    elif (i in ['D','E','F']):
        s_sum += 4
    elif (i in [ 'G', 'H' , 'I']):
        s_sum += 5
    elif (i in ['J' , 'K' ,'L']):
        s_sum += 6
    elif (i in ['M' , 'N' , 'O']):
        s_sum += 7
    elif (i in ['P' , 'Q' , 'R' , 'S']):
        s_sum += 8
    elif (i in ['T' , 'U' , 'V']):
        s_sum += 9
    elif (i in ['W','X','Y' ,'Z']):
        s_sum += 10
print(s_sum)

