package com.oct.retailstore.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.oct.retailstore.domain.store.Store;
import com.oct.retailstore.repositories.*;

import java.util.*;

@RestController
@RequestMapping("/api/admin/stores")
@CrossOrigin(origins = "http://localhost:3000")
public class StoreController {
	public static final Logger logger = LoggerFactory.getLogger(StoreRepository.class);
    //@Autowired
   // private StoreService storeService;
    @Autowired
    private StoreRepository storeRepository;

    @PostMapping("/add")
    public ResponseEntity<Store> createStore(@RequestBody Store store) {
      //  storeService.saveStoreWithDetail(store);
    	logger.info(store.toString());
    	storeRepository.save(store);
        return ResponseEntity.ok(store);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Store>> getStores() {
    	List<Store> stores = storeRepository.getAllStores();
        return stores != null ? ResponseEntity.ok(stores) : ResponseEntity.notFound().build();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable Long id) {
       // Store store = storeService.findStoreById(id);
    	Store store = storeRepository.findById(id);
        return store != null ? ResponseEntity.ok(store) : ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable Long id) {
    //    storeService.deleteStore(id);
    	logger.info("Controller deleting " + id);
    	storeRepository.delete(id);
        return ResponseEntity.noContent().build();
    }
}
