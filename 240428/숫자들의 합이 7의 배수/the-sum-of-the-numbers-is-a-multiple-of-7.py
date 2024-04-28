n = int(input())
numbers = [
    int(input())
    for _ in range(n)
]
    
max_length = 0
prefix_sum = 0
remainder_index = {}
    
remainder_index[0] = -1 
for i in range(n):
    prefix_sum += numbers[i]
    remainder = prefix_sum % 7
        
    if remainder not in remainder_index:
        remainder_index[remainder] = i
    else:
        max_length = max(max_length, i - remainder_index[remainder])
    
print(max_length)