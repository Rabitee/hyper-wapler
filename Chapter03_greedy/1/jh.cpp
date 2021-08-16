#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int coins[4] = { 500, 100, 50, 10 };
    int N;
    cin >> N;
    int res = 0;
    for(int i = 0; i < 4; i++) {
        res += N / coins[i];
        N %= coins[i];
    }

    cout << res << "\n";

    return 0;
}