package model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter()
public enum Akido_tiers_ENUM implements AttributeConverter<Akido_tiers_ENUM, Integer> {
    NOBELT(0), WHITE(1), YELLOW(2), ORANGE(3), GREEN(4), BLUE(5),BROWN(6), RED(7), BLACK(8);

    private int rank;

    Akido_tiers_ENUM(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public static Akido_tiers_ENUM rankToEnum(int rank) {
        for (Akido_tiers_ENUM akidoTiersEnum : Akido_tiers_ENUM.values()) {
            if (akidoTiersEnum.getRank() == rank) {
                return akidoTiersEnum;
            }
        }
        return null;
    }

    @Override
    public Integer convertToDatabaseColumn(Akido_tiers_ENUM akidoTiersEnum) {
        return akidoTiersEnum.getRank();
    }

    @Override
    public Akido_tiers_ENUM convertToEntityAttribute(Integer integer) {
        return rankToEnum(integer);
    }
}
