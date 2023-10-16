package Intercambio;

public class DoDolar {
    private final static float real = (float) 0.1969;
    private final static float euro = (float) 1.0510;
    private final static float libra = (float) 1.2144;
    private final static float iene = (float) 0.0067;
    private final static float franco = (float) 1.1083;
    private final static float canadense = (float) 0.7321;
    private final static float australiano = (float) 0.6294;
    private static float dinheiro;

    private static float DolarToReal(float dolar){
        float resposta = dolar * real;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaReal(float dolar){
        return DolarToReal(dolar);
    }

    //

    private static float DolarToEuro(float dolar){
        float resposta = dolar * euro;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaEuro(float dolar){
        return DolarToEuro(dolar);
    }

    //

    private static float DolarToLibra(float dolar){
        float resposta = dolar * libra;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaLibra(float dolar){
        return DolarToLibra(dolar);
    }

    //

    private static float DolarToIene(float dolar){
        float resposta = dolar * iene;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaIene(float dolar){
        return DolarToIene(dolar);
    }

    //

    private static float DolarToFranco(float dolar){
        float resposta = dolar * franco;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaFranco(float dolar){
        return DolarToFranco(dolar);
    }

    //

    private static float DolarToCanadense(float dolar){
        float resposta = dolar * canadense;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaCanadense(float dolar){
        return DolarToCanadense(dolar);
    }

    //

    private static float DolarToAustraliano(float dolar){
        float resposta = dolar * australiano;
        dinheiro = (float) resposta;
        return dinheiro;
    }

    public float DolarParaAustraliano(float dolar){
         return DolarToAustraliano(dolar);
    }
}
