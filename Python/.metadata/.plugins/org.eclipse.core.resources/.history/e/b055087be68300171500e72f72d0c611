import urllib
def print_list(list):
    for i in list:
        print(i)
        
def demo():
    s=urllib.urlopen('http://blog.kamidox.com')
    #lines=s.readlines()
    print(s.getcode())#200
    #print_list(lines)
    #for i in range(10):
    #    print('line %d:%s' %(i+1,s.readline()))
    #print(s.readline())
    #print(s.read(10))
    
    #msg=s.info()
    #print(msg.getheader('Content-Type'))
    #print_list(msg.headers)
    #print_list(msg.items())
    
    #get methods
    #print_list(dir(msg))
    
def progress(blk,blk_size,total_size):
    print('%d/%d-%.02f%%' % (blk*blk_size,total_size,(float)(blk*blk_size)*100/total_size))
def retrieve():
    fname,msg=urllib.urlretrieve('http://blog.kamidox.com', 'index.html',reporthook=progress)
    #fname1=urllib.urlretrieve('http://baidu.com', 'search.html')
    print(fname)
    #print_list(msg.items())
if __name__=='__main__':
    demo()
    retrieve()