package br.com.tccengsw_noplastic_api.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@UtilityClass
public class DateUtils {
    
    public static LocalDateTime getDateNow() {
		ZoneId zone = ZoneId.of("America/Sao_Paulo");
		return LocalDateTime.now(zone);
	}

	public static String toString(LocalDateTime dateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return dateTime != null ? dateTime.format(formatter) : EMPTY;
	}
}
