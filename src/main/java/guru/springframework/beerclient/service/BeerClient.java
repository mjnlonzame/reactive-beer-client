package guru.springframework.beerclient.service;

import guru.springframework.beerclient.model.BeerDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface BeerClient {

    Mono<ResponseEntity> createBeer(BeerDto beerDto);

    Mono<BeerDto> getBeerById(String id, boolean showInventoryOnHand);

    Mono<Pageable> listBeers(int pageNumber, int pageSize, String beerName, String beerStyle, boolean showInventoryOnHand);

    Mono<BeerDto> getBeerByUpc(String upc);

    Mono<ResponseEntity> updateBeerById(String id);

    Mono<ResponseEntity> deleteBeerById(String id);
}
