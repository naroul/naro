from django.shortcuts import render,get_object_or_404
from django.http import HttpResponse
from django.http import  HttpResponseRedirect
from django.shortcuts import render
from .models import Post



def index(request):
    post_list = Post.objects.all().order_by('created_time')
    return render(request,'blog/index.html',context={
        'title' : 'naro的博客首页',
        'post_list' : post_list
    })


def page(request,pk):
    pages = get_object_or_404(Post, pk=pk)
    return render(request, 'blog/page.html', context={'pages': pages})

