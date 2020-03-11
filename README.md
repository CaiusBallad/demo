[toc]

# 环境准备

## 双系统安装

Windows+Ubuntu双系统安装通用教程：https://www.cnblogs.com/masbay/p/11627727.html

针对Surface安装教程：https://www.jianshu.com/p/3d74e90af751

遇到的问题：

1. 无法U盘启动，也无法再进入Windows，卡在BitLocker的恢复界面中。分析原因是之前做了驱动备份器备份当前系统，登陆微软账号取得密钥才能进入系统。
2. 【待处理】Surface的适配问题：触摸屏失效，蓝牙鼠标实效，合盖后无法唤醒；https://github.com/jakeday/linux-surface
3. 中文输入法：https://blog.csdn.net/nanhuaibeian/article/details/85851335
4. 触摸区右键失灵：https://blog.csdn.net/weixin_38103350/article/details/75931010和https://blog.csdn.net/qq_36317016/article/details/80143557，其中最后启动的命令为：gnome-tweaks

## 软件安装

* JDK安装，下载速度慢使用华为镜像：https://repo.huaweicloud.com/java/jdk/13+33/；安装教程：https://www.jianshu.com/p/dfce73d80ffb
* IDEA安装： https://ywnz.com/linuxjc/2895.html
* MySQL安装：https://blog.csdn.net/weixx3/article/details/80782479；忘记MySQL密码：https://blog.csdn.net/hq815601489/article/details/78608644
* git安装：https://www.linuxidc.com/Linux/2018-05/152610.htm；ssh配置：https://www.cnblogs.com/lxm20145215----/p/5905765.html ；IDEA中配置git时，地址在/usr/lib/git-core/git下

# git

# SpringBoot

# MySQL

# Mybatis



# 整合并访问数据库

参考：http://www.iocoder.cn/Spring-Boot/MyBatis/?github 

.sql文件常见参考： https://blog.csdn.net/gezi2015129/article/details/65446269/

运行项目时自动运行.sql文件：https://blog.csdn.net/qq_30000313/article/details/87696329



问题：

1. xml文件注意格式缩进等，容易格式问题报错；
2. 【待解决】实现项目启动时自动运行.sql文件初始化数据库。先是没有效果，添加always参数后可以；但与此同时报错（数据库操作生效）
3. 语法问题：.sql文件中表的名称不需要引号

# 常用命令

## Linux

复制文件：

> cp /home/a.tar.gz /usr/local/lib

【解释一下含义】解压压缩包：

> tar -zvxf jdk.tar.gz

编辑文件：

> vim a.txt

【解释含义】重启电脑：

> shutdown -r now 

## IDEA



## git

git status: 查看当前仓库状态

git add A : 添加文件A

git add . ：添加所有文件

git commit -m "message" ： 提交到本地仓库

git push ： 提交到远程服务器上