# -*- coding:utf-8 -*-
class Fib(object):
	def __init__(self):
		self.a = 0
		self.b = 1

	def __getitem__(self,n):
		
		for x in xrange(n):
			self.a , self.b = self.b , self.a + self.b

		return self.a

if __name__ == '__main__':
	f = Fib()
	print f[2]
	print f[10]


