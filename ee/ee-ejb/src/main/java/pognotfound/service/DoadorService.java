package pognotfound.service;

import pognotfound.model.Doador;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

import static javax.ejb.TransactionAttributeType.REQUIRED;

@Stateless
public class DoadorService {

    @Inject
    private EntityManager em;

    @Inject
    private Logger log;

    @TransactionAttribute(REQUIRED)
    public Doador insert(Doador doador){
        log.info("Salvando doador. " + doador);
        em.persist(doador);
        return doador;
    }
}
