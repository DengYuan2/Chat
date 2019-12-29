package com.chat.chat.org.n3r.idworker;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
