package model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter()
public class RankConverter implements AttributeConverter<Akido_tiers_ENUM, String> {

    @Override
    public String convertToDatabaseColumn(Akido_tiers_ENUM akidoTiersEnum) {
        return akidoTiersEnum.toString();
    }

    @Override
    public Akido_tiers_ENUM convertToEntityAttribute(String s) {
        return Akido_tiers_ENUM.valueOf(s);
    }
}
