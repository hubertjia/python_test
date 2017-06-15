import json
class Student(object):
	def __init__(self, name, age, score):
		self.name = name
		self.age = age
		self.score = score


def studentToDict(stu):
	return {
		'name': stu.name,
		'age': stu.age,
		'score': stu.score
	}

s = Student('Jaeger',25,100)
print (json.dumps(s, default=studentToDict))
print (json.dumps(s, default=lambda obj:obj.__dict__))