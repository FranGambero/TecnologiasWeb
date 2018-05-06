/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import twitter.entity.Usuario;

/**
 *
 * @author Takox
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "TwitterFranGambero-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public Usuario buscarNombre(String name){
        Query q = this.em.createQuery("select u from Usuario u where u.nombre like :str");
        q.setParameter("str", "%" + name + "%");
        return (Usuario)q.getResultList().get(0);
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
