Serwis ogłoszeniowy

Model:
1. Stwórz klasę kategorii ogłoszenia (np `Category`) która będzie typu enum i zawierać kilka wartości (np agd, rtv, motoryzacja, sport, ubrania, książki, inne)
2. Stwórz klasę ogłoszenia, które ma tytuł, treść, kategorię, datę dodania oraz cenę.
3. Stworz klasę użytkownika, który ma login, hasło, numer telefonu oraz przypisaną listę ogłoszeń

Dao:
Stwórz `AdvertDao`, które pozwoli przeszukiwać ogłoszenia według:
- kategorii
- ceny
- ceny i kategorii
- użytkownika, który je dodał
- słów zawartych w tytule (np. jeśli tytuł ogłoszenia to "Sprzedam samochód opel astra" to ogłoszenie powinno zostać znalezione jeśli wpiszemy "opel" lub "astra")

Napisz testy, które weryfikują poprawność wszystkich powyższych metod wyszukujących.

Możesz zrobić interfejs `AdvertDao` zawierający tylko metody, a następnie dwie implementacje `JpqlAdvertDao` oraz `CriteriaAdvertDao` które będą realizować te same zadania wykorzystując dwa różne podejścia.
