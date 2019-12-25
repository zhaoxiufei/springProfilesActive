# springProfilesActive
spring.profiles.active区分环境配置

## 打包dev环境配置
```bash
mvn clean package -Pdev
运行程序 SpringProfilesActiveApplication
---------------------------------------
输出
My name is zhaoxiufei
Environment is dev
```

## 打包stable环境配置
```bash
mvn clean package -Pstable
运行程序 SpringProfilesActiveApplication
---------------------------------------
输出
My name is zhaoxiufei
Environment is stable
```

