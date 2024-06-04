_dict = {}
while True:
    _input = input()

    if _input == 'end':
        break

    for ch in list(_input.split()):
        _dict[ch] = _dict.get(ch, 0) + 1
    
    for k, v in _dict.items():
        print(k, ':', v)