theme: /

state: Start
    q!: /hello
    q!: /weather
    q!: /currency
    q!: /NoMatch


# Приветствие
state: hello
    a: Привет! 👋 Я бот-помощник.
    a: Могу рассказать о погоде 🌦️ и курсах валют 💱
    a: Просто спроси!


# Погода
state: weather
    intent: weather
    a: Сейчас я не подключен к реальному API погоды 😅
    a: Но обычно можно сказать: "Погода сегодня солнечная ☀️"


# Валюта
state: currency
    intent: currency
    a: Курсы валют на сегодня 💱:
    a: 💵 USD ≈ 90 RUB
    a: 💶 EUR ≈ 98 RUB


# Если ничего не подошло
state: NoMatch
    a: 🤔 Я не совсем понял запрос.
    a: Попробуй спросить про погоду или курс валют.