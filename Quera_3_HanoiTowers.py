From = []
Aux = []
To = []

def hanoi(n, A, B, C):
    if n==1:
        B.append(A.pop())
        show_towers()
        return
    hanoi(n-1, A, C, B)
    B.append(A.pop())
    show_towers()
    hanoi(n-1, C, B, A)

def show_towers():
    print(sum(From), sum(Aux), sum(To))

def fill_bars():
    for i in range(n,0,-1):
        From.append(i)

n = int(input())
fill_bars()
show_towers()
hanoi(n, From, To, Aux)
