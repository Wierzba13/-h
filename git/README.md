<!-- https://aimweb.pl/sciagawka-git-komendy-ktore-warto-znac/ -->

## Tworzenie repo && git log

| Komenda          | Opis            |
| ---------------- | :-------------- |
git init | inicjalizuje repozytorium lokalne
git add fileName | zaczyna śledzić plik
git commit -m "opis zmian" | commituje zmiany z komentarzem
git log | wyświetla historię commitów
git log --oneline | wyświetla streszczoną historię commitów
git log --grep="test" | szuka commita z opisem 'test'

---

## Komendy dot. plików i katalogów

| Komenda          | Opis            |
| ---------------- | :-------------- |
git reset | usuwa pliki z kolejki
git clean      | wyświetla nieśledzone pliki i katalogii
git clean -nd | wyświetla nieśledzone pliki i katalogii które zostałyby usunięte
git clean -idf | usuwanie tylko wybranych nieśledzonych plików
git rm fileName | plik zostaje usunięty z repozytorium
git checkout fileName | przywraca stan pliku z indeksu git'a

---

# Komendy dot. commitów

| Komenda          | Opis            |
| ---------------- | :-------------- |
git revert | odwraca zmiany z wybranego commitu
git checkout 925760e | przenosi nas do stanu z commitu o hashu '925760e'
git checkout 925760e fileName | przywraca plik z danego commitu

---

## Komendy dot. branchy

| Komenda          | Opis            |
| ---------------- | :-------------- |
git merge branchName | łączy branch na którym aktualnie się znajdujemy z branchem 'branchName'
git branch -D branchName | usuwa branch 'branchName'
git checkout -b branchName | zapisuje zmiany na branchu o podane nazwie, ew tworzy nowy branch
git checkout master | przenosi nas do aktualnego stanu brancha master

---

## Praca z zdalnym repo

| Komenda          | Opis            |
| ---------------- | :-------------- |
git push | wysłanie informacji z lokalnego do zdalnego repo
git push -u origin main | wysyła zmiany na zdalne repo, -u pozwala określić adres repo (origin main)
git remote add origin URL | pozwala podpiąć zdalne repo o adresie URL i aliasie 'origin'
git fetch | pobranie zmian z zdalnego repo

---

## git rebase && git merge

Aby polaczyc dwa branche:
1. Na branchu `main` zaciagnij najnowsze zmiany - `git pull`
2. Na branchu, na którym dokonywałeś zmian po wykonaniu commitow wykonaj - `git rebase main`
3. Jezeli pojawia sie konflikty rozwiaz je
4. Na branchu main dokonaj merge'a - `git merge <nazwa_brancha>`
5. Usun branch na ktorym dokonywales zmiany - `git branch --delete <nazwa_brancha>`

---

## Commity i ich opis

git commit = uruchamia domyślny edytor aby wpisać komentarz, przykład komentarza:  

```git
Tytul commita

Krótki opis zmian których dokonaliśmy.
```

* Tytuł pisany z dużej litery, bez kropki
* Opis w trybie rozkazującym max 50-60 znaków
* Między tytułem a opisem pusty wiersz
