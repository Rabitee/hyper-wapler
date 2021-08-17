#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, k;
    cin >> n >> k;
    int cnt = 0;
    while(n != 1) {
        if(n % k == 0) {
            n /= k;
        }
        else {
            n--;
        }
        cnt++;
    }

    cout << cnt;
    return 0;
}