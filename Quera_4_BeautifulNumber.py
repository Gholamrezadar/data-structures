import time

n = int(input())

time.clock()
def isBeautiful(a):
    first_zero = a.find('0')
    first = a[:first_zero]
    second = a[first_zero:]
    if first.find('0') != -1:
        return False
    elif second.find('1') != -1:
        return False
    else:
        if len(first) == len(second)+1:
            return True
        else:
            return False

for i in range(n,0,-1):
    a = bin(i)[2:]
    if(isBeautiful(a) or i==1):
        print(i)
        #break
print(float(time.clock())*1000,"ms")
