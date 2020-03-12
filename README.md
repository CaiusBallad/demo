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

# Git

参考：https://www.liaoxuefeng.com/wiki/896043488029600/896827951938304

## 原理简述

1. 工作区，暂存区和仓库：先添加(add)到暂存区；把暂存区内容全部提交(commit)到当前分支

2. 版本控制指针：HEAD为版本指向指针，能用于撤回版本等操作
3. 分支管理：
   1. Fast forward模式：指针指向，快速合并分支，删除分支后会丢失被删除分支的信息
   2. --no-ff模式： 会创建一个commit，删除后能查找到分支的历史



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

### 更新提交操作

1. git status : 查看当前仓库状态

2. git add A : 添加文件A

3. git add . ：添加所有文件

4. git commit -m "message" ： 提交到本地仓库

5. git push ： 提交到远程服务器上

### 其余操作

1. git diff ：查看修改位置

2. git log (--pretty=oneline) ： 查看历史记录

3. git reset --hard HEAD^ : 回退到上一个commit后的版本，上上是HEAD^^，上100个是HEAD~100，如果有ID，可以至今到达ID所在版本

4. git reflog : 记录每一次git的命令

5. git diff HEAD -- file : 查看当前文件和仓库版本的差别

### 撤销操作

1. git checkout -- file : 丢弃当前修改（未添加到暂存区的部分）

2. git reset HEAD file :  把暂存区的内容撤回到工作区，HEAD表示最新版本

3. commit后的撤销，即回退版本操作

### 分支管理

1. 创建并切换分支：git checkout -b <name>  / git swithc -c <name> 
2. 创建并切换分支：
   1. git branch <name> 
   2. git checkout  <name> 
3. 查看当前分支：git branch
4. 合并指定分支到当前分支：
   1. 合并：git merge <name> 
   2. 无ff模式：git merge --no-ff -m "message" <name> 
5. 删除分支：git branch -d <name> 
6. 查看分支合并图：git log --graph --pretty=oneline --abbrev-commit
7. 强行删除一个未合并的分支：git branch -D <name> 

### 远程仓库

1. 查看远程库信息：git remote (-v)
2. 推送分支(远程 本地): git push origin <name> 
3. 从远程origin/dev上，创建本地dev分支：
   1. git checkout -b dev origin/dev
   2. git push origin dev
4. 提交远程发生冲突：先pull拉取远程分支，本地解决冲突，再push推送到远程仓库

### Bug分支

暂存当前工作后，git status可以查看到无修改；之后新建bug分支，修复提交bug，然后切回之前的分支

1. 暂存当前工作：git stash
2. 查看暂存列表：git stash list
3. 恢复暂存：
   1. 恢复且不删除stash内容，之后用git stash drop删除：git stash apply stash@{0}
   2. 恢复且删除stash内容：git stash pop

### 标签

> 给commit添加标签，代替一串ID数字，增加辨识度。标签存储在本地不会自动推送远程

切换到需要打标签的分支：

1. 打标签
   1. 给最新的提交：git tag v1.0
   2. 给指定的提交：git tag v1.0 f12313
   3. 带说明的标签，-a为标签名，-m为说明信息：git tag -a v0.1 -m "version 0.1 released" 1094adb
   4. 删除标签： git tag -d v1.0
   5. 推送远程：
      1. 指定：git push origin v1.0
      2. 全部：git push origin --tags
   6. 删除远程标签：
      1. 先删除本地：git tag -d v1.0
      2. 从远程删除：git push origin :refs/tags/v0.9
2. 查看标签： git tag
3. 查看标签信息：git show <tagname>

