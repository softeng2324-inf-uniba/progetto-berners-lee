package it.uniba.app.commands;

import it.uniba.app.utils.Strings;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Classe ExitCommand
 * << Boundary >>
 *
 * <p>Classe che gestisce l'uscita dell'applicazione.</p>
 */
public final class ExitCommand {
    private ExitCommand() {
    }

    /**
     * Esegue il comando.
     */
    public static void run() {
        System.out.println(Strings.ExitCommand.EXIT_CONFIRMATION);
        Scanner keyboard = new Scanner(System.in, StandardCharsets.UTF_8);
        final String command = keyboard.nextLine().trim();
        if (command.equalsIgnoreCase("s")) {
            System.exit(0);
        }
    }
}
