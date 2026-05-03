# 🏠 LAB 2 – Calculateur d’Impôts Locaux

Application Android développée dans le cadre du cours  
**Programmation Mobile – Android avec Java**

---

## 📱 Description

Cette application permet de calculer le montant total des impôts locaux d’une habitation en fonction de :

- ✅ La surface (en m²)
- ✅ Le nombre de pièces
- ✅ La présence d’une piscine

L’utilisateur saisit les informations, puis l’application calcule et affiche :

- Impôt de base
- Impôt supplémentaire
- Impôt total

---

## 🧮 Méthode de calcul

| Élément | Formule |
|---------|----------|
| Impôt de base | `Surface × 2` |
| Impôt supplémentaire | `Nombre de pièces × 75` |
| Supplément piscine | `+ 100` si cochée |
| ✅ Total | Somme des trois |

### 🔎 Exemple :

- Surface : 120 m²  
- Pièces : 4  
- Piscine : ❌  
