# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models

# Create your models here.
from django.contrib import admin
class BlogsPost(models.Model):
     title=models.CharField(max_length=150)
     body=models.TextField()
     timestamp=models.DateTimeField()
     
#继承
class BlogPostAdmin(admin.ModelAdmin):
    list_display=('title','timestamp')
    
admin.site.register(BlogsPost)
    