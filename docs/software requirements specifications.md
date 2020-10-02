
# Требования к приложению


# [](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md)Содержание

1.  [Введение](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#introduction)

    1.1.  [Назначение](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#appointment)  
    1.2.  [Бизнес-требования](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#business_requirement)  
    1.2.1.  [Исходные данные](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#initial_data)  
    1.2.2.  [Бизнес-цели](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#business_goals)  
    1.2.3.  [Границы проекта](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#project_boundaries)  
    1.3  [Аналоги](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#analogues)

3.  [Пользовательские требования](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#users_requirements)  
    2.1.  [Программные интерфейсы](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#software_interfaces)  
    2.2.  [Интерфейс пользователя](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#user_interface)  
    2.3.  [Характеристики пользователей](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#user_characteristics)  
    2.3.1.  [Классы пользователей](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#user_classes)  
    2.3.2.  [Аудитория приложения](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#application_audience)

4.  [Системные требования](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#system_requirements)  
    3.1.  [Функциональные требования](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#functional_requirements)  
    3.2.  [Нефункциональные требования](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#non-functional_requirements)  
    3.2.1.  [Атрибуты качества](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#quality_attributes)  


----------

# [](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#introduction)1. Введение

## [](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#appointment)1.1. Назначение

В данном документе описываются бизнесс-требования, функциональные и нефункциональные требования к Web-приложению «What to cook». Данный документ предназначен для команды, которая будет реализовывать и проверять корректность работы данного приложения.

## [](https://github.com/darmnn/What-to-cook/blob/main/docs/software%20requirements%20specifications.md#business_requirement)1.2 Бизнес-требования

### []1.2.1 Исходные данные
В интернете существует масса разообразных рецептов, однако не всегда легко вспомнить, какой именно рецепт нужно искать, чтобы притоговить что-либо из имеющихся продуктов питания. Данная разработка направлена на решение этих трудностей и упрощения процесса готовки.

### []1.2.2 Возможности бизнеса

**«What to cook»**  предлагает клиентам массу разнообразных рецептов на основе выбранных пользователем имеющихся у него продуктов.

### []1.2.3 Границы проекта

Приложение «What to cook» не требует регистрации и авторизации, любой пользователь с доступом к сети Интернет имеет возможность пользоваться данной разработкой.


## []1.3 Аналоги

Существует англоязычный аналог. «What to cook», в отличие от аналога, ориентирован на пользователей из стран СНГ и выполнен на русском языке.  

-   [Supercook.com](https://www.supercook.com)
----------

# []2. Пользовательские требования

## []2.1. Программные интерфейсы

Приложение предназначено для работы в сети Интернет, выполнено с использованием языка программирования Java и фреймворка Spring Boot.

## []2.2. Интерфейс пользователя

Графический интерфейс пользователя представлен в виде mock-up иллюстрации.

![main_page](https://github.com/darmnn/What-to-cook/blob/main/mockups/what_to_cook_interface.png)


## []2.3. Характеристики пользователей

### []2.3.1. Классы пользователей

Любой пользователь данного сервиса получает доступ к полному функционалу данного web-приложения.

### []2.3.2. Аудитория приложения

Целевой аудиторией проекта являются пользователи сети Интернет, обладающие минимальным уровнем технической грамотности.



# []3. Системные требования

## []3.1. Функциональные требования

Любой пользователь с доступом к сети Интернет и современным браузером может иметь доступ к приложению.

Пользователь может выбирать из списка продуктов, разделенных по категориям, имеющиеся на данный момент у него, после чего в основном окне появится список рецептов.

## 3.2. Нефункциональные требования

### []3.2.1. Атрибуты качества

#### []3.2.1.1 Удобство и простота использвания

-   Приложение должно иметь интуитивно понятную навигацию по странице.
-   Приложение должно иметь интуитивно понятный интерфейс.
-   Доступ к основным функциям приложения не более чем за три операции.

#### []3.2.1.2 Безопасность

Приложение не собирает никаких персональных данный о пользователях, соответственно, поль
