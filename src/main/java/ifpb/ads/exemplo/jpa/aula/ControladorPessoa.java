package ifpb.ads.exemplo.jpa.aula;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2017, 11:11:22
 */
@Named
@RequestScoped
public class ControladorPessoa {

    @Inject
    private Repositorio dao;
    
    public List<Pessoa> getPessoas(){
        return dao.todos();
    }
}
