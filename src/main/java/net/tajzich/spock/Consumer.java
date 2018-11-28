package net.tajzich.spock;

public class Consumer {

    public boolean consume(Exception exception) {

        if (exception instanceof IllegalArgumentException) {
            return true;
        }

        return false;
    }
}
