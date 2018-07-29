n = int(input())
A = list(map(int,input().split()))
for i in range(1,n):
    k = A[i]
    for j in range(i-1,-1,-1):
        if k<A[j]:
            A[j+1]=A[j]
            A[j] = k
    print(",".join(map(str,A)),end=",\n")
