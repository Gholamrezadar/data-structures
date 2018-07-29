import time

n = int(input())

time.clock()
def isBeautiful(a):
    if a[0]=='0':
        return False
    
    for i in range(1,len(a)):
        if a[i-1]=='0':
            if a[i]=='1':
                return False
    if a.count('1')-1==a.count('0'):
        return True
    else:
        return False

for i in range(n,0,-1):
    a = bin(i)[2:]
    if(isBeautiful(a) or i==1):
        print(i)
        #break
print(float(time.clock())*1000,"ms")
