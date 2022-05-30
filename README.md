Тестовое задание для Топаз-сервис

Используются:
Java 11,
Liquibase,
Spring-Boot 2,
БД PostgreSQL 14.



POST-запрос дерева в формате JSON по адресу localhost:9999/tree
Вернется вес дерева.

Получить все записи из БД Get запросом по адресу localhost:9999/tree

Дерево:

{
  "weight": 8,
  "children": [
    {
      "weight": 3,
      "children": [
        {
          "weight": 1
        },
        {
          "weight": 6,
          "children": [
            {
              "weight": 4
            },
            {
              "weight": 7
            }
          ]
        }
      ]
    },
    {
      "weight": 10,
      "children": [
        {
          "weight": 14,
          "children": [
            {
              "weight": 13
            }
          ]
        }
      ]
    }
  ]
}
