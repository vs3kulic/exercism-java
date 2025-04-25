public class LogLevels {
    /**
     * Extracts the message from the log line.
     *
     * @param logLine The log line containing the message.
     * @return The message part of the log line.
     * 
     * Example:
     * <pre>
     * String logLine = "[ERROR] 2023-10-01 12:00:00 - An error occurred";
     * String message = message(logLine); // "An error occurred"
     * </pre>
     */
    public static String message(String logLine) {
        int start = logLine.indexOf(":") + 2;
        String message = logLine.substring(start).trim();
        return message;
    }

    /**
     * Extracts the log level from the log line.
     *
     * @param logLine The log line containing the log level.
     * @return The log level in lowercase.
     * 
     * Example:
     * <pre>
     * String logLine = "[ERROR] 2023-10-01 12:00:00 - An error occurred";
     * String level = logLevel(logLine); // "error"
     * </pre>
     */
    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        String level = logLine.substring(start, end).toLowerCase();
        return level;
    }

    /**
     * Reformat the log line to a specific format.
     *
     * @param logLine The log line to reformat.
     * @return The reformatted log line.
     * 
     * Example:
     * <pre>
     * String logLine = "[ERROR] 2023-10-01 12:00:00 - An error occurred";
     * String reformatted = reformat(logLine); // "error: An error occurred"
     * </pre>
     */
    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String message = message(logLine);
        String reformattedMessage = String.format("%s (%s)", message, level);
        return reformattedMessage;
    }
}
