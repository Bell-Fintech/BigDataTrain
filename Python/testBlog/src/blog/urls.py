from django.conf.urls import url
from . import views

urlpatterns = [
    
    #url(r'',views.imooc), 1111111
    #url(r'^$',views.imooc),blog/
    url(r'^imooc/$',views.imooc),
    #blog/article/1
    url(r'^article/(?P<article_id>[0-9]+)$',views.article_page,name='article_page'),
    url(r'^edit/$', views.edit_page,name='edit_page'),
    url(r'^edit/action$', views.edit_action,name='edit_action')
]