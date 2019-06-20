# org.ynov.info.b1.LaboJpa

## YNOV INFO B1 - TP du 21/06/2019

### Prérequis

1. Installer [Lombok](https://projectlombok.org/setup/eclipse) sur éclipse entreprise.
2. Installer [PostMan](https://www.getpostman.com/products) ou n'importe quel autre client REST.
3. Lancer le projet avec le goal "spring-boot:run"
4. Dans PostMan, ouvrir l'url GET <http://localhost:9090/data>

Le resultat devrait être le suivant :

```json
{
    "_links": {
        "avatars": {
            "href": "http://localhost:9090/data/avatars{?page,size,sort}",
            "templated": true
        },
        "equipements": {
            "href": "http://localhost:9090/data/equipements{?page,size,sort}",
            "templated": true
        },
        "profile": {
            "href": "http://localhost:9090/data/profile"
        }
    }
}
```

### TP

1. Dans le package **model**, implémenter le MCD suivant :

![MCD]()
