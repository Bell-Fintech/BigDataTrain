# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.shortcuts import render
from blog.models import BlogsPost
from blog.models import Article
from . import models
from django.shortcuts import render_to_response
from django.http import HttpResponse
# Create your views here.
def index(request):
    blog_list=BlogsPost.objects.all()
    return render_to_response('index.html', {'blog_list':blog_list})

def imooc(request):
    #return HttpResponse("hello imooc")
    #if-else
    #list
    
    articles=Article.objects.all()
    #s
    return render(request,'blog/imooc.html',{'articles':articles})
     #key value
     
     #article=models.Article.objects.get(pk=1)
     #return render(request,'blog/imooc.html',{'article':article})
     
    #return render(request, 'blog/imooc.html',{'hello':'hello zd;'})
   
def article_page(request,article_id):
    article=Article.objects.get(pk=article_id)
    return render_to_response('blog/article_page.html',{'article':article})

def edit_page(request):
    return render(request,'blog/EditPage.html')

def edit_action(request):
    title1=request.POST.get('title1','new title')
    content=request.POST.get('content','new CONTENT')
    models.Article.objects.create(title1=title1,content=content)
    articles=Article.objects.all()
    return render(request,'blog/imooc.html',{'articles':articles})