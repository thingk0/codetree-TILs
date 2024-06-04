# 암호화된 문자열 입력 받기
encrypted_str = input()

# 변환 규칙 입력 받기
substitution_rule = input()
substitution_table = {cc: pc for cc, pc in zip(substitution_rule, map(chr, range(ord('a'), ord('z') + 1)))}

print(''.join(substitution_table.get(ch, ' ') for ch in encrypted_str))