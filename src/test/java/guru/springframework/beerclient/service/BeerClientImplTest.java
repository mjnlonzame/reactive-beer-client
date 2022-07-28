package guru.springframework.beerclient.service;

import guru.springframework.beerclient.config.WebClientConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

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