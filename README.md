# spring boot 技术栈集成学习

## doing

* web start
* mybatis start
* unit test start

## todo

mybatis deep-going

## install

* Config spring-boot-stack/src/main/resources/application.yml
* Db spring-boot-stack/db
* Run Main study.Application
* Look http://localhost:8088

## 项目规范

* 单元测试

只对测试的单元，进行验证，不做交互，结果与断言一致即可

* 常用对象约束说明

``` text

study.entity -- 实体 Entity
    实体必须与数据库字段一一对应
    不能修改比如将实体用于业务描述如表单和Model

study.form -- 表单 Form
    接收数据

study.model -- Model
    返回数据
```

* 其他目录说明

```
study.config
    项目配置及集成框架配置
study.mapper
    Mybatis DAO 操作
study.service
    业务方法
```

## Java规范

[阿里巴巴Java开发手册（华山版）](http://file.liujl.net/ali.java.pdf)