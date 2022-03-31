# SES Patterns: Facade

Oefening voor https://kuleuven-diepenbeek.github.io/ses-course/

## Opgave


Stel dat wij een dierentuin bezoeken en we zelf de dieren willen eten geven. Probleem: elk dier heeft zijn eigen noden:

- Een eekoorn eet nootjes
- Een varken eet modder (en alles wat het ziet) afhankelijk van zijn gewicht
- Een koe eet (te veel) gras
- Een kat eet alleen maar vers vlees
- ...

We moeten dus een simpelere, higher-level interface verzinnen om dieren eten te geven (`eet()`) dat de onderliggende complexiteit van de subsystemen verbergt. 

Dat wil zeggen: in een dierentuin mogen we dieren **nooit zelf** eten geven! We vragen dat aan een oppasser. Die weet bij welk dier hij of zij wat precies moet doen. De oppasser is een _facade_. 

In de huidige code geven wij de kip rechtstreeks eten. Dat mag dus NIET. Verander de code zodat:

1. Bovenstaande dieren worden toegevoegd;
2. Wij niet meer rechtstreeks aan de kip kunnen, maar we de oppasser moeten vragen "eten te geven" (`Zookeeper` is een nieuwe klasse).

Test de applicatie output cmd-line met `./gradlew run`.

### Tips

- Wat is de interface van de `Zookeper`? Met andere woorden, welke methode ga je daar aanmaken?
- Waar moet die `Chicken` instance in `Zoo` naar toe? Daar blijven staan? 
- Wat indien ik de oppasser het varken wil laten eten geven? Hoe vraag ik de oppasser iets anders eten te geven?
