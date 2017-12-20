# -*- coding: utf-8 -*-

import django.utils.timezone as timezone
from django.db import models
from django.contrib.auth.models import AbstractUser


class User(AbstractUser, models.Model):
    head_sculpture = models.ImageField(null=True, blank=True, verbose_name=u'头像')
    sex = models.CharField(max_length=5, verbose_name=u'性别')
    born_date = models.DateField(null=True, blank=True, verbose_name=u'出生年月')
    registration_date = models.DateTimeField(default=timezone.now, verbose_name=u'注册日期')

    class Meta(AbstractUser.Meta):
        pass
