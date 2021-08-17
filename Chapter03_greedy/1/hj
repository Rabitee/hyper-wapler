# Greedy: 동전의 최소 개수 구하기

N = int(input('거슬러 줄 돈을 입력하세요: '))
exchange = [500, 100, 50, 10]

coin = 0    
for i in exchange:
    coin += (N // i)
    N %= i
    
print(coin)
