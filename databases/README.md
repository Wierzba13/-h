# LABY

| Typ | Rozwiniecie skrotu | Polecenia |
| ------------- |:-------------:| -----:|
| SQL DML      | Data manipulation language | SELECT, INSERT, UPDATE, DELETE  |
| SQL DDL     | Data definiton language     |   CREATE, DROP, ALTER |
| SQL DCL | Data controll language    |   ROLLBACK, COMMIT, GRANT |

## Wazne kwestie

* SQL nie rozroznia duzych i malych liter w slowach kluczowych
* REPLICE - to samo co INSERT, z ta roznica ze gdy pojawi sie kolizja kluczy nadpisze istniejacy rekord
* W zapytaniu SELECT nie musimy podawac zawsze klauzuli FROM (SELECT 10; zwraca 10)

### Zrzut bazy danych

```  sql
mysqldump -h localhost -u root -p nazwaBazyDanych > nazwaPliku.sql 
```

### Info o tabeli

``` sql
DESCRIBE nazwaTabeli;
```

#### Zmiana nazwy tabeli

``` sql
ALTER TABLE old_name RENAME new_name;
```

#### Dodanie klucza glownego

``` sql
ALTER TABLE tableName ADD PRIMARY KEY(kolumna);
```

#### Dodanie NOT NULL

``` sql
ALTER TABLE tableName MODIFY columnName VARCHAR(20) NOT NULL;
```

#### Dodanie kolumny po innej kolumnie

``` sql
ALTER TABLE tableName ADD COLUMN colName VARCHAR(20) AFTER afterColName;
```

#### Zaladowanie polecen SQL z pliku

``` sql
USE dbName;
SOURCE plik.sql;
```

### Projekcja

Proces wybierania atrybutow(kolumn) ktore maja znalezc sie w wyniku zapytania nazywamy projekcja, np:

``` sql
SELECT imie FROM osoby;
```

## Przydatne funkcje SQL

| Funkcja | Dzialanie | Przyklad |
| -------- |:---------------------:| :-----------:|
| CONCAT() | laczy wartosci podanych kolumn (" " jest znakiem oddzielajacym wartosci poszczegolnych kolumn) | SELECT CONCAT(Address, " ", PostalCode, " ", City) AS Address FROM Customers; |
| UPPER() LOWER() | Zmiana wielkosci liter | SELECT UPPER(imie) FROM osoby; |
| REVERSE() | odwraca kolejnosc liter w lancuchu znakow | SELECT REVERSE(imie) FROM osoby; |
| LENGTH() | zwraca dlugosc lancucha znakowego | SELECT LENGTH(imie) FROM osoby; |
| CEIL() | zaokragla w gore | CEIL(5.21) = 6 |
| FLOOR() | zaokragla w dol | FLOOR(4.34) = 4 |
| LOG(n, m) | Zwraca logarytm m przy podstawie z n |
| MOD(m, n) | Zwraca reszte z dzielenia m przez n |
| POWER(m, n) | Zwraca m podniesione do potegi n |
| SQRT(n) | Zwraca pierwiastek kwadratowy z n |
| CURDATE() | Zwraca dzisiejsza date |

```sql
SELECT 2 + SQRT(ABS(3.75 - 33) * POWER(2, 3)) / ((44/11) - 12.5) AS result;
```

## SORTOWANIE

```sql
SELECT name FROM employess ORDER BY name;
SELECT name FROM employess ORDER BY name DESC; 
```

* Pierwsze zapytanie domyslnie przyjmuje kolejnosc sortowania ASC czyli  alfabetycznie.  
* Drugie zapytanie przyjmuje kolejnosc sortowanie DESC czyli na odwrot niz ASC.
* Daty sortujemy od wczesniejszych do pozniejszych lub na odwrot.

## DISTNCT I WHERE

DISTINCT - slowo kluczowe eliminujace powtarzajace sie wartosci

```sql
SELECT DISTINCT name FROM employess WHERE id > 5 ORDER BY id DESC;
```

Zapytanie to wybierze niepowtarzajace sie imienia dla rekordow o id wiekszym niz 5 posortowane od konca

## BETWEEN..AND, IN, LIKE, IS NULL

| Nazwa | Przyklad | Dzialanie |
| -------- |:---------------------:| :-----------:|
| BETWEEN...AND | x BETWEEN y AND z | Sprawdza czy x znajduje sie w przedziale od y do z WLACZNIE (y musi byc mniejsze od z |
| IN | nazwisko IN ("Kowalski", "Nowak", "Kaminski") | sprawdza czy dana wartosc jest rowna przynajmniej jednej z podanych |
| IS NULL | WHERE data_zwrotu IS NULL | Sprawdza czy dana wartosc jest NULL |

```sql
SELECT imie, wyplata FROM pracownicy WHERE wyplata BETWEEN 1000 AND 2000;

SELECT id, imie FROM pracownicy WHERE nazwisko IN ('Nowak', 'Borowik');

SELECT id, imie FROM pracownicy WHERE wynagrodzenie IS NULL;

SELECT imie FROM pracownicy WHERE imie LIKE 'Kowal%';
```

operator `LIKE`` pozwala na wykorzystanie regexow:

| Znak | Dzialanie |
| -------- |:---------------------:|
| % | dowolny ciag znakow (zero lub wiecej) |
| _ | dokladnie jeden dowolny znak |

## LIMIT

```sql
SELECT name FROM employess LIMIT 5;
SELECT name FROM employess LIMIT 2, 5;
```

LIMIT sluszy do otrzymania okreslonej liczby rekordow.  
W drugim zapytaniu liczba 2 oznacza ze pomijamy 2 pierwsze wiersze, a liczba 5 - liczbe wierszy ktore chcemy wyswietlic.

### DATE_ADD

W przykladzie ponizej dodanie 5 dni do aktualnej daty:

```sql
SELECT DATE_ADD(NOW(), INTERVAL 5 DAY); 
```

## FUNCKJE AGREGUJACE

| FUNCKJA | PRZYKLAD | DZIALANIE |
| -------- |:---------------------:| ----------:|
| MAX() | MAX(wyplata) | znajdzie najwieksza wyplate |
| MIN() | MIN(wyplata) | znajdzie najmniejsza wyplate |
| AVG() | AVG(wyplata) | zwroci srednia wyplate |
| COUNT() | COUNT(*) | zwroci liczbe wszystkich wierszy |
| SUM() | SUM(wyplata) | zsumuje wartosci wszystkich wyplat |

## ZAPYTANIA Z JEDNA GRUPA

Sa top zapytania bez wyrazenia grupujacego, dlatego wszystkie rekordy odczytane przez zapytanie trafiaja do tej samej jednej grupy, a wynikiem zawsze jest **jeden rekord**

```sql
SELECT MAX(wyplata), MIN(wyplata) FROM pracownicy;
```

## ZAPYTANIA Z WIELOMA GRUPAMI

Konstruujac takie zapytania konieczne jest zdefiniowanie wyrazenia grupujacego za pomoca slow kluczowych `GROUP BY`

```sql
    SELECT id, AVG(wyplata) FROM pracownicy GROUP BY stanowisko;
```

### FILTROWANIE GRUP - HAVING

Grupy mozemy filtrowac za pomoca HAVING, poslugiwac sie HAVING mozemy za pomoca: wyrazen grupujacych i funkcji agregujacych

```sql
    SELECT id, AVG(wyplata) FROM pracownicy GROUP BY stanowisko HAVING COUNT(*) > 2;
```
