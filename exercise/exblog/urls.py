from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^exarticle/$',views.exarticle),
    url(r'^page/(?P<exarticle_id>[0-9]+)$',views.exarticle_page,name='page'),
    url(r'^edit/$',views.edit_page,name='Edit_page'),
    url(r'^edit/action/$',views.edit_action,name='Edit_action'),
    url(r'^message/edit/$', views.message_edit, name='edit'),
    url(r'^message/page/$', views.message_page, name='page'),
    url(r'^Login/$', views.Login_page, name='Login_page'),
    url(r'^Login/action/$', views.Login_action, name='Login_action'),
    url(r'^register/page/$', views.register_page, name='register_page'),
    url(r'^registe/$', views.registe, name='registe'),
]

