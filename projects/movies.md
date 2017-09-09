# Movie Lens
Korzystając ze zbioru danych Movie Lens - do pobrania ze strony:
https://grouplens.org/datasets/movielens/

Na podstawie zbioru odpowiedzieć na następujące pytania
1. ile jest wszystkich filmów
2. w którym roku powstało najwięcej filmów
3. ile filmów należy do danego gatunku (interesują nas pojedyncze gatunki - jeśli film należy do dwóch lub więcej, to trzeba je rozdzielić)
4. jakie jest TOP 100 najlepiej ocenianych filmów (należy policzyć średnią ocenę ze wszystkich ocen wystawionych dla każdego z filmów)
5. jakie są gatunki filmowe najlepiej oceniane przez kobiety, a jakie przez mężczyzn
6. jaki jest najlepiej oceniany film w każdym roku (dla każdego roku należy znaleźć wszystkie filmy nakręcone w tym roku, policzyć ich średnie oceny i wybrać ten najlepszy)
7. daj się ponieść wyobraźni - policz coś co Cię zaciekawi :)

W archwium znajdują się pliki:

* movies - zawierający dane o filmach (movieId, title, genres)
* ratings - zawierający oceny filmów (userId, movieId, rating, timestamp)
* users - zawierający dane o użytkownikach (userId, age, gender)
* tags - zawierający krótkie komentarze (tagi) o filmach wystawione przez użytkowników (userId, movieId, tag, timestamp)

Przygotuj:
- w pakiecie 'model' klasy odpowiadające za przechowanie danych - Movie, User, Rating
- w pakiecie 'repository' klasy odpowiadające za przechowanie kolekcji filmów, użytkowników, ocen - MovieRepository, UserRepository, które dodatkowo mają metody pozwalające wyszukać film czy użytkownika po ich id
- w pakiecie 'service' klasę MovieService, która będzie mieć metody odpowiadające na powyższe pytania. Service powinien zawierać w sobie repozytoria zdefiniowane w powyższym punkcie.
- w pakiecie 'data' klasy odpowiadające za czytanie danych z plików - MovieDataReader, UserDataReader itd. Każda z tych klas powinna czytać plik CSV i zwracać listę odpowiednich obiektów. Możesz stworzyć dla tych klas wspólny interfejs przy użyciu klas generycznych.


Polecam wersję mniejszą w formacie CSV, na dużej przetwarzanie może zajmować za dużo czasu. Mało praktyczne, przynajmniej podczas fazy tworzenia/prototypowania kodu, później jak już będzie działać można przetestować na większym.
http://files.grouplens.org/datasets/movielens/ml-latest-small.zip
Ten plik jest w formacie CSV - wartości oddzielone przecinkami. W taki sposób należy go czytać. 
Niestety wadą tego zbioru jest to, że nie posiada informacji o użytkownikach serwisu, więc nie da się wykonać wszystkich zadań.
Do czytania pliku możesz skorzystać z klasy CSVParser
https://commons.apache.org/proper/commons-csv/apidocs/org/apache/commons/csv/CSVParser.html


Zbiór ml-1m zawiera informacje o użytkownikach, jednak format pliku jest zupełnie inny (jest to stary zbiór).
http://files.grouplens.org/datasets/movielens/ml-1m.zip
Pliki w tym archiwum są rozdzielone dwoma dwukropkami:

    1::Toy Story::Comedy|Children

Do przeczytania tego pliku wystarczy zwykła klasa `String` i metoda `split()`
