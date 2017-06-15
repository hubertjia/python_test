import re
test3 = 'a,b,d'
test = 'a,b  c d'

print test3.split(',')
print re.split(r'[\s,]+', test)

test1 = 'a,b;;  c  d'
print re.split(r'[\s,;]+', test1)