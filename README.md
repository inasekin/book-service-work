# Spring REST API для работы с сущностью Book

![Java CI](https://github.com/inasekin/book-service-work/workflows/Java%20CI/badge.svg)
[![Maintainability](https://api.codeclimate.com/v1/badges/964c1709d2995451517d/maintainability)](https://codeclimate.com/github/inasekin/java-project-61/maintainability)

## Описание
Приложение для управления книгами. Реализованы CRUD операции.

## Настройки
- **Порт:** 8090
- **База данных:** PostgreSQL
    - **Имя базы данных:** your_database_name
    - **Пользователь:** test
    - **Пароль:** test

## Запуск
1. Настройте PostgreSQL и создайте базу данных.
2. Запустите приложение:
   ```bash
   make setup
   make clean
   make build
   make run
