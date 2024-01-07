# Проект по автоматизации тестирования для компании [Obsessedgarage](https://www.obsessedgarage.com/)

<img alt="OTP" src="src/media/screenshots/bankPage.png">

> Obsessed Garage открывает и разрабатывает продукты и решения высочайшего качества с акцентом на удобство использования.

## :scroll: Содержание:
* <a href="#tools">Используемый стек</a>
* <a href="#cases">Примеры автоматизированных тест-кейсов</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

____
<a id="tools"></a>
## :computer:<a name="Используемый стек">**Используемый стек:**</a>

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
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
- ✓ *Регистрация нового пользователя*
- ✓ *Авторизация пользователя*
- ✓ *Проверка наличия значений в посковой строке*
- ✓ *Проверка наличия элемента навигационной панели*
- ✓ *Проверка наличия элемента в выпадающем списке*
- ✓ *Проверка наличия товара в корзине после его добавления*
- ✓ *Проверка кликабельности элементов навигационной панели*
- ✓ *Проверка заголовка главной страницы*



<a id="console"></a>
## :keyboard: Запуск автотестов

***Локальный запуск тестов:***
```
gradle clean test -DenvWeb=local
```
***Удаленный запуск тестов:***
```
gradle clean test -DenvWeb=remote
```
____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/BankOTP/)</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/BankOTP/"><img src="media/screenshots/jenkins.png" alt="Jenkins"/></a>  
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure <a target="_blank" href="https://jenkins.autotests.cloud/job/BankOTP/allure/">отчёт</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/allureReport.png">  
</p>  

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3879/dashboards">Allure TestOps</a>
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screenshots/allureTestOps.png">  
</p>  

### *Автотесты*


<p align="center">  
<img title="Allure TestOps Tests" src="media/screenshots/allureAutoTest.png">  
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1004">Jira</a>

<p align="center">  
<img title="Jira" src="media/screenshots/jira.png">  
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a>Уведомление в Telegram 

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/telegram.png">  
</p>

<a id="video"></a>
## <img src="media/logo/Selenoid.svg" width="25" height="25"  alt="Selenoid"/></a> Примеры видео выполнения тестов на Selenoid



<img title="Selenoid Video" src="media/screenshots/Video.gif" width="650" height="350"  alt="video">  
