package org.less02_server.server.repository;

public interface Repository<T> {
    void save(T text);
    T load();
}
