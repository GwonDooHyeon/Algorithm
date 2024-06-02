# https://www.acmicpc.net/problem/1978

n = int(input())
num_list = list(map(int, input().split()))
count = 0

max = 1000

prime = [True for i in range(max + 1)]

prime[1] = False

for i in range(2, int(max ** 0.5) + 1):
    if prime[i]:
        j = 2
        while i * j <= max:
            prime[i*j] = False
            j += 1

for i in num_list:
    if prime[i]:
        count += 1

print(count)
