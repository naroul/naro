from django.conf.urls import url
from . import views

app_name = 'blog'

urlpatterns = [
    url(r'^index/$', views.index, name='index'),
    url(r'^page/(?P<pk>[0-9]+)/$', views.page, name='page'),
    ]