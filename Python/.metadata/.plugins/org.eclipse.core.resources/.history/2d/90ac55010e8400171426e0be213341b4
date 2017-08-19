import urllib2
def urlopen():
    url='http://blog.kamidox.com/no'
    try:
        s=urllib2.urlopen(url, timeout=3)
    except urllib2.HTTPError,e:
        print(e)
    else:
        print(s.read(100))
        s.close()
    
if __name__=='__mian__':
    urlopen()
    