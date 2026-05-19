require: slotfilling/slotFilling.sc
    module = sys.zb-common

theme: /



    state: hello
        q!: *(привет|здравствуй|hello|hi|добрый день|добрый вечер*)*
        a: Привет! 👋 Я бот-помощник.
        a: Могу рассказать о погоде 🌦️ и курсах валют 💱
    
    
    state: weather
        q!: *(погода|какая погода|что с погодой|прогноз|прогноз погоды|weather*)*
        a: Сейчас я не подключен к API погоды 😅
        a: Но обычно погода сегодня хорошая ☀️
    
    
    state: currency
        q!: *(курс валют|доллар|евро|валюта|курс доллара|курс евро|currency*)*
        a: Курсы валют 💱:
        a: USD ≈ 90 RUB
        a: EUR ≈ 98 RUB
    
    
    state: NoMatch
        event!: noMatch
        a: 🤔 Я не понял запрос.
        a: Попробуй спросить про погоду или валюту.