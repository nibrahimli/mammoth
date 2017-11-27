package com.mammoth.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import com.mammoth.dao.GenericDao;

public class GenericDaoImpl<T, PK> implements GenericDao<T, PK>{

	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> type;

	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

	public void create(T newInstance) {
		getEntityManager().persist(newInstance);
	}

	public void edit(T instance) {
		getEntityManager().merge(instance);
	}
	
	public void remove(T instance) {
        getEntityManager().remove(instance);
    }

    public T find(PK id) {
        return getEntityManager().find(type, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
		CriteriaQuery<T> cq = (CriteriaQuery<T>) getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(type));
        return getEntityManager().createQuery(cq).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<T> findRange(int[] range) {
		CriteriaQuery<T> cq = (CriteriaQuery<T>) getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(type));
        Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @SuppressWarnings("unchecked")
	public int count() {
		CriteriaQuery<T> cq = (CriteriaQuery<T>) getEntityManager().getCriteriaBuilder().createQuery();
        Root<T> rt = cq.from(type);
        cq.select((Selection<? extends T>) getEntityManager().getCriteriaBuilder().count(rt));
        Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * @return the type
	 */
	public Class<T> getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Class<T> type) {
		this.type = type;
	}
    
}
