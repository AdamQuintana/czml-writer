package agi.foundation.compatibility;

import agi.foundation.compatibility.annotations.Internal;

/**
 * Contains methods related to threads.
 */
public final class ThreadHelper {
    @Internal
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeInterruptedException(e);
        }
    }
}
