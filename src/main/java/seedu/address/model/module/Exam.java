package seedu.address.model.module;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Exam {
    // todo change message constraints
    public static final String MESSAGE_CONSTRAINTS = "Addresses can take any values, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    // todo change regex
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final LocalDateTime examDate;

    /**
     * Constructs an {@code Assignment}.
     *
     * @param examDate A valid exam date and time.
     */
    public Exam(LocalDateTime examDate) {
        checkArgument(isValidExam(examDate.toString()), MESSAGE_CONSTRAINTS);
        this.examDate = examDate;
    }

    /**
     * Returns true if a given string is a valid assignment.
     */
    public static boolean isValidExam(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return "Exam is on: " + examDate.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Assignment // instanceof handles nulls
                && examDate.equals(((Exam) other).examDate)); // state check
    }

    @Override
    public int hashCode() {
        return examDate.hashCode();
    }
}
