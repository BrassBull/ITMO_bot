theme: /

    state: /hello
        intent!: hello
        a: Hello! I am your assistant bot. I can help you with weather forecasts and exchange rates. What would you like to know?

    state: /weather
        intent!: weather
        a: Here is the weather forecast for your area. Partly cloudy skies with a high of 18 degrees today. Would you like a forecast for a specific city?

    state: /currency
        intent!: currency
        a: Here are today's exchange rates. 1 EUR equals 1.09 USD and 0.86 GBP. Which currency pair are you interested in?

    state: /NoMatch
        event!: NoMatch
        a: I am sorry, I did not understand that. I can help you with weather forecasts or exchange rates. Please try asking about one of those.