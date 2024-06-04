from collections import Counter

freq = Counter()
while True:
    ipt = input()
    
    if ipt == 'end':
        break
    
    freq.update(ipt.split())
    
    for ch, cnt in freq.items():
        print(f"{ch} : {cnt}")