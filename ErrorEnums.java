package enums;

import java.util.HashMap;
import java.util.Objects;
import java.util.logging.Handler;

public enum ErrorEnums {


    MATCH_MONTHS_TO_NUMBERS(203, "Oops, wrong move"),
    MATCH_SEASONS_TO_NUMBERS(303, "You're doing something wrong"),
    MATCH_MONTHS_TO_SEASONS(207, "Something went wrong");

    private final Integer errorCode;
    private final String errorMessage;


    ErrorEnums(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;

    }

    public static ErrorEnums getErrorEnumsByErrorCode(Integer code) {
        ErrorEnums[] values = ErrorEnums.values();
        for (ErrorEnums errorEnums : values) {
            if (Objects.equals(code, errorEnums.errorCode))
                return errorEnums;
        }
        return null;
    }

}

