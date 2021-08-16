#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, m;
    cin >> n >> m;
    int arr[n][m];

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }
    int res = 0;

    for(int i = 0; i < n; i++) {
        int min_val = *min_element(arr[i], arr[i] + m);
        res = max(res, min_val);
    }

    cout << res << "\n";

    return 0;

}