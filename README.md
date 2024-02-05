# Проект по автоматизации тестирования для компании [Obsessedgarage](https://reqres.in/)

<p align="center">  
<img alt="Garage" src="/media/screenshots/OG.jpeg">

> Reqres.in — отличный ресурс, предоставляющий общедоступный API, который вы можете использовать для создания и тестирования своих приложений.

<a name="наверх"></a>

## :scroll: Содержание:
* <a href="#tools">Используемый стек</a>
* <a href="#cases">Примеры API тестов </a>
* <a href="#console">Запуск из терминала</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

____
<a id="tools"></a>
## :computer:<a name="Используемый стек">**Используемый стек:**</a>

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/logo/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins.svg"></a>
<a href="https://web.telegram.org/a/"><img width="6%" title="Telegram" src="media/logo/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img width="5%" title="Jira" src="media/logo/Jira.svg"></a>
</p>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *Проверка списка пользователей*
- ✓ *Проверка "Пользователь не найден"*
- ✓ *Создание нового пользователя*
- ✓ *Удаление пользователя*
- ✓ *Успешная регистрация пользователя*




<a id="console"></a>
## :keyboard: Запуск автотестов

***Локальный запуск тестов:***
```
gradle clean test 
```
***Удаленный запуск тестов:***
```
clean test 
```
____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/garage_UI_project/)</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/garage_UI_project/"><img src="media/screenshots/Jenkins.png" alt="Jenkins"/></a>  
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure <a target="_blank" href="https://jenkins.autotests.cloud/job/garage_UI_project/allure/">отчёт</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/AllureRep.png">  
</p>  

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4020/dashboards">Allure TestOps</a>
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screenshots/AllureTO.png">  
</p>  


<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1098">Jira</a>

<p align="center">  
<img title="Jira" src="media/screenshots/Jira.png">  
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a>Уведомление в Telegram 

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/TG.png">  
</p>



<p align="center"> 
<img title="Selenoid Video" src="media/video/Video.gif" width="650" height="350"  alt="video">  

[Наверх ⬆](#наверх)
