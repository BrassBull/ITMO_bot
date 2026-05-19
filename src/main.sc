theme: /
{
    state: /hello
    {
        intent!: Hello
        a: Hello! I'm your assistant bot. I can help you with weather forecasts and exchange rates. What would you like to know?
    }

    state: /weather
    {
        intent!: WeatherForecast
        a: Here is the weather forecast for your area. It looks like partly cloudy skies with a high of 18°C today. Would you like a more specific forecast?
    }

    state: /currency
    {
        intent!: ExchangeRate
        a: Here are today's exchange rates. 1 EUR equals 1.09 USD and 0.86 GBP. Which currency pair are you interested in?
    }

    state: /NoMatch
    {
        event!: noMatch
        a: I am sorry, I did not understand that. I can help you with weather forecasts or exchange rates. Please try asking about one of those.
    }
}