Инструкция по развертыванию:
1. Через Stack Builder добавить приложение PostGis (Spatial Extensions -> PostGis)
2. Создать БД dz3
3. В созданной БД подключить расширение postgis
4. Востановить БД из резервной копии (Я делаю из командной строки: pg_restore -U postgres -h localhost -d dz3 -v D:\file.backup)