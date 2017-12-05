from django.db import models

class exarticle(models.Model):
    title = models.CharField(max_length=32)
    content = models.TextField(null = True)

    def __str__(self):
        return self.title


class identity(models.Model):
    usersname = models.CharField(max_length=32)
    password = models.CharField(max_length=32)