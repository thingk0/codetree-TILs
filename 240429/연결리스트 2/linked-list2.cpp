#include <bits/stdc++.h>

using namespace std;

struct Node {
    int id;
    Node *prev, *next;
    Node(int id) : id(id), prev(nullptr), next(nullptr) {}
};

void insert_prev(Node *u, Node *singleton) {
    singleton->prev = u->prev;
    singleton->next = u;
    if (nullptr != singleton->prev) {
        singleton->prev->next = singleton;
    }

    if (nullptr != singleton->next) {
        singleton->next->prev = singleton;
    }
}

void insert_next(Node *u, Node *singleton) {
    singleton->prev = u;
    singleton->next = u->next;
    if (nullptr != singleton->prev) {
        singleton->prev->next = singleton;
    }
    if (nullptr != singleton->next) {
        singleton->next->prev = singleton;
    }
}

void pop(Node *u) {
    if (nullptr != u->prev) {
        u->prev->next = u->next;
    }
    if (nullptr != u->next) {
        u->next->prev = u->prev;
    }

    u->prev = u->next = nullptr;
}

int main() {

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, q;
    cin >> n >> q;

    Node *nodes[n + 1] {};
    for (int i = 1; i <= n; i++) {
        nodes[i] = new Node(i);
    }

    for (int t = 0; t < q; t++) {
        int type, i, j;
        cin >> type >> i;

        if (type == 1) {
            pop(nodes[i]);
        } else if (type == 2) {
            cin >> j;
            insert_prev(nodes[i], nodes[j]);
        } else if (type == 3) {
            cin >> j;
            insert_next(nodes[i], nodes[j]);
        } else if (type == 4)  {
            cout << ((nodes[i]->prev == nullptr) ? 0 : nodes[i]->prev->id) << ' ' 
            << ((nodes[i]->next == nullptr) ? 0 : nodes[i]->next->id) << '\n';
        }
    }

    for (int i = 1; i <= n; i++) {
        cout << ((nodes[i]->next == nullptr) ? 0 : nodes[i]->next->id) << ' ';
    }
    return 0;
}