package pognotfound.service;

import org.infinispan.Cache;
import org.infinispan.manager.CacheContainer;
import pognotfound.model.Doador;

import javax.annotation.Resource;
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

    @Resource(lookup = "java:jboss/infinispan/container/ejb")
    private org.jboss.as.clustering.infinispan.DefaultCacheContainer cacheContainer;

//    @Inject
    private Cache<String, Object> cache;

    @TransactionAttribute(REQUIRED)
    public Doador insert(Doador doador) {
        cache.toString();
        log.info("Salvando doador. " + doador);
        em.persist(doador);
        return doador;
    }
}
