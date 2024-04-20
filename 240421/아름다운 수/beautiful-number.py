N = int(input())

beautiful_number_cnt = 0
selected = []

def is_beautiful_number():
    idx = 0
    while (idx < N):
        if idx + selected[idx] - 1 >= N:
            return False

        for i in range(idx, idx + selected[idx]):
            if selected[i] != selected[idx]:
                return False
        
        idx += selected[idx]

    return True

def duplicated_permutation(cnt):
    global beautiful_number_cnt
    if cnt == N:
        if is_beautiful_number():
            beautiful_number_cnt += 1
        return

    for num in range(1, 5):
        selected.append(num)
        duplicated_permutation(cnt + 1)
        selected.pop()

duplicated_permutation(0)
print(beautiful_number_cnt)