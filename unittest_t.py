#-*- coding: utf-8 -*-
import unittest
class Dict(dict):
	def __init__(self, **kw):
		super(Dict, self).__init__(**kw)
	def __getattr__(self, key):
		try:
			return self[key]
		except KeyError:
			raise AttributeError(r"'Dict' object has no attribute '%s'" % key)
	def __setattr__(self, key, value):
		self[key] = value


class TestDict(unittest.TestCase):
	
	def test__init__(self):
		d = Dict(a = 1, b ='test')
		self.assertEquals(d.a,1)
		

if __name__ == '__main__':
	unittest.main()
