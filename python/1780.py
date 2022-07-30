import sys

def check(n, num_list, start_y, start_x):
	temp = num_list[start_y][start_x]
	for y in range(start_y, start_y + n):
		for x in range(start_x, start_x + n):
			if temp != num_list[y][x]:
				return False, 0
	return True, temp

def solution(n, num_list):
	result = {-1: 0, 0: 0, 1: 0}

	def recur(n, num_list, start_y, start_x):
		[res, value] = check(n, num_list, start_y, start_x)
		if res:
			result[value] += 1
		else:
			diveded_n = n // 3
			for y in range(3):
				for x in range(3):
					recur(diveded_n, num_list, start_y + y * diveded_n, start_x + x * diveded_n)
	
	recur(n, num_list, 0, 0)

	for key in result:
		print(result[key]) 


n = int(input())
num_list = []
for i in range(n):
	line = sys.stdin.readline().split(" ")
	num_list.append(list(map(int, line)))

solution(n, num_list)
