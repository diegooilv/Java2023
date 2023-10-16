package Intercambio;

public class ParaDolar {
    private final static float real = (float) 0.1969;
    private final static float euro = (float) 1.0510;
    private final static float libra = (float) 1.2144;
    private final static float iene = (float) 0.0067;
    private final static float franco = (float) 1.1083;
    private final static float canadense = (float) 0.7321;
    private final static float australiano = (float) 0.6294;
    private static float dolar;

    private static  float RealToDolar(float moeda){
            float resposta = moeda * real;
            dolar = (float) resposta;
            return dolar;
    }

    public float RealPraDolar(float moeda){
        return RealToDolar(moeda);
    }

    //

    private static float EuroToDolar(float moeda){
        float resposta = moeda * euro;
        dolar = (float) resposta;
        return dolar;
    }

    public float EuroPraDolar(float moeda){
        return EuroToDolar(moeda);
    }

    //

    private static float LibraToDolar(float moeda){
            float resposta = moeda * libra;
            dolar = (float) resposta;
            return dolar;
    }

    public float LibraPraDolar(float moeda){
        return LibraToDolar(moeda);
    }

    //

    private static float IeneToDolar(float moeda){
            float resposta = moeda * iene;
            dolar = (float) resposta;
            return dolar;
    }

    public float IenePraDolar(float moeda){
        return IeneToDolar(moeda);
    }

    //

    private static float FrancoToDolar(float moeda){
            float resposta = moeda * franco;
            dolar = (float) resposta;
            return dolar;
    }

    public float FrancoPraDolar(float moeda){
        return FrancoToDolar(moeda);
    }

    //

    private static float CanadenseToDolar(float moeda){
            float resposta = moeda * canadense;
            dolar = (float) resposta;
            return dolar;
    }

    public float CanadensePraDolar(float moeda){
        return CanadenseToDolar(moeda);
    }

    //

    private static float AustralianoToDolar(float moeda){
            float resposta = moeda * australiano;
            dolar = (float) resposta;
            return dolar;
    }

    public float AustralianoPraDolar(float moeda){
        return AustralianoToDolar(moeda);
    }
    
}
