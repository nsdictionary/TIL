# 첫 번째 계산
# 아이들은 여러 자리 숫자들을 더하기 위해서 우에서 좌로 숫자를 하나씩 차례대로 더 하라고 배웠다. 1을 한 숫자 위치에서 다음 자리로 더하기위해 이동하는 "한자리올림"연산을 많이 발견하는 것은 중요한 도전이 된다. 당신의 일은 교육자가 그들의 어려움을 평가하기 위하여, 덧셈 문제들의 각 집합에 대해서 한자리올림 연산들의 수를 계산하는 것이다.

# 입력
# 입력의 각 라인은 10개의 숫자들보다 미만인 양의 정수들 두 개를 포함한다. 입력의 마지막 라인은 0 0 을 포한한다.

# 출력
# 마지막을 제외한 입력의 각 라인에 대해서 당신은 두 숫자들을 더한 결과에서 한자리올림 연산들의 수를 아래 처럼 보여지는 형식으로 계산하여 출력해야 한다.

# 입력 샘플
# 123 456
# 555 555
# 123 594
# 0 0

# 출력 샘플
# No carry operation.
# 3 carry operations.
# 1 carry operation.


# inps = [['123', '123'], ['555', '555'], ['123', '594']]

inps = []
while True:
	t0 = input().split()
	inps.append(t0)
	if t0 == ['0', '0']: break

for l in inps:
	carry = ctotal = 0;
	for i in range( len(l[0]) - 1, -1, -1):
		carry = 1 if int(l[0][i]) + int(l[1][i]) + carry > 9 else 0
		ctotal += carry
	print( ( 'No' if ctotal == 0 else str(ctotal) ) + ' carry operations.')

