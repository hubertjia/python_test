# -*- coding:utf-8 -*-
class Fib(object):
	def __init__(self):
		self.a = 0
		self.b = 1

	def __getitem__(self,n):
		if isinstance(n,int):
			for x in range(n):
				self.a ,self.b = self.b,self.a + self.b
			return self.a
		if isinstance(n,slice):
			start = n.start
			stop = n.stop
			L = []
			for x in range(stop):
				if x > start:
					L.append(self.a)
				self.a ,self.b = self.b, self.a + self.b
			return L

if __name__ == '__main__':
	f = Fib()
	print f[0:5]	
		





