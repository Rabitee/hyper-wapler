# Greedy: M번 더해 가장 큰 수 만들기

# input
N, M, K = map(int, input().split())
number = list(map(int, input().split()))

# solve
number.sort(reverse=True)
sum = (M // K) * K * number[0] + (M % K) * number[1]
        
print(sum)
