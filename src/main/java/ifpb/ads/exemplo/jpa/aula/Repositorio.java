package ifpb.ads.exemplo.jpa.aula;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2017, 11:10:12
 */
@Stateless
public class Repositorio {

    @PersistenceContext
    private EntityManager em;

    public List<Pessoa> todos() {
        return em.createQuery("Select p From Pessoa p", Pessoa.class)
                .getResultList();
    }
}
