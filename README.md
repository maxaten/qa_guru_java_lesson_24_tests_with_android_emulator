### Домашнее задание



#### 1. Разработать автотест на getting started (onboarding screen) в приложении википедии - пройти по 4м экранам, на каждом сделать проверку

#### 2. Доработать возможность запуска на разных стендах (передать из командной строки -DdeviceHost=browserstack / emulation / real


Для запуска тестов локально на эмуляторе:
```
gradle clean android -Dtags=emulator -DdeviceHost=emulator
```

Для запуска тестов удаленно с помощью Browserstack:
```
gradle clean wikipediaEmulator -Dtags=browserstack -DdeviceHost=browserstack
```
