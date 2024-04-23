#include <iostream>
#include <vector>

using namespace std;

int k, n;
vector<int> selected;

void print() {
    for (int i = 0; i < (int) selected.size(); i++) {
        cout << selected[i] << ' ';
    }
    cout << endl;
}

void permute(int cnt) {
    if (cnt == n) {
        print();
        return;
    }

    for (int i = 1; i <= k; i++) {
        selected.push_back(i);
        permute(cnt + 1);
        selected.pop_back();
    }
}


int main() {
    cin >> k >> n;
    permute(0);
    return 0;
}