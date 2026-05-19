require: slotfilling/slotFilling.sc
    module = sys.zb-common

theme: /

    state: Start
        q!: /hello
        q!: /weather
        q!: /currency
        q!: /NoMatch


    state: hello
        intent!: /hello
        a: Привет! 👋 Я бот-помощник.
        a: Могу рассказать о погоде 🌦️ и курсах валют 💱
    
    
    state: weather
        intent!: /weather
        a: Сейчас я не подключен к API погоды 😅
        a: Но обычно погода сегодня хорошая ☀️
    
    
    state: currency
        intent!: /currency
        a: Курсы валют 💱:
        a: USD ≈ 90 RUB
        a: EUR ≈ 98 RUB
    
    
    state: NoMatch
        event!: /NoMatch
        a: 🤔 Я не понял запрос.
        a: Попробуй спросить про погоду или валюту.