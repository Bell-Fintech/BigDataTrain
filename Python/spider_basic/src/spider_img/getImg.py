import urllib
import re
def getHtml(url):
    page=urllib.urlopen(url)
    html=page.read()
    return html
def getImg(html):
    reg=r'data-objburl="(.+?\.jpg)" pic_ext'
    imgre=re.compile(reg)
    imglist=re.findall(imgre,html)
    x=0
    for imgurl in imglist:
        urllib.urlretrieve(imgurl, '%s.jpg' %x)
        x+=1
    return imglist
    
html=getHtml("http://image.baidu.com/search/index?tn=baiduimage&ipn=r&ct=201326592&cl=2&lm=-1&st=-1&fm=result&fr=&sf=1&fmq=1503127325707_R&pv=&ic=0&nc=1&z=&se=1&showtab=0&fb=0&width=&height=&face=0&istype=2&ie=utf-8&word=mac%E5%A3%81%E7%BA%B8")
#print html

if __name__=='__main__':
    getImg(html)