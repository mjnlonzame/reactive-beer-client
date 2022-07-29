package guru.springframework.beerclient.service;

import guru.springframework.beerclient.model.BeerDto;
import guru.springframework.beerclient.model.BeerPagedList;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface BeerClient {

    Mono<ResponseEntity> createBeer(BeerDto beerDto);

    Mono<BeerDto> getBeerById(String id, boolean showInventoryOnHand);

    Mono<BeerPagedList> listBeers(Integer pageNumber, Integer pageSize, String beerName, String beerStyle, Boolean showInventoryOnHand);

    Mono<BeerDto> getBeerByUpc(String upc);

    Mono<ResponseEntity> updateBeerById(String id);

    Mono<ResponseEntity> deleteBeerById(String id);
}
