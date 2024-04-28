#include <iostream>
#include <string>
#include <vector>

using namespace std;

int n;
string str;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> str;
    n = (int)str.size();

    int arr[n];
    arr[n - 1] = 0;
    for (int i = n - 2; i >= 0; --i) {
        if (str[i] == ')' && str[i + 1] == ')') {
            arr[i] = arr[i + 1] + 1;
        } else {
            arr[i] = arr[i + 1];
        }
    }

    long long res = 0;
    for (int i = 0; i < n - 2; i++) {
        if (str[i] == '(' && str[i + 1] == '(') {
            res += arr[i + 2];
        }
    }

    cout << res;
    return 0;
}