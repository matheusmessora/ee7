package pognotfound.controller;

import pognotfound.model.Doador;
import pognotfound.model.TipoSanguineo;
import pognotfound.service.DoadorService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

@Named
@RequestScoped
public class DoadorController {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private DoadorService service;

    private Doador doador;

    @Produces
    @Named
    public Doador getNewDoador() {
        return doador;
    }

    @Produces
    @Named
    public List<Doador> getDoadorList() {
        return em.createNamedQuery(Doador.DOADOR_FIND_ALL, Doador.class).getResultList();
    }

    @Produces
    @Named
    public TipoSanguineo[] getTipoSanguineoList() {
        return TipoSanguineo.values();
    }

    public void cadastrar() throws Exception {
        log.info("Registering " + doador);
        service.insert(doador);
        initNewDoador();
    }

    @PostConstruct
    public void initNewDoador() {
        doador = new Doador();
    }
}
