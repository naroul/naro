from django.shortcuts import render
from . import models
from django.http import HttpResponseRedirect


def exarticle(request):
    exa = models.exarticle.objects.all()
    return render(request,'exblog.html',{'a':exa})

def exarticle_page(request,exarticle_id):
    exar = models.exarticle.objects.get(pk=exarticle_id)
    return render(request,'page.html',{'page':exar})

def edit_page(request):
    return render(request,'Edit_page.html')

def edit_action(request):
    title = request.POST.get('title','TITLE')
    content = request.POST.get('content','CONTENT')
    models.exarticle.objects.create(title=title,content=content)
    exa = models.exarticle.objects.all()
    return render(request,'exblog.html',{'a':exa})

def message_page(request):
    message = models.exarticle.objects.all()
    return render(request,'message.html',{'message':message})

def message_edit(request):
    title = request.POST.get('title','TITLE')
    content = request.POST.get('Content','没有内容')
    models.exarticle.objects.create(title=title,content=content)
    return HttpResponseRedirect('/ex/message/page/')
    #message = models.exarticle.objects.all()
    #return render(request,'message.html',{'message':message})

def Login_page(request):
    return render(request, 'Login.html')

def Login_action(request):
    usersname = request.POST.get('Usersname','null')
    password = request.POST.get('Password','null')
    try:
        if usersname == models.identity.objects.get(usersname=usersname).usersname:
            if password == models.identity.objects.get(usersname=usersname).password:
                return HttpResponseRedirect('/ex/message/page/')
            else:
                return HttpResponseRedirect('/ex/register/page/')
    except BaseException:
            return HttpResponseRedirect('/ex/register/page/')


def register_page(request):
    return render(request,'register.html')

def registe(request):
    usersname = request.POST.get('Usersname','naro')
    password = request.POST.get('Password','123456')
    models.identity.objects.create(usersname=usersname,password=password)
    return HttpResponseRedirect('/ex/Login/')





