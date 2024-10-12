package com.oct.retailstore.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import jakarta.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.oct.retailstore.domain.store.Store;

@Repository
public class StoreRepository {
	public static final Logger logger = LoggerFactory.getLogger(StoreRepository.class);
	
	//@Autowired
	@PersistenceContext
    private EntityManager entityManager;

	@Transactional
    public void save(Store store) {
		entityManager.persist(store);      
    }
	    
    @Transactional
    public Store findById(Long id) {
		Store store = entityManager.find(Store.class, id);
        return store;
    }

    @Transactional
    public void delete(Long id) {
        Store store = findById(id);
        if (store != null) {
            entityManager.remove(store);
        }
    }

    @Transactional
    public List<Store> getAllStores() {
    	//Native Query
    	//List<Store> stores = (List<Store>)entityManager
    		// .createNativeQuery("SELECT * FROM store", Store.class).getResultList();
        
    	//JPQL Query
    	List<Store> stores = entityManager.createQuery("SELECT s FROM Store s", Store.class)
    			.getResultList();   	
    	//Criteria Query
    	// Step 1: Create a CriteriaBuilder from EntityManager
    /*    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        
        // Step 2: Create a CriteriaQuery object for the Store entity
        CriteriaQuery<Store> criteriaQuery = criteriaBuilder.createQuery(Store.class);
        
        // Step 3: Define the entity from which to select data
        Root<Store> storeRoot = criteriaQuery.from(Store.class);       
        // Step 4: Specify the query result - use where() clause where needed
        // Example: cq.select(employee).where(cb.equal(employee.get("department")
         // 	.get("name"), departmentName)); 
       // criteriaQuery.select(storeRoot);       
        // Step 5: Create a query and fetch results
        List<Store> stores = entityManager.createQuery(criteriaQuery).getResultList();
        */
        return stores;
    }
    
}
