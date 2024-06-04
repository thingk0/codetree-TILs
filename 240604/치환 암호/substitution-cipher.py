encrypted = input()

rule = input()
table = {ch:chr(idx + 97) for idx, ch in enumerate(rule)}

print(''.join(table.get(ch, ' ') for ch in encrypted))