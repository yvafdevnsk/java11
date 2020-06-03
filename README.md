# Java11 sample code

Oracle Java SE Development Kit 11.0.7 (2020/04/14).  
Eclipse IDE for Enterprise Java Developers 2020-03 (4.15.0).  
  
Add .gitignore file to each Java Project.  
github / gitignore / Global / Eclipse.gitignore  
[https://github.com/github/gitignore/blob/master/Global/Eclipse.gitignore](https://github.com/github/gitignore/blob/master/Global/Eclipse.gitignore)  
  
Project list  
  
1. [Divide list by specified number.](https://github.com/yvafdevnsk/java11/tree/master/java11-split-list)  

# Eclipse EGit settings

## Create Remote Repository

    github.com/yvafdevnsk  
      Repositories  
        New  
          Repository name: java11  
          [x]Initialize this repository with a README  

## Clone a Git repository

Host: github.com  
Repository path: /yvafdevnsk/java11  
Protocol: https  
  
Destination: /home/mizuki/workspace/github/java11  

## Share Project

    java11-split-list  
      Team  
        Share Project...  
          Configure Git Repository Dialog  
            Repository: java11 - /home/mizuki/workspace/github/java11/.git  
            Working tree: /home/mizuki/workspace/github/java11  

## Commit Local Repository

    Window -> Perspective -> Open Perspective -> Other  
      Git  
  
    java11  
      Git Staging  
        Commit  

## Push Commit

    java11  
      History  
        Push Commit  

# Git user settings

Your Identity ([1.6 Getting Started - First-Time Git Setup](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup))  
  
    $ git config --global user.name "mizuki"  
    $ git config --global user.email mizuki@localhost  
