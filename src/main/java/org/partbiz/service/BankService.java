package org.partbiz.service;

import org.partbiz.Client;
import org.partbiz.repository.ClientRepository;

public class BankService {
    private final ClientRepository clientRepository;

    public BankService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public void save(Client client) {
        clientRepository.save(client);
    }

    public Client findByEmail(String email) {
        return clientRepository.findByEmaila(email);
    }
}
