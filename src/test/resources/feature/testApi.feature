﻿#language: ru
@TEST
Функция: Тестирование API

  Сценарий: 001 Тестирование API Рик и Морти
    Когда переходим по указанному Uri, с указанным endpoint и id персонажа
    И получив информацию о персонаже, получаем информацию о последнем его эпизоде
    То можем получить информацию о последнем персонаже, в списке последнего эпизода
    И проверить совпадение расы и локации персонажей

    Сценарий: 002 Тестирование API reqres.in
      Когда создаем элемент с именем Potato
      И обновляем его имя на Tomato и работу на Eat maket
      То можем проверить валидные данные