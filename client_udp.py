import socket

s = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
for temp in ['maic','jaeger','shmaping']:
    s.sendto(temp, ('127.0.0.1',9999))
    print s.recv(1024)
s.close()
