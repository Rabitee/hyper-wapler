# Greedy: 룰을 따라 큰 수가 적힌 카드 뽑기

# input
N, M = map(int, input().split())
card = []
for i in range(N):
    card.append(list(map(int, input().split())))

# solve
pick = []
for i in card:
    pick.append(min(i))

print(max(pick))
