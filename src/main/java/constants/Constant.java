package constants;

public interface Constant {
    /**
     * @return the constant's name
     */
    String getName();

    /**
     * @return the constant's value
     */
    Object getValue();

    @Override
    String toString();
}
