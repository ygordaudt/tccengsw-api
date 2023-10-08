package br.com.gestao_eventos.tccengsw_noplastic.converter;

import javax.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, String> {

    private static final String SIM = "S";
    private static final String NAO = "N";

    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return Boolean.TRUE.equals(attribute) ? SIM : NAO;
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return SIM.equals(dbData) ? Boolean.TRUE : Boolean.FALSE;
    }
}
