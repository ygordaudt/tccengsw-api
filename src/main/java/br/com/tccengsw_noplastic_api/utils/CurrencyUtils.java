package br.com.tccengsw_noplastic_api.utils;

import lombok.experimental.UtilityClass;

import java.text.NumberFormat;
import java.util.Locale;

@UtilityClass
public class CurrencyUtils {
    
    public static String converterParaMonetario(double valor) {
		Locale ptBR = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(ptBR);
		return nf.format(valor);
	}

}
