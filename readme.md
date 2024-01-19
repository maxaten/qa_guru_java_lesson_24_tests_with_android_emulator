# Демо проект по автоматизации мобильного приложения [**Wikipedia

**](https://github.com/wikimedia/apps-android-wikipedia/)

<p align="center">
<img title="wikipedia" src="images/logo/wikipedia_logo_story.jpg">
</p>



---

## **Содержание**:

---

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure_emulator">Отчет Allure при запуске локально на эмуляторе</a>

* <a href="#emulator_video">Пример видео выполнения тестов на Эмуляторе</a>

* <a href="#allure">Отчет Allure при запуске через Browserstack</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#browserstack_video">Пример видео выполнения тестов на Browserstack</a>

---

<a id="tools"></a>

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" title="Intellij_IDEA" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" title="Java" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/github-original.svg" title="Github" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" title="JUnit5" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle-plain.svg" title="Gradle" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" title="Selenide" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://developer.android.com/studio/"><img src="images/logo/Android-studio.svg" title="Android-studio" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://appium.io/docs/en/2.4/"><img src="images/logo/Appium.svg" title="Appium.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://app-automate.browserstack.com/"><img src="images/logo/Browserstack.svg" title="Browserstack.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" title="Allure" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" title="Allure TestOps" width="50" height="50" alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" title="Jenkins" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" title="Jira" width="50" height="50"  alt="Jira"/></a>
<a href="https://core.telegram.org/bots/api/"><img src="images/logo/telegram_logo.svg" title="Telegram" width="50" height="50"  alt="Jira"/></a> 
</p>

* Проект написан в среде разработки программного обеспечения <code>Intelij_IDEA</code>.
* В проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования <code>
  Selenide</code>.
* Использованы фреймворк <code>JUnit 5</code>.
* В качестве сборщика был использован - <code>Gradle</code>.
* Для удаленного запуска реализована джоба в <code>Jenkins</code>, которая выполняет тесты на устройстве Android в <code>Browserstack</code> с формированием отчета в <code>Allure</code> и
  отправкой результатов в <code>Telegram</code> c помощью бота.
* Осуществлена интеграция с <code>Allure TestOps</code> с <code>Jenkins</code>, при которой возможен запуск тестов
  из <code>Allure TestOps</code>.
* Осуществлена интеграция <code>Jira</code> с <code>Allure TestOps</code>, где рерультат прогона авто-тестов
  подтягивается в задачу в <code>Jira</code>.
* Так же реадизована возможность запускать тесты локально в <code>Android-studio</code> через эмулятор.


---
<a id="cases"></a>

## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>

- *Проверка поиска*
- *Проверка искомого запроса в статье*
- *Проверка текстов на экранах онбординга*

<a id="console"></a>

## <a name="Запуск тестов из терминала">**Запуск тестов из терминала:**</a>

***Удаленный запуск тестов:***

```bash
gradle clean test -DdeviceHost=browserstack
```

***Локальный запуск тестов:***

```bash
 gradle clean test -DdeviceHost=emulator
```

---
<a id="jenkins"></a>

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/qa_guru_allure_example_23_maxaten/)</a>

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Project%20qa_guru_java_lesson_17_mag_maxaten/"><img src="images/screen/Browserstack_jenkins.png" alt="Jenkins" width="1920"/></a>  
</p>

<a id="allure"></a>

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>[Отчет](https://jenkins.autotests.cloud/job/qa_guru_allure_example_24_maxaten/allure/) Allure при запуске через Browserstack</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/Allure_report_browserstack.png" width="1920">  
</p>

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/Allure_test_cases.png" width="1920">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/allure_graphs_1.png" width="1920">

<img title="Allure Graphics" src="images/screen/allure_graphs_2.png" width="1920">  
</p>


___
<a id="allure-testops"></a>

## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3954/dashboards)</a>

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/Allure_dashboard.png" width="1920">  
</p>  

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/Allure_testops_test_case.png" width="1919">  
</p>

___
<a id="jira"></a>

## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1043)</a>

<p align="center">  
<img title="Jira" src="images/screen/Jira.png" width="1920">  
</p>

___
<a id="telegram"></a>

## <img alt="Allure" height="25" src="images/logo/telegram_logo.svg" width="25"/></a> Уведомление в Telegram при помощи бота

<p align="center">  
<img title="Telegram Overview Dashboard" src="images/screen/Telegram.png" width="452">  
</p>

---
<a id="browserstack_video"></a>

## <img alt="Android" height="25" src="images/logo/Browserstack.svg" width="25"/></a> Пример видео выполнения тестов на Browserstack

<p align="center">
<img title="Browserstack Video" src="images/video/browserstack.gif" width="320" height=""  alt="video">   
</p>

---
<a id="allure_emulator"></a>

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Отчет Allure при запуске локально на эмуляторе</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/Allure_emulator.png" width="1920">  
</p>

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/Allure_emulator_cases.png" width="1920">  
</p>

---
<a id="emulator_video"></a>

## <img alt="Android" height="25" src="images/logo/Android-studio.svg" width="25"/></a> Пример видео выполнения тестов на Эмуляторе

<p align="center">
<img title="Selenoid Video" src="images/video/vid.gif" width="320" height=""  alt="video">   
</p>


