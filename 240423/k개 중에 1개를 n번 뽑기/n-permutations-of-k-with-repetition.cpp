#include <iostream>
#include <vector>
using namespace std;

int K, N;
vector<int> v;

void permute() {
    if (v.size() == N) {
        for(auto i : v) {
            cout << i << ' ';
        }
        cout << endl;
        return;
    }

    for (int i = 1; i <= K; i++) {
        v.push_back(i);
        permute();
        v.pop_back();
    }
}

int main() {
    cin >> K >> N;
    permute();
    return 0;
}