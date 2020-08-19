package xyz.edu;

import java.util.logging.Logger;

public class BooleanOperations {
    private static final Logger LOGGER = Logger.getLogger(BooleanOperations.class.getName());

    public Boolean firstParam, secondParam;

    /**
     * Constructor
     * @param firstParam    - first boolean value
     * @param secondParam   - second boolean value
     */
    public BooleanOperations(Boolean firstParam, Boolean secondParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }

    /**
     * Implementation conjunction operation
     */
    public Boolean conjunction() {
        LOGGER.info("Started conjunction operation");
        if (this.firstParam == null || this.secondParam == null) return null;
        return this.firstParam && this.secondParam;
    }

    /**
     * Implementation disjunction operation
     */
    public Boolean disjunction() {
        LOGGER.info("Started disjunction operation");
        if (this.firstParam == null && this.secondParam == null) return null;
        if (this.firstParam == null) return secondParam;
        if (this.secondParam == null) return firstParam;
        return this.firstParam || this.secondParam;
    }
}
