#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, m, k;
    cin >> n >> m >> k;

    vector<int> arr;

    for(int i = 0; i < n; i++) {
        int num;
        cin >> num;
        arr.push_back(num);
    }

    sort(arr.begin(), arr.end(), greater<int>());

    int result = 0;
    int limit = k;
    for(int i = 0; i < m; i++) {
        if(limit == 0) {
            result += arr[1];
            limit = k;
        } else {
            result += arr[0];
            limit--;
        }
        
    }

    cout << result;
    return 0;
}