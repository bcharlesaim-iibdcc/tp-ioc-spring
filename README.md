# TP1 IOC Spring

## Partie 1 : Injection de dépendances avec Spring IOC

### Objectif

L'objectif de cette première partie était de comprendre le principe de l'Inversion de Contrôle (IOC) et de l'Injection de Dépendances (Dependency Injection) à travers plusieurs approches, jusqu'à l'utilisation du Framework Spring.

## Travail réalisé

Au cours de cette première partie, nous avons :

- créé l'interface `IDao` avec la méthode `getData()`;
- développé une implémentation `DaoImpl` ;
- créé l'interface `IMetier` avec la méthode `calcul()` ;
- développé la classe `MetierImpl` utilisant un couplage faible ;
- réalisé l'injection des dépendances par instanciation statique ;
- réalisé l'injection des dépendances par instanciation dynamique (réflexion Java) ;
- mis en œuvre l'injection des dépendances avec Spring IOC en configuration XML ;
- mis en œuvre l'injection des dépendances avec Spring IOC à l'aide des annotations.

## Fonctionnalités développées

- Couplage faible entre les couches DAO et Métier.
- Injection des dépendances par plusieurs méthodes.
- Configuration Spring avec fichier XML.
- Configuration Spring avec annotations.
- Vérification du fonctionnement de chaque approche grâce aux classes de test.

## Résultats obtenus

Toutes les versions développées fonctionnent correctement. Les dépendances sont injectées selon la méthode utilisée (instanciation directe, réflexion Java, Spring XML et Spring Annotations), tout en conservant un faible couplage entre les composants.

## Conclusion

Cette première partie a permis de comprendre les principes fondamentaux de l'Inversion de Contrôle (IOC) et de l'Injection de Dépendances. L'utilisation du Framework Spring simplifie considérablement la gestion des objets et améliore la modularité, la réutilisabilité et la maintenabilité des applications Java.

