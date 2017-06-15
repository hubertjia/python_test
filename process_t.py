import os

print 'Processing (%s) start ...' % os.getpid()
pid = os.fork()
if pid == 0 :
	print 'child %s and parent is %s .' % (os.getpid, os.getppid())

else :
	print 'i %s just created a child and id is %s ' %(os.getpid, pid)



