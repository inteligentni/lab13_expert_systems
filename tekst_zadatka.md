# Zadatak 2 - ES za izračunavanje penzije

Implementirati u Drools Expert okruženju ES za određivanje penzije kod budućih penzionera.

**Ekspert:** Radnik PIO fonda
**Korisnik:** Budući penzioner

**ES menja eksperta**

ES postavlja sledeća pitanja (i očekuje sledeće odgovore):

1. Koliko u ovom trenutku imate godina starosti? (unosi se ceo broj)

2. Koliko u ovom trenutku imate godina staža? (unosi se ceo broj)

3. Kog ste pola? (Muški ; Ženski)

4. Da li imate neki zvanično potvrđen invaliditet? (Da ; Ne)

Do rešenja koje ES pruža se dolazi u nekoliko koraka (i korisniku je, na kraju, potrebno prikazati zaključke sva tri koraka).

1. Prvi korak čini određivanje starosne granice za odlazak u penziju (63 ili 65 u zavisnosti od pola).

2. Drugi korak čini određivanje podobnosti za penziju – da li korisnik može da ode u penziju ili ne, i kakva je penzija u pitanju (nema pravo na penziju, puna penzija, prevremena puna penzija, starosna penzija, invalidska penzija).

3. Treći korak čini određivanje procenta penzije u odnosu na prosečnu visinu plate.

Pravila koja su identifikovana su:

1. Ako je korisnik ženskog pola, starosna granica za odlazak u penziju je 63 godine.

2. Ako je korisnik muškog pola, starosna granica za odlazak u penziju je 65 godina.

3. Ako korisnik ima godina starosti jednako ili više od odgovarajuće starosne granice i ima 40 ili više godina staža, onda ostvaruje pravo na punu penziju.

4. Ako korisniku fali manje od 5 godina do odgovarajuće starosne granice i ima 40 ili više godina staža, onda ostvaruje pravo na prevremenu punu penziju.

5. Ako korisniku fali 5 ili više godina do odgovarajuće starosne granice i ima manje od 40 godina staža a nema invaliditet, onda nema pravo na penziju.

6. Ako korisnik ima godina starosti jednako ili više od odgovarajuće starosne granice i ima manje od 40 godina staža, onda ostvaruje pravo na starosnu penziju.

7. Ako korisniku fali 5 ili više godina do odgovarajuće starosne granice i ima manje od 40 godina staža, ali ima neki invaliditet, onda ostvaruje pravo na invalidsku penziju.

8. Ako korisnik ima punu penziju ili prevremenu punu penziju, procenat penzije je 70% (od visine njegove/njene prosečne plate u toku radnog veka).

9. Ako korisnik ima starosnu penziju, procenat penzije se računa po formuli **broj godina staža * 70.0 / 40.0 procenata** .

10. Ako korisnik ima invalidsku penziju, procenat penzije je 50%.

ES ne treba da ima GUI, već se pokreće iz „main“ metode. Odgovori na pitanja se unose direktno u okviru main metode. Rešenja se korisniku ispisuju na ekranu tj. konzoli posle zaključivanja, direktno izmain metode. Postaviti da je korisnik kao činjenice (odgovore na pitanja) uneo da ima 64 godine, da je muškog pola, da ima 40 godina radnog staža i da nema invaliditet. Pokrenuti ES i ispisati rešenje na ekranu.