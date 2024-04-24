#include <iostream>
#include <queue>
#include <string>

using namespace std;

int main() {
    priority_queue<int> pq;

    int n, t;
    cin >> n;
    
    string cmd;
    for (int i = 0; i < n; i++) {
        cin >> cmd;
        if (cmd == "push") {
            cin >> t;
            pq.push(t);
        } else if (cmd == "size") {
            cout << pq.size() << endl;
        } else if (cmd == "pop") {
            cout << pq.top() << endl;
            pq.pop();
        } else if (cmd == "empty") {
            cout << pq.empty() << endl;
        } else if (cmd == "top") {
            cout << pq.top() << endl;
        }
    }

    return 0;
}