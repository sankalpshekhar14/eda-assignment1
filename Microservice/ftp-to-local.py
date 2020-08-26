import ftplib
import sys
 
def getFile(ftp, filename): #Get Files in ASCII Mode
    try:
        local_file = open(filename, 'w')
        ftp.retrlines('RETR ' + filename, open(filename).append)
        local_file.close()
    except:
        print("Error")
        
host="127.0.0.1"    #localhost
port="2100"         #serverport 2100

ftp = ftplib.FTP(host+":"+port)
ftp.login(user="username", passwd="password")
 
ftp.cwd('/eda/')          #change directory to /eda/ on the Mainframe
getFile(ftp,'sin.txt') 
ftp.quit()



