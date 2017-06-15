import re
test = '010-9090'
patt = r'\d{3}-\d{4}'
if re.match(patt,test):
    print 'ok'
else:
    print 'failed'