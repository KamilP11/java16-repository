package pl.mpas.advanced_programming.generic;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private String maybeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = validate(maybeName);
        this.maybeIncome = validate(maybeIncome);
        this.hugeNumber = validate(hugeNumber);
    }

    private String validateString (String toCheck){
        if (toCheck == null){
            throw new RuntimeException("Cannot be null!!!");
        }
        return toCheck;
    }

    private Double validateDuble (Double toCheck){
        if (toCheck == null){
            throw new RuntimeException("Cannot be null!!!");
        }
        return toCheck;
    }

    private <T> T validate (T toCheck){
        if (toCheck == null){
            throw new RuntimeException("Cannot be null!!!");
        }
        return toCheck;
    }
}
