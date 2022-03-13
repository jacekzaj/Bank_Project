package org.partbiz.repository;
import org.partbiz.Client;

import java.util.List;
import java.util.Objects;
import java.util.NoSuchElementException;

public class InMemoryClientRepository implements ClientRepository{
    private List<Client> clients;

    public InMemoryClientRepository(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public Client findByEmaila(String email) {
        return clients.stream()
                .filter(client -> Objects.equals(client.getEmail(),email))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(
                String.format("Client with following email: %s not found!", email)
                ));
    }
}
