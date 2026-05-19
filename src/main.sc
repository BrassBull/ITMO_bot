theme: /


    state: /hello
        intent: hello
        a: Привет! 👋 Я бот-помощник.
        a: Могу рассказать о погоде 🌦️ и курсах валют 💱
        a: Просто спроси!
    
    
    state: /weather
        intent: weather
        a: Сейчас я не подключен к реальному API погоды 😅
        a: Но обычно можно сказать: "Погода сегодня солнечная ☀️"
    
    
    state: /currency
        intent: currency
        a: Курсы валют на сегодня 💱:
        a: 💵 USD ≈ 90 RUB
        a: 💶 EUR ≈ 98 RUB
    
    
    state: /NoMatch
        event: noMatch
        a: 🤔 Я не совсем понял запрос.
        a: Попробуй спросить про погоду или курс валют.        