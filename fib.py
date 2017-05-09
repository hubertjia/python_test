# -*- coding:utf-8 -*-
class Fib(object):
	def __init__(self):
		self.a = 0
		self.b = 1
	def __iter__(self):
		return self

	def next(self):
		self.a , self.b = self.b, self.a + self.b
		if self.a > 40 :
			raise StopIteration()

		return self.a


if __name__ == '__main__':
	for i in Fib():
		print i
		






