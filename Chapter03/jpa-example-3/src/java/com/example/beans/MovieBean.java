/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beans;

import com.example.entities.Movie;
import com.example.entities.MovieId;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author abdalla
 */
@RequestScoped
@Transactional
public class MovieBean {

    @PersistenceContext(name = "jpa-examplesPU")
    private EntityManager entityManager;

    public void foo() {
Query query = entityManager.createQuery("SELECT m FROM Movie m");
List<Query> results = query.getResultList();
        
        
Movie m = entityManager.find(Movie.class, 1);
    }

    public void insert(Movie movie) {
        entityManager.persist(movie);
    }

    public Movie test() {
        Movie m = entityManager.find(Movie.class, new MovieId("ZZZZ", 0));
        return m;
    }

}
