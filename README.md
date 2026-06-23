# 🪙 VoidRP Mod Sell

> Paper 1.21.1 плагин — продажа предметов из модов через команды с интеграцией в квестовую систему.

![Paper](https://img.shields.io/badge/Paper-1.21.1-00AF54)
![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Vault](https://img.shields.io/badge/depends-Vault-yellow)
![License](https://img.shields.io/badge/license-proprietary-red)

---

## 🗺️ Место в экосистеме

```
  Игрок: /modsell hand  (держит предмет из мода)
        │
  voidrp-mod-sell
        │ Vault API (начислить деньги)
        │ ModSellEvent
        ▼
  voidrp-daily-quests (засчитать прогресс квеста "продай X предметов")
```

Дополняет магазин (ESGUI + gamesync-plugin): если предмет не в магазине, игрок может продать его напрямую через команду.

---

## ✨ Возможности

- **Продажа в руке** — `/modsell hand [количество]`
- **Продажа всего стека** — `/modsell all <namespace:item>`
- **Настраиваемые цены** — прайс-лист в конфиге
- **Квестовая интеграция** — `ModSellEvent` для плагина квестов
- **Лимиты продаж** — максимум предметов в сутки на игрока
- **Cooldown** — интервал между продажами (антиспам)

---

## 📋 Требования

| Компонент | Версия |
|---|---|
| Paper / Mohist | 1.21.1 |
| Java | 21 |
| Vault | обязательно |

---

## 🚀 Сборка и установка

```bash
cd voidrp_mod_sell
./gradlew shadowJar
# → build/libs/voidrp-mod-sell-*.jar
```

1. Скопировать jar в `plugins/`
2. Перезапустить сервер
3. Заполнить `plugins/VoidRpModSell/items.yml`

---

## ⚙️ Конфигурация

```yaml
# items.yml
items:
  "create:andesite_alloy":
    price: 500
    daily_limit: 1000
  "thermal:rf_coil":
    price: 2500
    daily_limit: 200

cooldown_seconds: 5
```

---

## 🛠️ Команды

| Команда | Описание |
|---|---|
| `/modsell hand` | Продать предмет в руке |
| `/modsell hand <кол-во>` | Продать N предметов в руке |
| `/modsell all` | Продать все подходящие предметы |
| `/modsell prices` | Список цен |

---

## 🔗 Связанные репозитории

| Репо | Связь |
|---|---|
| [voidrp-daily-quests](https://github.com/VOIDRP-MINECRAFT/voidrp-daily-quests) | Квесты на продажу предметов |
| [voidrp-gamesync-plugin](https://github.com/VOIDRP-MINECRAFT/voidrp-gamesync-plugin) | Основной магазин модовых предметов |

---

<div align="center">
<a href="https://void-rp.ru">🌐 Сайт</a> ·
<a href="https://github.com/VOIDRP-MINECRAFT">🏠 Организация</a>
</div>
