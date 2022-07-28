package guru.springframework.beerclient.service;

import guru.springframework.beerclient.model.BeerDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public class BeerClientImpl implements BeerClient {
    @Override
    public Mono<ResponseEntity> createBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public Mono<BeerDto> getBeerById(String id, boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public Mono<Pageable> listBeers(int pageNumber, int pageSize, String beerName, String beerStyle, boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public Mono<BeerDto> getBeerByUpc(String upc) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> updateBeerById(String id) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> deleteBeerById(String id) {
        return null;
    }
}
