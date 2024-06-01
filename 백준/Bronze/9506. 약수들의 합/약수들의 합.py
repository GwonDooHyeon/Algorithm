# https://www.acmicpc.net/problem/9506
while True:
    n = int(input())
    if n == -1:
        break
    arr = []
    half = n // 2

    for i in range(1, half + 1):
        if n % i == 0:
            arr.append(i)

    if sum(arr) == n:
        print(f'{n} = {" + ".join(str(i) for i in arr)}')
    else:
        print(f'{n} is NOT perfect.')