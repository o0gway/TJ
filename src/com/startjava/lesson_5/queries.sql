\qecho
\qecho -- Вывод всех строк из таблицы
SELECT * FROM Jaegers;

\qecho -- Вывод только уничтоженных роботов
SELECT * FROM Jaegers WHERE status = 'Destroyed';

\qecho -- Вывод роботов только Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

\qecho -- Вывод роботов кроме Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

\qecho -- Вывод робот отсортированных по убыванию
SELECT * FROM Jaegers ORDER BY mark DESC;

\qecho -- Вывод информацию о самом старом роботе
SELECT * FROM Jaegers ORDER BY launch LIMIT 1;

\qecho -- Вывод информации о роботах, которые уничтожили больше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

\qecho -- Вывод среднего веса всех роботов
SELECT ROUND(AVG("weight(kg)"), 2) AS "Средняя масса всех роботов" FROM Jaegers;

\qecho -- Увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';

\qecho
\qecho -- Удаление только уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'Destroyed';