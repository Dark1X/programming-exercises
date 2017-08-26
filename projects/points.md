## Punkty i kształty
1. Na dwuwymiarowej przestrzeni chcemy reprezentować punkt (powinien zawierać dwa pola określające współrzędne X i Y)
2. Punkt powinien mieć metodę określającą jego odległość od innego punktu
3. Za pomocą dwóch punktów (określających początek i koniec) chcemy reprezentować linię. Linia powinna mieć metodę określającą jej długość
4. (*) W klasie linii stworzyć dwie metody sprawdzające czy inna linia jest równoległa, a druga czy jest prostopadła do danej.
5. Stworzyć interfejs `HasArea` (ma pole) z metodą `getArea()` oraz `HasCircumference` (ma obwód) `getCircumference()`
6. Stworzyć klasę koła, które zawiera punkt (środek) oraz promień. Zaimplementować dwie metody liczące obwód oraz pole na podstawie stworzonych wcześniej interfejsow. Do obliczania wykorzystaj `Math.PI`.
7. W klasie koła dopisać metodę `boolean hasCommonArea()`, ktora sprawdza czy inne koło ma z nim część wspólną.
8. W klasie koła dopisać metodę, która sprawdza czy punkt zawiera się w kole.
9. Stworzyć klasę prostokąt, która podobnie jak koło implementuje dwa przedstawione wcześniej interfejsy.
10. W klasie prostokąt napisać metodę `boolean hasCommonArea()` która sprawdza czy dany prostokąt ma wspólny obszar z innym prostokątem (czy nachodzą na siebie).
11. Stworzyć klasę wielokąta, która składa się z wielu punktów. Klasa powinna implementować interfejs HasCircumference.

Z gwiazdką (*) oznaczono punkt potencjalnie trudniejszy.
