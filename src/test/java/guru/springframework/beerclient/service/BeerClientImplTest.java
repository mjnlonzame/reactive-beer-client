package guru.springframework.beerclient.service;

import guru.springframework.beerclient.config.WebClientConfig;
import guru.springframework.beerclient.model.BeerPagedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class BeerClientImplTest {
    BeerClientImpl beerClient;

    @BeforeEach
    void setUp() {
        beerClient = new BeerClientImpl(new WebClientConfig().webClient());
    }

    @Test
    void createBeer() {
    }

    @Test
    void getBeerById() {
    }

    @Test
    void listBeers() {
        Mono<BeerPagedList> beerPagedListMono = beerClient.listBeers(0, 0, null, null, true);
        BeerPagedList pagedList = beerPagedListMono.block();
        assertNotNull(pagedList);
        assertTrue(pagedList.getContent().size() > 0);
    }

    @Test
    void listBeersPageSize10() {
        Mono<BeerPagedList> beerPagedListMono = beerClient.listBeers(2, 10, null, null, true);
        BeerPagedList pagedList = beerPagedListMono.block();
        assertNotNull(pagedList);
        assertTrue(pagedList.getContent().size() == 10);
    }


    @Test
    void listBeersNoRecords() {
        Mono<BeerPagedList> beerPagedListMono = beerClient.listBeers(10, 20, null, null, true);
        BeerPagedList pagedList = beerPagedListMono.block();
        assertNotNull(pagedList);
        assertTrue(pagedList.getContent().size() == 0);
    }

    @Test
    void getBeerByUpc() {
    }

    @Test
    void updateBeerById() {
    }

    @Test
    void deleteBeerById() {
    }
}