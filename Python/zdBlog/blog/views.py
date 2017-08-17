# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.shortcuts import render

# Create your views here.
from django.http import  HttpResponse
from django.shortcuts import  render
from blog.models import *
from  datetime import  date
# Create your tests here.
def hello(request):
    #return  HttpResponse("<h1>hello zd !</h1>")
    name='zd'
    age=18
    return  render(request,'hello.html',locals())
def index(request):
    d=date.today()
    articles=Article.objects.all()
    return  render(request,'index.html',locals())
def articles(request,pid):
    articles=Article.objects.get(id=pid)
   # return  render(request,'article.html',locals())
    return render(request, 'index.html', locals())