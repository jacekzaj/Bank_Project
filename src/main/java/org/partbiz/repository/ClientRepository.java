package org.partbiz.repository;

import org.partbiz.Client;

public interface ClientRepository {
    void save(Client client);
    Client findByEmaila(String email);
}
