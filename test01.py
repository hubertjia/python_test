class Anmial(object):
 	__slots__ = ('name', 'age')
 	pass
    

class Dog(Anmial):
	pass

class Cat(Anmial):
	__slots__ = ('sex')


if __name__ == "__main__":
    #ca = Cat()
    #ca.sex = 'femal'
    #ca.name = 'niunai'
    #ca.score = 100
    #print ca.sex
    #print ca.name
    #print ca.score
    d = Dog()
    d.name = 'nainiu'
    d.score = 30
    print d.name	
    print d.score			
		


