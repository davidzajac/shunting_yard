package constants;

import patterns.IdentifierPattern;

/**
 * Holds the name and value of a predifined constant
 */
public class ConstantClass implements Constant {

    private final String name;
    private final Number value;

    /**
     * @param name - the contant's name
     * @param value - the constant's value
     */
    ConstantClass(String name, Number value) throws IllegalArgumentException{
        if ( IdentifierPattern.test(name) != name.length()) {
            throw new IllegalArgumentException(messages.THE_NAME_MUST_ADHERE_TO_IDENTIFER_PATTERN_RULES);
        }
        if (value == null) {
            throw new IllegalArgumentException(messages.THE_VALUE_ARGUMENT_CAN_NOT_BE_NULL);
        }
        this.name = name;
        this.value = value;
    }

    /**
     * @return the constant's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the constant's value
     */
    public Object getValue() {
        return value;
    }

    public String toString(){
        return String.format("%s=%s", name, value);
    }
}
