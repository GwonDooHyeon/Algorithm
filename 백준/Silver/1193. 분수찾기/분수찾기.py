# https://www.acmicpc.net/problem/1193

# 8 => 2/3
n = int(input())

cnt = 1

# n = n - cnt = 7
# n = n - cnt = 5
# n = n - cnt = 2
# n = n - cnt = -2
# n이 음수가 되는 경우 그 해당 cnt에 있는 숫자들 중에 값이 있다.
#

# 1/1                  => 1
# 1/2, 2/1             => 2 ( 오른쪽 대각선 -> 왼쪽 대각선 )
# 3/1, 2/2, 1/3        => 3 ( 왼쪽 대각선 -> 오른쪽 대각선 )
# 1/4, 2/3, 3/2, 4/1   => 4 ( 오른쪽 대각선 -> 왼쪽 대각선 )

# cnt가 짝수인 경우는 오른쪽 대각선 -> 왼쪽 대각선
# cnt가 홀수인 경우는 왼쪽 대각선 -> 오른쪽 대각선


while True:
    n = n - cnt
    if n <= 0:
        break
    cnt += 1

if cnt % 2 == 0:
    print(f'{cnt+n}/{1-n}')
else:
    print(f'{1-n}/{cnt+n}')