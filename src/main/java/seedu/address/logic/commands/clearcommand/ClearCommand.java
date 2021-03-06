package seedu.address.logic.commands.clearcommand;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;
import seedu.address.model.RemindMe;

/**
 * Clears RemindMe.
 */
public class ClearCommand extends Command {
    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_USAGE = "Command: " + COMMAND_WORD + "\n"
            + "Person: clear n/\n"
            + "Module: clear m/\n"
            + "Event: clear g/\n"
            + "RemindMe: clear";

    public static final String MESSAGE_SUCCESS = "RemindMe is cleared!";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setRemindMe(new RemindMe());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
