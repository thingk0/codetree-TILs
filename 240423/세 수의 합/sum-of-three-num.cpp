#include <iostream>
#include <unordered_map>

using namespace std;

int n, k, res = 0;
unordered_map<int, int> freq;

int main() {

    cin >> n >> k;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        freq[arr[i]]++;
    }

    for (int i = 0; i < n; i++) {
        freq[arr[i]]--;
        for (int j = 0; j < i; j++) {
            if (freq.count(k - arr[i] - arr[j]) > 0) {
                res += freq[k - arr[i] - arr[j]];
            }   
        }
    }

    cout << res;
    return 0;
}