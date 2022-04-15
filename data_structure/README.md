# [Youtube playlist](https://www.youtube.com/playlist?list=PLDV1Zeh2NRsB6SWUrDFW2RmDotAfPbeHu)

## Referencja

Mianem referencji określa się zmienną, która przechowuje adres innej zmiennej bądź obiektu.

## Tablice

Indexujemy od 0

### Tablice dynamiczne

Zajmują tyle miejsca ile jest im potrzebne. Potrafią automatycznie zmniejszać lub powiększać swój rozmiar.
[Kod w javie](./code/DynamicArray.java)

### Tablice statyczne

Zajmują stały rozmiar pamięci (rezerwują stałą ilość pamięci przy tworzeniu ich). Nie zmieniaja swoich rozmiarów.

## Linked list

To lista sekwencyjna przechowująca dane, które wskazują na inne węzły również zawierające dane.
Każdy węzeł ma wskaźnik do następnego węzła.
Ostatni węzeł nie wskazuje na to że dalej nie ma kolejnych węzłów.

Head - początek listy (pierwszy element)  
Tail - koniec listy (ostatni element)  
Pointer - referencja do nastepnego node'a  
Node - Obiekt zawierajacy dane i pointer  
![Linked list strcuture](./img/linkedList.png)

### Singly Linked List

Zawiera tylko wskaźnik do następnego węzła. Nie można uzyskać dostępu do poprzedniego elementu w łatwy sposób.
Wstawianie danych:

1. Utworzenie nowego wskaźnika wskazującego na HEAD
2. Przejście na odpowiednią pozycje
3. Utworzenie nowego węzła
4. Powiązanie węzła

### Double Linked List

Zawiera wskaźnik do następnego i poprzedniego węzła. Ten typ linked list zabiera jednak **2 razy więcej pamięci**

Wskaźniki do każdego kolejnego pojedynczego węzła zajmuja kolejno:  
dla 64bit - 8 bajtów  
dla 32bit - 4 bajty  

## Stack (stos)

Liniowa struktura danych, dane w niej są poukładane na stosie.  
Dane pobierane są z wierzchołka stosu.  
Ideę stosu danych można zilustrować jako stos położonych jedna na drugiej książek – nowy egzemplarz kładzie się na wierzch stosu i z wierzchu stosu zdejmuje się kolejne egzemplarze. Elementy stosu poniżej wierzchołka można wyłącznie obejrzeć, aby je ściągnąć, trzeba najpierw po kolei ściągnąć to, co jest nad nimi.  

push - dodac na stos  
pop - zdjac z stosu  

dobrym zastosowaniem dla stosu potrafi być na przykład funckja cofania zmian w edytorze tekstu.  

## Queue (kolejka)

Enqueue = adding  
Dequeue = removing

Struktura danych w której każdy element posiada referencje tylko do następnego (tylko ostatni ma wartość null). Dostęp do danych mamy tylko na wierzchołku stosu.  
Na stosie możemy wykonywać takie operacje jak:  

* dodanie elementu (push)
* usunięcie elementu (pop)

Elementy usuwa się na początek, a dodaje na koniec kolejki. (tak jak obsługa kolejki w sklepie)

## Hash map (coś jak słownik)

Kolekcja typu **klucz - wartosc**. Atutem jest tu krótszy czas wyszukiwania niż w liście, gdzie koszt operacji przeszukiwania jest proporcjonalny do rozmiaru listy.

* Klucze w hash mapie nie mogą się powtarzać (wpychanie tego samego klucza z inną wartością powoduje nadpisanie starej value. Metoda put() działa jako add or overwrite.)
* Tylko jeden klucz może być nullem, nullem mogą być też wszystkie wartości.
