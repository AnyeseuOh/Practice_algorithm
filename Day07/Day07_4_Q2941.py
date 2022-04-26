cr = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
cnt=0
s_input = input()
for i in cr:
    cnt = cnt + s_input.count(i)
print(len(s_input)-cnt)
