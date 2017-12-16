import markdown
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


def detail(request,pk):
    post = get_object_or_404(Post, pk=pk)
    post.content = markdown.markdown(post.content,
                                     extensions=[
                                         'markdown.extensions.extra',
                                         'markdown.extensions.codehilite',
                                         'markdown.extensions.toc',
                                     ])
    return render(request, 'blog/detail.html', context={'post': post})

