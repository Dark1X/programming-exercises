## Oczko

Zadanie polega na zaimplementowaniu gry w oczko. Program może być napisany w konsoli i powinien odbierać informację od użytkownika czy chce on dobrać kolejną kartę czy też nie.

Zasady gry z Wikipedii:
Oczko – prosta gra karciana, polegająca na dobieraniu kolejnych kart dotąd, aby osiągnąć wartość liczbową posiadanych kart jak najbliższą (ale nie większą niż) 21. Gracz otrzymuje kolejne karty z talii dotąd, aż sam zdecyduje, że nie chce już więcej kart, lub otrzyma wynik 21 lub większy. Suma większa lub równa 22 oznacza przegraną. Wyjątkiem od tej reguły jest perskie oczko (dwa asy). Perskie oczko zawsze oznacza wygraną.

W oczko gra się talią od 2 do asa.

Punktacja:

Karty 2 do 10 mają wartość równą wartości karty
* walet – 2 pkt.
* dama – 3 pkt.
* król – 4 pkt.
* As – 11 pkt.

Do reprezentowania kolorów kart można użyć znaków o kodach UTF:

|Kod|U+2660| U+2665| U+2666| U+2663|
|---|----|---|---|---|
|Kolor| Pik   | Kier    | Karo    | Trefl  | 
|Znak  | &#9824;|&#9829; |&#9830; |&#9827; |

Do wykonania tego zadania należy stworzyć klasy: 
* Karta - zawierającą informację o kolorze, figurze oraz wartości punktowej karty
* Talia - składająca się ze wszystkich 52 kart z metodą pozwalajacą na tasowanie (można skorzystać z `Collections.shuffle`)
* Gracz - któremu są rozdawane karty z talii i który decyduje czy chce dostać kolejną kartę
* Stół - klasa odpowiedzialna za rozgrywanie gry - na niej ma być potasowana talia, karty mają być rozdawane do gracza i powinna ona zapewniać obsługę "komunikacji" z użytkownikiem przez komendy wpisywane w konsoli
