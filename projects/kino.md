Kino

Należy utworzyć system obsługujący rezerwacje biletów na seanse w kinie.

Model
1. Kino ma kilka numerowanych sal
2. Każda z sal ma siedzenia w rzędach (w każdym rzędzie liczba foteli jest taka sama, jednak liczba tych miejsc oraz liczba rzędów różni się pomiędzy salami)
3. Każde z siedzeń może być w jednym z trzech stanów - wolne, zarezerwowane, opłacone. Oczywiście w ramach jednego seansu.
4. Kino ma bazę filmów, która przechowuje informację o tytule, gatunku filmu (np komedia, dramat, kryminał), czasu trwania oraz roku premiery.
5. W kinie obdywają się seanse filmów w określonej sali, określonego dnia i określonej godziny.
6. Dostępność danego siedzenia na sali jest ściśle związana z seansem, tzn kupujący wybiera konkretne miejsce na konkretny seans.


DAO
Oczekiwane funkcjonalności z poziomu dao:
1. wyszukanie wszystkich seansów danego filmu określonego dnia
2. wyszukanie wszystkich wolnych miejsc na dany seans
3. wyszukiwanie wszystkich obecnie granych filmów z danego gatunku



Service
1. Możliwość zarezerwowania określonych miejsc na wybrany seans
2. Możliwość opłacenia określonych miejsc na wybrany seans
3. wyszukanie najlepiej sprzedających się filmów (na podstawie wszystkich sprzedanych miejsc na wszystkie seanse) w wybranym zakresie dat
