# -*- coding:utf-8 -*-

class Animal(object):
	def __init__(self, name,age):
		self.name = name
		self.age = age
	def __str__(self):
		return 'The name is %s ,and the age is %d' % (self.name,self.age)
	__repr__ = __str__


if __name__ == '__main__':
	a = Animal('cat',5)
	print a
	a
