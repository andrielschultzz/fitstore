package br.com.empresa.service;

import br.com.empresa.empresa.model.Marca;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class MarcaService {

    public List<Marca> listarTodas() {
        return Marca.listAll();
    }

    @Transactional
    public Marca save (Marca marca) {
        Marca.persist(marca);
        return marca;
    }
}