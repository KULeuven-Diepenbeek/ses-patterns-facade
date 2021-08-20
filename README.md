# SES Patterns: Facade

Oefening voor https://kuleuven-diepenbeek.github.io/ses-course/

## Opgave

We modelleren een dierentuin, waarvan een `be.kuleuven.ses.facade.animals.Chicken` een gegeven klasse is. Elk dier willen we voederen met een variant van een "eet" methode. Let op! Sommige dieren vereisten veel meer aandracht (lees: complexiteit), die we willen wegwerken met het introduceren van een Facade. Bijvoorbeeld: 

- Een eekoorn gebruikt `knabbel(boolean isNootje)`
- Een varken gebruikt `freet(int hoeveelheidModder, float gewichtInKg)`
- ...

Dat betekent dat je niet zomaar een algemene interface kan maken (niet elk dier gebruikt dezelfde parameters/methode) en een "Facade klasse" nodig hebt, zoals bovenstaand voorbeeld.

Voeg klasses `be.kuleuven.ses.facade.animals.Cow` en `Cat` toe, geef deze ook eten, en verberg dan het voederen in een aparte interface. 
